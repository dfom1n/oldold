package controller;

import model.AnswerGolf2;
import reposytory.RepositoryGolf2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletQuest", value = "/ServletQuest")
public class ServletQuestGolf2 extends HttpServlet {
    private RepositoryGolf2 repository;

    @Override
    public void init() throws ServletException {
        repository = new RepositoryGolf2();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if (id!= null){
            int i = Integer.parseInt(id);
            String nextQuestion = repository.getNextQuestion(i);
            List<AnswerGolf2> answersByQuestion = repository.getAnswersByQuestion(i);
            request.setAttribute("question", nextQuestion);
            request.setAttribute("answers", answersByQuestion);
            request.getRequestDispatcher("questGolf2.jsp").forward(request, response);
        }
//        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        else {
//            response.sendRedirect("questGolf2.jsp");
//        }
    }
}
