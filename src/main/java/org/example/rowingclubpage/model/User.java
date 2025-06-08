package org.example.rowingclubpage.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.rowingclubpage.model.enums.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @ManyToMany(mappedBy = "users")
    private List<Training> trainings = new ArrayList<>();

}