package com.tyss.quizapp.repository;

import com.tyss.quizapp.entity.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends MongoRepository<Quiz,String> {
}
