package com.nexus.opsnexus.infrastructure.adapter.output.notification.email;

import com.nexus.opsnexus.application.dto.NotificationMessage;
import com.nexus.opsnexus.application.port.output.NotifyAuthorityPort;
import com.nexus.opsnexus.domain.model.Authority;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationAdapter implements NotifyAuthorityPort {

    @Override
    public void notify(Authority authority, NotificationMessage message) {}
}
