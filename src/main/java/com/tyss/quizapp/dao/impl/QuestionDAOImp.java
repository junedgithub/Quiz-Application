package com.tyss.quizapp.dao.impl;

import com.tyss.quizapp.dao.QuestionDAO;
import com.tyss.quizapp.entity.Question;
import com.tyss.quizapp.repository.QuestionRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
@RequiredArgsConstructor
public class QuestionDAOImp implements QuestionDAO {
   private final QuestionRepository questionRepository;

   private final MongoTemplate mongoTemplate;

   public Question createQuestion(Question question){
      return questionRepository.save(question);
   }

   @Override
   public List<Question> getAllQuestions() {
      return questionRepository.findAll();
   }

   @Override
   public List<Question> getQuestionsByCategory(String category) {
      if (category != null && !category.isEmpty()) {
         Query query = new Query(Criteria.where("category").is(category));
         return mongoTemplate.find(query, Question.class);
      } else {
         return new ArrayList<>();
      }
   }
}
