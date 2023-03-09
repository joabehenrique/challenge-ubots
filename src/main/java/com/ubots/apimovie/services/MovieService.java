package com.ubots.apimovie.services;

import com.ubots.apimovie.dto.MovieDTO;
import com.ubots.apimovie.entities.Movie;
import com.ubots.apimovie.exception.MovieNotFoundException;
import com.ubots.apimovie.helper.MovieHelper;
import com.ubots.apimovie.repositories.MovieRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private MovieHelper movieHelper;

    public Page<MovieDTO> findAllMovies(Pageable page){
        Page<Movie> movies = movieRepository.findAll(page);
        return movies.map(MovieDTO::new);
    }

    public MovieDTO findById(Long id) {
        Movie result = movieRepository.findById(id).get();
        MovieDTO dto = new MovieDTO(result);
        return dto;
    }

    public MovieDTO saveMovie(MovieDTO movie){
        Movie newMovie = new Movie();
        movieHelper.convertDTOtoEntity(newMovie, movie);
        newMovie = movieRepository.save(newMovie);
        return new MovieDTO(newMovie);
    }

    public MovieDTO updateMovie(Long id, MovieDTO newMovie){
        try {
            Optional<Movie> accountEntity = movieRepository.findById(id);
            Movie entity = accountEntity.orElseThrow(() -> new MovieNotFoundException("ID movie not found: "+id));
            movieHelper.convertDTOtoEntity(entity, newMovie);
            entity = movieRepository.save(entity);
            return new MovieDTO(entity);
        }catch (EntityNotFoundException e){
            throw new MovieNotFoundException("ID movie not found: "+id);
        }
    }

    public void deleteMovie(Long id){
        try{
            movieRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new MovieNotFoundException("Movie by id "+id+" not found");
        }
    }
}
