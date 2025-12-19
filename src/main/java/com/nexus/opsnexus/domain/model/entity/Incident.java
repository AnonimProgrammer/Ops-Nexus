package com.nexus.opsnexus.domain.model.entity;

import com.nexus.opsnexus.domain.model.IncidentStatus;
import com.nexus.opsnexus.domain.model.IncidentType;
import com.nexus.opsnexus.domain.model.Severity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Incident {
    private Long id;
    private IncidentType type;
    private Severity severity;
    private String reason;
    private IncidentStatus status;
}
