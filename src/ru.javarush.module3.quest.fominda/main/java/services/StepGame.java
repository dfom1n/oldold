package services;

import model.Answer;
import model.Question;

import java.util.List;

public class StepGame {
    private Question question;
    private List<Answer> answers;

    public StepGame(Question question, List<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }

    public Question getQuestion() {
        return question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
