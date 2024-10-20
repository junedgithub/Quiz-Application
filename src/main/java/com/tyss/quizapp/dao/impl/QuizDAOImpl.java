package com.tyss.quizapp.dao.impl;

import com.tyss.quizapp.dao.QuizDAO;
import com.tyss.quizapp.entity.Quiz;
import com.tyss.quizapp.repository.QuizRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@Data
@RequiredArgsConstructor
public class QuizDAOImpl implements QuizDAO {
    private QuizRepository quizRepository;

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }
}
