package Filters;

import java.io.IOException;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter(filterName = "Logger", urlPatterns = {"/*"})
public class Logger implements Filter {

    private static final boolean debug = true;

    private FilterConfig filterConfig = null;

    public Logger() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("Request Method: " + req.getMethod());
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
        if (filterConfig != null && debug) {
            log("Logger: Initializing filter");
        }
    }

    @Override
    public void destroy() {
    }

    private void log(String msg) {
        filterConfig.getServletContext().log(msg);
    }
}
