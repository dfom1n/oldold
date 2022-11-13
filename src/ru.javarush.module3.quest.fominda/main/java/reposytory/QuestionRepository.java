package reposytory;

import model.Question;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class QuestionRepository {
    private Map<Long, Question> questionMap;

    public QuestionRepository(List<Question> questionList) {
        Long id;
        for (Question question : questionList) {
            id = question.getId();
            this.questionMap.put(id, question);
        }
    }

    public Question findById(Long id){
        return questionMap.get(id);
    }
}
