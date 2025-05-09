package com.example.demo.handler;

import com.example.demo.dto.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.io.IOException;
import java.time.Instant;

import static org.antlr.v4.runtime.atn.EmptyPredictionContext.Instance;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    static final String INVALID_REQUEST = "INVALID_REQUEST";


    static final String INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    @ExceptionHandler(IOException.class)
    public ResponseEntity<Object> handleIOException(IOException exception) {
        ApiError apiError = new ApiError(
                INTERNAL_SERVER_ERROR,
                "Missing Parameter",
                HttpStatus.INTERNAL_SERVER_ERROR,
                Instant.now().toEpochMilli()
        );
        return new ResponseEntity<Object>(apiError, apiError.status());
    }

}
