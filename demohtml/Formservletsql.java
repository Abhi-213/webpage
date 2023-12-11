import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  
import java.sql.*;
public class Formservletsql extends HttpServlet{  
public void doPost(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException
{  
res.setContentType("text/html");  
PrintWriter out=res.getWriter();  
  
String name=req.getParameter("user");
String roll=req.getParameter("pass");


try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Form","root","9360");
String sql= "Insert into form values(?,?);";
PreparedStatement prep = conn.prepareStatement(sql);
prep.setString(1,name);
prep.setString(2,roll);
prep.executeUpdate();
prep.close();
out.println("<h1>Data inserted successfully!!!</h1>");
String query="select * from form;";
PreparedStatement pp= conn.prepareStatement(query);
ResultSet rs= pp.executeQuery(query);
while(rs.next()){
out.println(rs.getString("username") + "<br>" + rs.getString("password") + "<br>");
}
pp.close();
 }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("Error: " + e.getMessage());
        } 
out.close();  
}}  