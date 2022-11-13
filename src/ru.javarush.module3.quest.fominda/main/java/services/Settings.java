package services;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import model.Answer;
import model.Question;
import reposytory.AnswerRepository;
import reposytory.QuestionRepository;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class Settings {
    
    public static final String INIT_FILE_SETTINGS = "resources/Settings.yaml";

    private static volatile Settings SETTINGS;
    private String description;
    private Long gameId;
    private Long firstQuestionId;
    private List<Question> creaturesQuestions;

    private List<Answer> creaturesAnswer;



    public Settings() {
        try {
            URL resource = Settings.class.getClassLoader().getResource(INIT_FILE_SETTINGS);
            ObjectReader objectReader = new YAMLMapper().readerForUpdating(this);
            if (Objects.nonNull(resource)) {
                objectReader.readValue(resource.openStream());
            }
        } catch (IOException e) {
            //TODO Coding. System.out here? Need move the output to View layer
            System.out.printf("Ошибка при чтении файла настроек init.yml: %s", e);
        }
    }

    public QuestionRepository getCreaturesQuestionRepository() {
        QuestionRepository creaturesQuestionRepository = null;
        if (creaturesQuestions != null){
            creaturesQuestionRepository = new QuestionRepository(creaturesQuestions);
        }
        return creaturesQuestionRepository;
    }

    public AnswerRepository getCreaturesAnswerRepository() {
        AnswerRepository creatureAnswerRepository = null;
        if (creaturesQuestions != null){
            creatureAnswerRepository = new AnswerRepository(creaturesAnswer);
        }
        return creatureAnswerRepository;
    }

    public String getDescription() {
        return this.description;
    }

    public Long getGameId() {
        return gameId;
    }

    public Long getFirstQuestionId() {
        return firstQuestionId;
    }

    public List<Question> getCreaturesQuestions() {
        return creaturesQuestions;
    }

    public List<Answer> getCreaturesAnswer() {
        return creaturesAnswer;
    }

    public static Settings get() {
        Settings settings = SETTINGS;

        if (Objects.isNull(settings)) {
            synchronized (Settings.class) {
                if (Objects.isNull(settings = SETTINGS)) {
                    settings = SETTINGS = new Settings();
                }
            }
        }

        return settings;
    }
}

