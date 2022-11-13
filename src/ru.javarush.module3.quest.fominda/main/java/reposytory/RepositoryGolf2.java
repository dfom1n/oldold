package reposytory;

import model.AnswerGolf2;
import model.QuestionGolf2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepositoryGolf2 {
    private List<QuestionGolf2> questionGolf2List;

    public RepositoryGolf2() {
        this.questionGolf2List = Arrays.asList(
                new QuestionGolf2("question1", 1, Arrays.asList(new AnswerGolf2("otvet1", 2), new AnswerGolf2("otvet2",3))),
                new QuestionGolf2("question2", 2, Arrays.asList(new AnswerGolf2("otvet3", 3), new AnswerGolf2("otvet2",4))),
                new QuestionGolf2("question3", 3, Arrays.asList(new AnswerGolf2("otvet1", 2), new AnswerGolf2("otvet2",3))),
                new QuestionGolf2("question4", 4, Arrays.asList(new AnswerGolf2("otvet1", 2), new AnswerGolf2("otvet2",3)))
        );
    }

    public List<QuestionGolf2> getQuestionList() {
        return questionGolf2List;
    }

    public String getNextQuestion(int id){
        return questionGolf2List.stream()
                .filter(questionGolf2 -> questionGolf2.getCurrent()==id)
                .findFirst()
                .get()
                .getText();
    }

    public List<AnswerGolf2> getAnswersByQuestion(int id){
        return new ArrayList<>(questionGolf2List.stream()
                .filter(questionGolf2 -> questionGolf2.getCurrent() == id)
                .findFirst()
                .get()
                .getAnswerList());
    }
}
