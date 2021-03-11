package com.epam.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException{
        process(req, resp);
    }

@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        process(req,resp);
}

private void process(HttpServletRequest req,HttpServletResponse resp)throws IOException{
        resp.getWriter().write("Hello java web!!!");
}
}
