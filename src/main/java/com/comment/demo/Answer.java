package com.comment.demo;

public enum Answer {

    YES("Y"),
    NO("N");

    private String type;

    Answer(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
