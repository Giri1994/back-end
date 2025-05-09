package com.example.demo.dto;

import org.springframework.http.HttpStatus;



public record ApiError(String errorCode, String errorMessage, HttpStatus status,Long timestamp) {
}
