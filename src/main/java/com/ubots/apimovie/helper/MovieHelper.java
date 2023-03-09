package com.ubots.apimovie.helper;

import com.ubots.apimovie.dto.MovieDTO;
import com.ubots.apimovie.entities.Movie;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class MovieHelper {
    public void convertDTOtoEntity(Movie entity, MovieDTO dto){
        entity.setTitle(dto.getTitle());
        entity.setImage(dto.getImage());
        entity.setCount(dto.getCount());
        entity.setScore(dto.getScore());
    }

}
