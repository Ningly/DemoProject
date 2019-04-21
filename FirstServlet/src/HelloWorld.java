import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends javax.servlet.http.HttpServlet {
    private int count=0;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        count++;
        System.out.println(count);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
