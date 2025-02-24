package com.example.detector.domain.post.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class NewPostPayloadData{
    private String operation;
    private Long postIdx;
    private Long userIdx;
}