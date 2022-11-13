package reposytory;

import model.Answer;
import model.Question;

import java.util.List;
import java.util.Map;

public class AnswerRepository {
    private Map<Long, Answer> answerMap;

    public AnswerRepository(List<Answer> answerList) {
        Long id;
        for (Answer answer : answerList) {
            id = answer.getId();
            this.answerMap.put(id, answer);
        }
    }

    public List<Answer> findById(List<Long> ids){
        List<Answer> answers = null;
        for (Map.Entry<Long, Answer> longAnswerEntry : answerMap.entrySet()) {
            for (Long id : ids) {
                if(longAnswerEntry.getKey() == id){
                    answers.add((Answer) longAnswerEntry);
                }
            }
        }
        return answers;
    }
}
