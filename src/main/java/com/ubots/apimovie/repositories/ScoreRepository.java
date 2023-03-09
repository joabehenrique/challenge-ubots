package com.ubots.apimovie.repositories;

import com.ubots.apimovie.entities.Score;
import com.ubots.apimovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
