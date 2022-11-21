package services;

import model.Answer;
import model.Question;
import reposytory.AnswerRepository;
import reposytory.QuestionRepository;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GameService {
    private QuestionRepository questionRepository;
    private AnswerRepository answerRepository;

    public GameService(Settings settings) {
        this.questionRepository = settings.getCreaturesQuestionRepository();
        this.answerRepository = settings.getCreaturesAnswerRepository();
    }

    public StepGame findQuestion(Long id){
        Question question = questionRepository.findById(id);
        List<Answer> answers = answerRepository.findById(question.getUsеAnswerId());
        return new StepGame(question, answers);
    }

    public Answer selectAnswer(StepGame stepGame) {
        int selectAnswerId = ThreadLocalRandom.current().nextInt(stepGame.getAnswers().size());
        System.out.println(stepGame.getAnswers().size());
        Answer selectAnswer = stepGame.getAnswers().get(selectAnswerId);
        return selectAnswer;
    }

    public StepGame findNextQuestion(Answer answer){
        Long nextQuestionId = answer.getNextQuestionId();
        return findQuestion(nextQuestionId);
    }





//    class QuestionDto {
//        private Long id;
//        private String text;
//        private List<AnswerDto> answers;
//    }
//
//    class AnswerDto {
//        private Long id;
//        private String text;
//        private boolean isLast;
//        private QuestionDto questionDto; // id
//    }

//    public QuestionDto findQuestionById(Long id) {
//        Question question = questionRepository.findById(id).orElseThrow(() -> new RuntimeException());
//        List<Answer> answers = answerRepository.findByIds(question.getAnswersId());
//
//        // List<Answer> answers ---->  List<AnswerDto> answers
//
//        // questionId =
//        return new QuestionDto();
//    }
}
