package com.tyss.quizapp.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@Document(value = "questions")
public class Question {
    @Id
    String questionId;
    String questionTitle;
    String option1;
    String option2;
    String option3;
    String option4;
    String rightAnswer;
    String category;
    String difficultyLevel;
}
