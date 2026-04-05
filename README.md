# MCP HTTP Server (Spring AI)

A Spring Boot–based **Model Context Protocol (MCP) HTTP Server** that exposes tools over HTTP using Spring AI.

## 🚀 Overview

This project implements an MCP server using:

- Spring Boot 3.x
- Spring AI MCP Server (WebMVC)
- Streamable HTTP protocol

It exposes tools that can be consumed by an MCP client (e.g., your `mcp-agent-assistant-spring` app).

---

## 🧠 Features

- MCP tool exposure using `@McpTool`
- Streamable HTTP endpoint (`/mcp`)
- Modular tool design
- Easy integration with Spring AI clients

---

▶️ Running the Server

mvn clean install
mvn spring-boot:run

http://localhost:8081/mcp


🔧 Example Tool

@McpTool(description = "Get project info")
public String getProjectInfo(String question) {
    return "This project provides MCP tools via Spring AI.";
}

🔗 Integration

This server is consumed by:

👉 mcp-agent-assistant-spring (MCP Client + RAG + Routing)

🧭 Future Enhancements
Add database-backed tools
Add REST API tools
Add authentication
Add multi-tool routing

👨‍💻 Author

Srinivasa Rao Peddineni
Principal AI / Lead Java Full-Stack Engineer
