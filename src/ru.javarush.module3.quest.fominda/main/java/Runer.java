//import model.Answer;
//import model.Question;
//import reposytory.QuestionRepository;
//import services.GameService;
//import services.Settings;
//import services.StepGame;
//import services.YamlParser;
//
//import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;
//
//public class Runer {
//    public static void main(String[] args) {
//        Settings settings = new Settings(Settings.class.getClassLoader().getResourceAsStream("Settings.yaml"));
//
//        System.out.println("Создание игры");
//        GameService gameService = new GameService(settings);
//        System.out.println("Старт игры");
//        StepGame stepGame0 = gameService.findQuestion(settings.getFirstQuestionId());
//
//        System.out.println(stepGame0.getQuestion().getQuestionText());
//        for (Answer answer : stepGame0.getAnswers()) {
//            System.out.println(answer.getAnswerText());
//
//        }
//        System.out.println("Первый шаг в игре");
//        Answer selectAnswer0 = gameService.selectAnswer(stepGame0);
//
//        StepGame stepGame1 = gameService.findNextQuestion(selectAnswer0);
//
//        System.out.println(stepGame1.getQuestion().getQuestionText());
//        for (Answer answer : stepGame1.getAnswers()) {
//            System.out.println(answer.getAnswerText());
//
//        }
//        System.out.println("Второй шаг в игре");
//        Answer selectAnswer2 = gameService.selectAnswer(stepGame0);
//
//        StepGame stepGame2 = gameService.findNextQuestion(selectAnswer2);
//
//        System.out.println(stepGame2.getQuestion().getQuestionText());
//        for (Answer answer : stepGame2.getAnswers()) {
//            System.out.println(answer.getAnswerText());
//
//        }
//
//        System.out.println("Третий шаг в игре");
//        Answer selectAnswer3 = gameService.selectAnswer(stepGame0);
//
//        StepGame stepGame3 = gameService.findNextQuestion(selectAnswer3);
//
//        System.out.println(stepGame3.getQuestion().getQuestionText());
//        for (Answer answer : stepGame3.getAnswers()) {
//            System.out.println(answer.getAnswerText());
//
//        }
//
//        System.out.println("Четвертый шаг в игре");
//        Answer selectAnswer4 = gameService.selectAnswer(stepGame0);
//
//        StepGame stepGame4 = gameService.findNextQuestion(selectAnswer4);
//
//        System.out.println(stepGame4.getQuestion().getQuestionText());
//        for (Answer answer : stepGame4.getAnswers()) {
//            System.out.println(answer.getAnswerText());
//
//        }
//
//        System.out.println("Пятый шаг в игре");
//        Answer selectAnswer5 = gameService.selectAnswer(stepGame0);
//
//        StepGame stepGame5 = gameService.findNextQuestion(selectAnswer5);
//
//        System.out.println(stepGame5.getQuestion().getQuestionText());
//        for (Answer answer : stepGame5.getAnswers()) {
//            System.out.println(answer.getAnswerText());
//
//        }
//
//        System.out.println("Шестой шаг в игре");
//        Answer selectAnswer6 = gameService.selectAnswer(stepGame0);
//
//        StepGame stepGame6 = gameService.findNextQuestion(selectAnswer6);
//
//        System.out.println(stepGame6.getQuestion().getQuestionText());
//        for (Answer answer : stepGame6.getAnswers()) {
//            System.out.println(answer.getAnswerText());
//
//        }
//
//        System.out.println("Седьмой шаг в игре");
//        Answer selectAnswer7 = gameService.selectAnswer(stepGame0);
//
//        StepGame stepGame7 = gameService.findNextQuestion(selectAnswer7);
//
//        System.out.println(stepGame7.getQuestion().getQuestionText());
//        for (Answer answer : stepGame7.getAnswers()) {
//            System.out.println(answer.getAnswerText());
//
//        }
//
//
//    }
//}
