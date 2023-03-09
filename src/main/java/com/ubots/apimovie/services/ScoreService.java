package com.ubots.apimovie.services;

import com.ubots.apimovie.dto.MovieDTO;
import com.ubots.apimovie.dto.ScoreDTO;
import com.ubots.apimovie.entities.Movie;
import com.ubots.apimovie.entities.Score;
import com.ubots.apimovie.entities.User;
import com.ubots.apimovie.repositories.MovieRepository;
import com.ubots.apimovie.repositories.ScoreRepository;
import com.ubots.apimovie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ScoreService {
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO dto) {
        User user = userRepository.findByEmail(dto.getEmail());
        if(user == null) {
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(dto.getMovieId()).get();
        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum = 0.0;
        for(Score s : movie.getScores()) {
            sum = sum +  s.getValue();
        }

        double avg = sum / movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movie = movieRepository.save(movie);

        return new MovieDTO(movie);
    }
}
