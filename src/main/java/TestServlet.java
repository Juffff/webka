package main.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Enumeration;

/**
 * .|\_/|,,_____,~~`
 * .(.".)~~     )`~}} Created by Juff
 * ..\o/\ /---~\\ ~}}
 * ...._//    _// ~}
 */
public class TestServlet extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*        PrintWriter out = resp.getWriter();
        out.print("<html>");
        out.print("<ul>\n\r");
        for (int i = 0; i <1500 ; i++) {
            out.print("<li>ITEM "+i+"</li>\n\r");
        }
        out.print("<ul>");
        out.print("</html>");*/

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(getBody(req));
    }



    public static String getBody(HttpServletRequest request) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        while (reader.ready()){
            stringBuilder.append(reader.readLine());
        }
        reader.close();
        return  stringBuilder.toString();
    }
}
