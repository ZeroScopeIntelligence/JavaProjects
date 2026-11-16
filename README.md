# Java Projects

A collection of Java projects and experiments focused on learning and building practical applications. This repository currently includes a lightweight HTTP server example using Java's built-in HTTP server and HTTP client APIs.

## Projects

### HTTP Server

The `http.java` example starts an HTTP server on port `8080` and registers a handler for the `/test` route. The handler responds with a simple text message and an HTTP `200` status.

The example also creates an HTTP client and sends a GET request to a local URL, then prints the response status, headers, and body.

> **Note:** The server registers `/test`, while the sample client requests `/api`. To receive the handler's response, change the client URL to `http://localhost:8080/test`.

## Requirements

- Java Development Kit (JDK) installed.
- Visual Studio Code (VS Code), or another Java-compatible IDE.
- The Java Extension Pack for VS Code (recommended when using VS Code).

Check your Java installation:

```bash
java -version
javac -version
```

## Running the HTTP Server Example

1. Clone or download this repository.
2. Open the project folder in VS Code.
3. Make sure the JDK is installed and the Java Extension Pack is enabled.
4. Open `http.java`.
5. Update the client URL to `http://localhost:8080/test` as noted above.
6. Run the `main` method from VS Code.

You can also compile and run it from a terminal:

```bash
javac http.java
java http
```

The server listens on port `8080`. Visit [http://localhost:8080/test](http://localhost:8080/test) in a browser while the program is running to see the response.

## Learning Goals

- Understand the basics of HTTP servers and clients.
- Explore request handlers, routes, response codes, and headers.
- Practice Java networking and application structure.

## Contributing

This repository is a learning space for Java development. Suggestions, improvements, and additional project ideas are welcome.

## License

Unless otherwise specified, the projects in this repository are provided under the repository's stated license. Please review the license file before reusing or distributing the code.
