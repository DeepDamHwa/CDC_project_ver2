package com.example.detector.domain.user.model;


import com.example.detector.domain.role.model.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS")
public class Users{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String name;

    @ManyToOne
    @JoinColumn(name = "role_idx")
    private Role role;

    public NewUsersPayloadData toDto(String operation) {
        return NewUsersPayloadData.builder()
                .operation(operation)
                .userIdx(idx)
                .name(name)
                .roleIdx(role.getIdx())
                .build();
    }
}
