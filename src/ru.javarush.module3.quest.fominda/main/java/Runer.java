import model.Answer;
import model.Question;
import reposytory.QuestionRepository;
import services.GameService;
import services.Settings;
import services.YamlParser;

public class Runer {
    public static void main(String[] args) {
        Settings settings = new Settings();
//        for (Answer answer : settings.getCreaturesAnswer()) {
//            System.out.println("id : " + answer.getId() + ", answerText : " + answer.getAnswerText() + ", nextQuestionId : " + answer.getNextQuestionId() );
//
//        }
//
//        System.out.println("===========================================================");
//
//        for (Question question : settings.getCreaturesQuestions()) {
//            System.out.println("id : " + question.getId() + ", questionText : " + question.getQuestionText() + ", nextQuestionId : " + question.getUsеAnswerId().toString() );
//
//        }
//
//        System.out.println("===========================================================");

        GameService gameService = new GameService(settings);

        gameService.findQuestion(settings.getFirstQuestionId());

    }
}
