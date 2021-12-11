package RegisterSystem;

import java.beans.Statement;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;

@MultipartConfig
public class Register extends HttpServlet {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        Part part=req.getPart("image");
         String fileName=part.getSubmittedFileName();
         
        //connecton to database...........---------------
        try {
            Thread.sleep(3000);
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "Moin$8338");
            java.sql.Statement stmt = con.createStatement();
            String query = "SELECT COUNT(1) as NumberOfRows FROM register";
            rs = stmt.executeQuery(query);
            rs.next();
            int cnt=rs.getInt("NumberOfRows");
            cnt+=1;
            PreparedStatement Add = con.prepareStatement("insert into register Values (?,?,?,?,?)");

            Add.setString(1,Integer.toString(cnt));
            Add.setString(2, name);
            Add.setString(3, password);
            Add.setString(4, email);
            Add.setString(5, fileName);
            
            int row = Add.executeUpdate();
            
            //upload image
            InputStream is=part.getInputStream();
            byte []data=new byte[is.available()];
            is.read(data);
            
            String path=req.getRealPath("/")+"img"+File.separator+fileName;
            
            FileOutputStream fos=new FileOutputStream(path);
            
            fos.write(data);
            fos.close();
            
            out.println("done");
            con.close();
        } catch (SQLException | ClassNotFoundException | InterruptedException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
           // out.println(ex.getMessage());
        }

    }

}
