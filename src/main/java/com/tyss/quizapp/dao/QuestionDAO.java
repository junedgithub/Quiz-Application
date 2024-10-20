package com.tyss.quizapp.dao;

import com.tyss.quizapp.entity.Question;

import java.util.List;

public interface QuestionDAO  {

    Question createQuestion(Question question);

    List<Question> getAllQuestions();

    List<Question> getQuestionsByCategory(String category);
}
