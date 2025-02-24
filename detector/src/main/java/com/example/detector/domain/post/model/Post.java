package com.example.detector.domain.post.model;


import com.example.detector.domain.comment.model.Comments;
import com.example.detector.domain.user.model.Users;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Entity
@Getter

public class Post{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;


    @ManyToOne
    @JoinColumn(name = "users_idx")
    private Users user;

    @OneToMany(mappedBy = "post")
    private List<Comments> comments = new ArrayList<>();

    public NewPostPayloadData toDto(String operation) {
        return NewPostPayloadData.builder()
                .operation(operation)
                .postIdx(idx)
                .userIdx(user.getIdx())
                .build();
    }
}
