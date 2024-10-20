package com.tyss.quizapp.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import java.util.List;

@Data
@Repository
@Document(value = "quiz")
public class Quiz {
    @Id
    private String quizId;
    private String title;
    private List<Question> questions;
}
