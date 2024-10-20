package com.tyss.quizapp.controller;

import com.tyss.quizapp.entity.ApiResponse;
import com.tyss.quizapp.entity.Quiz;
import com.tyss.quizapp.service.QuizService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Data
@RequestMapping("/quiz")
public class QuizController {
    private final QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<ApiResponse> createQuiz(@RequestBody Quiz quiz,
                                                  @RequestParam String category){
        return quizService.create(quiz,category);
    }
}
