package Controller;

import Entity.News;
import Service.NewService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/EditNewsServlet")
public class EditNewsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int newsID=Integer.valueOf(request.getParameter("newid"));
        NewService service=new NewService();
        try {
            News news=service.GetNews(newsID);
            request.setAttribute("news",news);
            request.getRequestDispatcher("EditNews.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
