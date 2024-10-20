package com.tyss.quizapp.service;

import com.tyss.quizapp.entity.ApiResponse;
import com.tyss.quizapp.entity.Quiz;
import org.springframework.http.ResponseEntity;

public interface QuizService {
    ResponseEntity<ApiResponse> create(Quiz quiz, String category);
}
