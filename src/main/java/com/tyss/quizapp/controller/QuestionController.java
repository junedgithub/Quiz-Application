package com.tyss.quizapp.controller;

import com.tyss.quizapp.entity.ApiResponse;
import com.tyss.quizapp.entity.Question;
import com.tyss.quizapp.service.QuestionService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService questionService;

    @PostMapping("/createQuestion")
    public ResponseEntity<ApiResponse> createQuestion(@RequestBody Question question){
        return questionService.createQuestion(question);
    }

    @GetMapping("/getallquestions")
    public ResponseEntity<ApiResponse> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/getbycategory/category/{category}")
    public ResponseEntity<ApiResponse> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }

}
