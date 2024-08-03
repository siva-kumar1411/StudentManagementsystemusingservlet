package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class studentdb {

  private static Connection conn ;
  private static String Driver="com.mysql.cj.jdbc.Driver";
  private static String URL="jdbc:mysql://localhost:3306/student1";
  private static String Username="root";
  private static String Password="Mysql@123";
      
     public static Connection  getConn(){
    	 
		try {
			Class.forName(Driver);
			 conn = DriverManager.getConnection(URL,Username,Password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
   
}
