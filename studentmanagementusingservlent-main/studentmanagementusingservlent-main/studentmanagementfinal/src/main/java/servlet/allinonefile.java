package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("\register")
public class allinonefile extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String rollnumber = req.getParameter("rollnumber");
		String name = req.getParameter("name");
		String branch = req.getParameter("branch");
		String email= req.getParameter("email");
		String section= req.getParameter("section");
		
		PrintWriter pw = resp.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "Mysql@123");
			
			String sql ="insert into student(rollnumber,name,branch,email,password) values (?,?,?,?,?)";
			
			PreparedStatement pmst = conn.prepareStatement(sql);
			
			pmst.setString(1, rollnumber);
			pmst.setString(2, name);
			pmst.setString(3, branch);
			pmst.setString(4, email);
			pmst.setString(4, section);
			
			int i = pmst.executeUpdate();
			if(i>0) {
				pw.println("successfully inserted");
			}
			else
			{
				pw.println("invaild");
			}
			
			conn.close();
			pmst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

