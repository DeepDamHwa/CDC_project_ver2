package com.example.detector.domain.comment.model;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class NewCommentsPayloadData{
    private String operation;
    private Long commentsIdx;
//    private Boolean isMine;
    private Long postIdx;
    private Long userIdx;
    private Long parentIdx;
    private String content;
}