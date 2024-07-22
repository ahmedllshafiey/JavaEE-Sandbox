package Filters;

import java.io.IOException;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Mode implements Filter {

    private static final boolean debug = true;

    private FilterConfig filterConfig = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        if (debug) {
            log("Mode: Initializing filter");
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Mode Filter: Before doFilter");
        chain.doFilter(request, response);
        System.out.println("Mode Filter: After doFilter");
    }

    @Override
    public void destroy() {
    }

    private void log(String msg) {
        filterConfig.getServletContext().log(msg);
    }
}
