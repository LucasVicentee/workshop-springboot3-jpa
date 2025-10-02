package com.LucasVicentee.ProjetoWeb.resources.exceptions;

import com.LucasVicentee.ProjetoWeb.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

// Tratamento personalizado do ResourceNotFoundException

@ControllerAdvice // Intercepta as inserções que acontecerem para que possam ser tratados
public class ResourceExceptionHandler extends RuntimeException {

    @ExceptionHandler(ResourceNotFoundException.class) // Esse método intercepta qualquer inserção desse tipo e fará o tratamento aqui dentro
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
