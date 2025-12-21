package com.nexus.opsnexus.application.dto;

import com.nexus.opsnexus.domain.model.Incident;

public record NotificationMessage(
        String subject,
        String body
) {
    public static NotificationMessage forIncidentOpened(Incident incident) {
        return new NotificationMessage(
                "Incident opened: " + incident.getType(),
                "Severity: " + incident.getSeverity() +
                "\nReason: " + incident.getReason()
        );
    }
}
