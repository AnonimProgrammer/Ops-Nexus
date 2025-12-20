package com.nexus.opsnexus.domain.policy;

import com.nexus.opsnexus.domain.model.Authority;
import com.nexus.opsnexus.domain.model.Severity;

public class NotificationPolicy {

    public Authority resolveAuthority(Severity severity) {
        return switch (severity) {
            case LOW -> Authority.OWNER;
            case MEDIUM -> Authority.TEAM;
            case HIGH, CRITICAL -> Authority.ON_CALL;
        };
    }
}
