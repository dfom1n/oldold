package reposytory;

import model.Answer;
import model.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnswerRepository {
    private Map<Long, Answer> answerMap = new HashMap<>();

    public AnswerRepository(List<Answer> answerList) {
        Long id;
        for (Answer answer : answerList) {
            id = answer.getId();
            this.answerMap.put(id, answer);
        }
    }

    public List<Answer> findById(List<Long> ids){
        List<Answer> answers = new ArrayList<>();
        for (Long id : ids) {
            for (Map.Entry<Long, Answer> answerEntry : answerMap.entrySet()) {
                if (answerEntry.getKey() == id){
                    answers.add(answerEntry.getValue());
                }
            }
        }
        return answers;
    }
}
