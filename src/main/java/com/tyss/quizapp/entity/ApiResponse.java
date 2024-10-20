package com.tyss.quizapp.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ApiResponse {
    private int statusCode;
    private HttpStatus httpStatus;
    private Object response;
}
