import services.GameService;
import services.Settings;
import services.YamlParser;

public class Runer {
    public static void main(String[] args) {
        Settings settings = new Settings();
//        YamlParser yamlParser = new YamlParser();
//        System.out.println(settings.get());
        System.out.println(settings.getDescription());
        System.out.println(settings.getGameId());
        System.out.println(settings.getFirstQuestionId());
        System.out.println(settings.getCreaturesQuestions());
        System.out.println(settings.getCreaturesAnswer());
//        System.out.println(Settings.INIT_FILE_SETTINGS);
//        GameService gameService = new GameService(settings);
//        System.out.println(gameService.findQuestion(settings.getFirstQuestionId()));

    }
}
