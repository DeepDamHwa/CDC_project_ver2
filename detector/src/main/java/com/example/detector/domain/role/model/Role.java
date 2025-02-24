package com.example.detector.domain.role.model;


import com.example.detector.domain.user.model.Users;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Entity
@Getter
public class Role{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String name;

    @OneToMany(mappedBy = "role")
    private List<Users> users = new ArrayList<>();

    public NewRolePayloadData toDto(String operation) {
        return NewRolePayloadData.builder()
                .operation(operation)
                .roleIdx(idx)
                .name(name)
                .build();
    }
}