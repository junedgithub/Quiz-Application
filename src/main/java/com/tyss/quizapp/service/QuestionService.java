package com.tyss.quizapp.service;


import com.tyss.quizapp.entity.ApiResponse;
import com.tyss.quizapp.entity.Question;
import org.springframework.http.ResponseEntity;

public interface QuestionService {
    ResponseEntity<ApiResponse> createQuestion(Question question);

    ResponseEntity<ApiResponse> getAllQuestions();

    ResponseEntity<ApiResponse> getQuestionByCategory(String category);
}
