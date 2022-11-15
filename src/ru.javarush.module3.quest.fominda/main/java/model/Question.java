package model;

import java.util.List;

public class Question {
    private Long id;
    private String questionText;
    private List<Long> usеAnswerId;

    public Question(Long id, String questionText, List<Long> usеAnswerId) {
        this.id = id;
        this.questionText = questionText;
        this.usеAnswerId = usеAnswerId;
    }

    public Question(){}

    public Long getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Long> getUsеAnswerId() {
        return usеAnswerId;
    }


}
