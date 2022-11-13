package model;

import java.util.List;

public class QuestionGolf2 {
    private String text;
    private Integer current;
    private List<AnswerGolf2> answerGolf2List;

    public QuestionGolf2(String text, Integer current, List<AnswerGolf2> answerGolf2List) {
        this.text = text;
        this.current = current;
        this.answerGolf2List = answerGolf2List;
    }

    public String getText() {
        return text;
    }

    public Integer getCurrent() {
        return current;
    }

    public List<AnswerGolf2> getAnswerList() {
        return answerGolf2List;
    }
}