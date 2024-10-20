package com.tyss.quizapp.service.impl;

import com.tyss.quizapp.dao.QuestionDAO;
import com.tyss.quizapp.dao.QuizDAO;
import com.tyss.quizapp.entity.ApiResponse;
import com.tyss.quizapp.entity.Question;
import com.tyss.quizapp.entity.Quiz;
import com.tyss.quizapp.service.QuizService;
import com.tyss.quizapp.util.ResponseUtil;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Data
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {
    private final QuizDAO quizDAO;
    private final QuestionDAO questionDAO;

    @Override
    public ResponseEntity<ApiResponse> create(Quiz quiz, String category) {
        if(Objects.nonNull(quiz)){
            List<Question> questionList = questionDAO.getQuestionsByCategory(category);
            quiz.setQuestions(questionList);
            Quiz savedQuiz = quizDAO.createQuiz(quiz);
            return ResponseUtil.getOKRequestResponse(savedQuiz);
        }else {
            return ResponseUtil.getBadRequestResponse(quiz);
        }
    }
}
