package com.example.detector.domain.user.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class NewUsersPayloadData {
    private String operation;
    private Long userIdx;
    private String name;
    private Long roleIdx;
}