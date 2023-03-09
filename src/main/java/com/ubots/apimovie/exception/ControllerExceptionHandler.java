package com.ubots.apimovie.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;
@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(MovieNotFoundException.class)
    public ResponseEntity<StandardError> clientNotFound(MovieNotFoundException messageError, HttpServletRequest request) {

        StandardError error = new StandardError(
                Instant.now(),
                HttpStatus.NOT_FOUND.value(),
                "Movie not found",
                messageError.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
