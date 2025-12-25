# OpsNexus

## Overview

**OpsNexus** is a lightweight incident management service that tracks incidents, determines the responsible authority based on severity, and triggers notifications accordingly.

It provides a clear incident lifecycle (`OPEN → ACKNOWLEDGED → RESOLVED`) and serves as a foundation for alerting workflows.

This project is **educational** and was built to explore and practice **Hexagonal (Ports & Adapters) Architecture** in a realistic but minimal backend service.

---

## Purpose of the Project

The primary goal of this project is to:

- Understand how to **separate domain logic from infrastructure concerns**
- Design a system where business rules are **framework-agnostic**
- Explore **ports and adapters** using real (database) and simulated (notification) integrations
- Practice modeling a strict domain with explicit lifecycle rules

The focus is on **architecture and boundaries**, not feature completeness.

---

## Architecture

The application follows **Hexagonal Architecture**, structured around three core layers:

### Domain
Contains the core business model (`Incident`) and policies (for example, notification decision rules).  
This layer is fully isolated from frameworks and infrastructure.

### Application
Implements use cases and orchestration logic.  
It coordinates domain behavior and interacts with the outside world only through ports.

### Infrastructure
Provides concrete adapters for persistence (database) and external integrations (such as email notifications).  
These adapters implement application-defined ports.

### Architecture Diagram

![Architecture Diagram](./Screenshot%202025-12-25%20at%2003.54.40.png)

---

## Notes

- Notification channels are currently **simulated** (for example, an email adapter).
- The project intentionally avoids overengineering and focuses on **clarity and correctness**.
- External integrations can be replaced without impacting domain or application logic.

