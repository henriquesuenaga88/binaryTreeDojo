package com.comment.demo.service;

import com.comment.demo.model.Animal;
import com.comment.demo.model.Question;

public class QuestionService {

    private void newQuestion() {
    }

    private Question firstQuestion() {
        Question question = new Question();
        question.setText("É um mamífero?");

        question.addAnswer(new Animal("Porco"));
        question.addAnswer(new Animal("Lesma"));

        return question;
    }
}
