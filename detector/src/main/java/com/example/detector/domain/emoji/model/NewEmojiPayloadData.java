package com.example.detector.domain.emoji.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class NewEmojiPayloadData{
    private String operation;
    private Long emojiIdx;
    private String name;
}