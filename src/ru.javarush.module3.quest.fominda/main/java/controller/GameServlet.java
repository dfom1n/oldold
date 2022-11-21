package controller;

import reposytory.AnswerRepository;
import reposytory.QuestionRepository;
import services.GameService;
import services.Settings;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet(name = "GameServlet", value = "/hello")
public class GameServlet extends HttpServlet {
    QuestionRepository questionRepository;
    AnswerRepository answerRepository;

    @Override
    public void init() throws ServletException {
        questionRepository = new Settings(GameServlet.class.getClassLoader().getResourceAsStream("Settings.yaml")).getCreaturesQuestionRepository();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
