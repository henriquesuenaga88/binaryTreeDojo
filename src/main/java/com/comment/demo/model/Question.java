package com.comment.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Question extends Node {

    public List<Node> answers = new ArrayList<>();

    public List<Node> getAnswer() {
        return answers;
    }

    public void addAnswer(Node answer) {
        if (answers.contains(answer)) {
            this.answers.add(answer);
        }
    }
}
