package com.peddinenis.mcphttpserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the MCP HTTP Server Spring Boot application.
 * <p>
 * This class boots the application context and starts the embedded web server
 * for the MCP HTTP server.
 */
@SpringBootApplication
public class McpHttpServerApplication {

    /**
     * Starts the Spring Boot application.
     *
     * @param args command-line arguments passed during application startup
     */
    public static void main(String[] args) {
        SpringApplication.run(McpHttpServerApplication.class, args);
    }
}
