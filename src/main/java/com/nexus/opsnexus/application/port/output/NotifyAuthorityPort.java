package com.nexus.opsnexus.application.port.output;

import com.nexus.opsnexus.application.dto.NotificationMessage;
import com.nexus.opsnexus.domain.model.Authority;

public interface NotifyAuthorityPort {

    void notify(Authority authority, NotificationMessage message);
}
