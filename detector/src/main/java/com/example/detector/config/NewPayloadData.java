package com.example.detector.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewPayloadData {
    private String operation;
    private String tableName;
    private String log;
}
