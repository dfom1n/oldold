package model;

import java.util.List;

public class Answer {
    private Long id;
    private String answerText;
    private Long nextQuestionId;

    public Answer(Long id, String answerText, Long nextQuestionId) {
        this.id = id;
        this.answerText = answerText;
        this.nextQuestionId = nextQuestionId;
    }

    public Answer(){}

    public Long getId() {
        return id;
    }

    public String getAnswerText() {
        return answerText;
    }

    public Long getNextQuestionId() {
        return nextQuestionId;
    }
}
