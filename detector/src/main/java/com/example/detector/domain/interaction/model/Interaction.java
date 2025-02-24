package com.example.detector.domain.interaction.model;


import com.example.detector.domain.comment.model.Comments;
import com.example.detector.domain.emoji.model.Emoji;
import com.example.detector.domain.user.model.Users;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Interaction{
    @Id
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "comments_idx")
    private Comments COMMENTS;

    @ManyToOne
    @JoinColumn(name = "users_idx")
    private Users USERS;

    @ManyToOne
    @JoinColumn(name = "emoji_idx")
    private Emoji emoji;

    public NewInteractionPayloadData toDto(String operation) {
        return NewInteractionPayloadData.builder()
                .operation(operation)
                .interactionIdx(idx)
                .commentIdx(COMMENTS.getIdx())
                .userIdx(USERS.getIdx())
                .emojiIdx(emoji.getIdx())
                .build();
    }
}