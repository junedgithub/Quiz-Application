package com.tyss.quizapp.service.impl;

import com.tyss.quizapp.dao.QuestionDAO;
import com.tyss.quizapp.entity.ApiResponse;
import com.tyss.quizapp.entity.Question;
import com.tyss.quizapp.service.QuestionService;
import com.tyss.quizapp.util.ResponseUtil;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class QuestionImpl implements QuestionService {

     private final QuestionDAO questionDAO;

    @Override
    public ResponseEntity<ApiResponse> createQuestion(Question question) {
        if(question != null){
            Question savedQuestion = questionDAO.createQuestion(question);
            return ResponseUtil.getOKRequestResponse(savedQuestion);
        }else{
            return ResponseUtil.getBadRequestResponse(question);
        }
    }

    @Override
    public ResponseEntity<ApiResponse> getAllQuestions() {
        List<Question> questionList = questionDAO.getAllQuestions();
        if (!questionList.isEmpty()){
            return ResponseUtil.getOKRequestResponse(questionList);
        }else{
            return ResponseUtil.getNoContentRequestResponse(new ArrayList<>());
        }
    }

    @Override
    public ResponseEntity<ApiResponse> getQuestionByCategory(String category) {
       List<Question> questionList = questionDAO.getQuestionsByCategory(category);
       if (!questionList.isEmpty()){
           return ResponseUtil.getOKRequestResponse(questionList);
       }else {
           return ResponseUtil.getNoContentRequestResponse(new ArrayList<>());
       }
    }
}
