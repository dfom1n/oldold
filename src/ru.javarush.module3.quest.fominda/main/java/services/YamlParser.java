package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class YamlParser {

    public YamlParser() {
        try {
            // Загрузка файла YAML из папки
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            File file = new File(classLoader.getResource("Settings.yaml").getFile());

// Создание нового ObjectMapper как YAMLFactory
            ObjectMapper om = new ObjectMapper(new YAMLFactory());

// Отображение сотрудника из файла YAML в класс Employee
            Settings employee = om.readValue(file, Settings.class);

// Распечатка информации
            System.out.println("Employee info " + employee.get());
        } catch (
                IOException e) {
            System.out.printf("Ошибка при чтении файла настроек init.yml: %s", e);
        }
    }
}
