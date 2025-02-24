package com.example.detector.domain.interaction.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class NewInteractionPayloadData{
    private String operation;
    private Long interactionIdx;
    private Long userIdx;
    private Long commentIdx;
    private Long emojiIdx;
}