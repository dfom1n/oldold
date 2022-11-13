package model;

public class AnswerGolf2 {
    private String text;
    private Integer next;

    public AnswerGolf2(String text, int next) {
        this.text = text;
        this.next = next;
    }

    public String getText() {
        return text;
    }

    public int getNext() {
        return next;
    }
}
