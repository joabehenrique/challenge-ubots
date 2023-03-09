package com.ubots.apimovie.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movie")
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.NONE)
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    @OneToMany(mappedBy = "id.movie")
    private Set<Score> scores = new HashSet<>();
}
