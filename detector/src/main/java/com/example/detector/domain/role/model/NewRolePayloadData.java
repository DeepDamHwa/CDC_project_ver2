package com.example.detector.domain.role.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class NewRolePayloadData{
    private String operation;
    private Long roleIdx;
    private String name;
}