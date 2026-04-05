package com.peddinenis.mcphttpserver.tool;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.ai.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Service;

/**
 * Provides MCP-exposed tools related to the current project.
 * <p>
 * This service contains methods that can be invoked through the MCP server to
 * return information about the Java Spring Boot MCP assistant application.
 */
@Service
public class ProjectMcpTools {

    /**
     * Returns a summary of the project in response to a user question.
     *
     * @param question the user question about the project
     * @return a descriptive summary of the project's current capabilities
     */
    @McpTool(description = "Get information about the Java Spring MCP agent assistant project")
    public String getProjectInfo(
            @McpToolParam(description = "User question about the project", required = true)
            String question) {

        return """
                This project is a Java Spring Boot AI assistant that currently supports:
                1. Standard chat using Spring AI
                2. RAG with SimpleVectorStore
                3. File-based document ingestion from the docs folder
                4. Citation-based grounded responses
                5. Automatic routing between chat, RAG, and tools
                6. MCP integration over HTTP using a separate MCP server
                """;
    }
}
