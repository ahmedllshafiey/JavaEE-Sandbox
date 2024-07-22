# Java EE Example Project

This project is a demonstration of various Java EE (Enterprise Edition) components, including Servlets, Filters, and JSP. It showcases basic functionalities such as handling HTTP requests, using cookies, and interacting with servlets and filters.

## Project Structure

- **`src/`**: Contains the Java source code.
  - **`Web/`**: Contains servlets and utility classes.
    - `Context.java`: Servlet that demonstrates servlet configuration and context attributes.
    - `Cookies.java`: Servlet that handles cookies and displays user age.
    - `Filter.java`: Basic servlet example.
    - `Person.java`: Simple POJO class used in servlets.
    - `Servlet.java`: Servlet that manages session and context attributes, counts visits.
  - **`Filters/`**: Contains filter implementations.
    - `Logger.java`: Filter that logs HTTP request methods.
    - `Mode.java`: Filter that demonstrates request and response processing.
    - `Way.java`: Filter that demonstrates basic filter functionality.
  - **`index.jsp`**: JSP page with forms and basic interaction.

## Setup

1. **Clone the Repository**

   ```bash
   git clone <repository-url>
   ```

2. **Build and Deploy**

   Use an IDE like Eclipse or IntelliJ IDEA, or use Maven/Gradle to build and deploy the project. Ensure you have a compatible application server such as Apache Tomcat.

3. **Access the Application**

   - Access the application by navigating to `http://localhost:8080/EEApplication/` in your browser.
   - Forms on the JSP page interact with the `Servlet` and `Cookies` servlets.
   - Filters are applied to all requests as defined in the `web.xml` configuration.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contributing

Contributions are welcome. Please fork the repository and submit a pull request with your changes.

## Contact

For questions or comments, please reach out to [ahmedll.shafiey@gmail.com].
