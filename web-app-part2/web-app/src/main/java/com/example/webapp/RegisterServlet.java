package com.example.webapp;

import com.example.webapp.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "registerServlet", value = "/registration")
public class RegisterServlet  extends HttpServlet {
    User user = null;
    private final String userId = "Shahid";
    private final String pwd= "pass123";
    public void init(){
        User user =new User();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("pwd");

        if(userId.equals(userName) && pwd.equals(password))
        {
            Cookie loginCookie = new Cookie("user",userName );
            loginCookie.setMaxAge(15*60);
            String baseUrl = request.getContextPath();
            response.addCookie(loginCookie);
            response.sendRedirect(request.getContextPath()+ "/pages/register.jsp");

        }
        else {
            RequestDispatcher rd=request.getRequestDispatcher("/pages/index.jsp");
            PrintWriter out =response.getWriter();
            out.println("<font color=red>Username or password is incorrect</font>");
            rd.include(request,response);

        }
       /*
        user.setUserName(userName);
        //   System.out.println("Username: "+userName);
        //   System.out.println("Password: "+password);
        String greet="Hello "+ userName+"!";
        request.setAttribute("key",greet);
        RequestDispatcher rd=request.getRequestDispatcher("/pages/register.jsp");
        rd.forward(request,response);*/
    }


}