package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import models.student;

public class studentservice {
	
	private Connection conn;
	//to get connection between dbconnection we need to generate constructor
	public studentservice(Connection conn) {
		super();
		this.conn = conn;
	}

//posting of data
public boolean addstudent(student s){     //take any constructor addsudent(//modelname)
    	
	  boolean f = false;  
	  
	  try {
			  String sql ="insert into student(rollnumber,name,email,branch,section) values(?,?,?,?,?)";
			  PreparedStatement pmst = conn.prepareStatement(sql);
			  pmst.setString(1, s.getRollnumber());
			  pmst.setString(2, s.getName());
			  pmst.setString(3, s.getEmail());
			  pmst.setString(4, s.getBranch());
			  pmst.setString(5, s.getSection());
			  
    		  int i = pmst.executeUpdate();
             if(i>0)
             {
            	 f=true;
             }
//    		 conn.close();
//    		  pmst.close();
	     } catch (Exception e)
	        {
			   e.printStackTrace();
		    }
	       return f;
      }



    public List<student> getall() {
		List<student> ll = new ArrayList<student>();
		student s = null;
		try {
			String sql = "select * from student";
			PreparedStatement pmst =conn.prepareStatement(sql);
			ResultSet rs = pmst.executeQuery();//select =>execute query
			//while we use when we dont know no of data sets
			while (rs.next()) { 
				s = new student();
				s.setId(rs.getInt(1));
				s.setRollnumber(rs.getString(2));
				s.setName(rs.getString(3));
				s.setEmail(rs.getString(4));
				s.setBranch(rs.getString(5));
				s.setSection(rs.getString(6));
				ll.add(s);//ll=list
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ll;
	}

   public student getbyId(int id) {
	   student s = null;
	   try {
		String sql = "select * from student where id = ?";
		PreparedStatement pmst = conn.prepareStatement(sql);
		pmst.setInt(1, id);
		ResultSet rs = pmst.executeQuery();
		while(rs.next()) {
			s = new student();
			s.setRollnumber(rs.getString(1));
		    s.setName(rs.getString(2));	
		    s.setEmail(rs.getString(3));
		    s.setBranch(rs.getString(4));
		    s.setSection(rs.getString(5));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return s;
   }
   public boolean deletebyid(int id) {
	   boolean f = false;
	   try {
		String sql = "delete from student where id =?";
		PreparedStatement pmst = conn.prepareStatement(sql);
		pmst.setInt(1, id);
		pmst.executeUpdate();
		int i = pmst.executeUpdate(); 
		if(i>0) {
			f= true;	
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return f;
	  
   }
   public boolean updatestu(student sw) {//posting of data
	   boolean f = false;
	   try {
		String sql = "update student set name = ?,rollnumber = ?,email = ?,branch = ?,section = ? where id =?";
		PreparedStatement pmst =conn.prepareStatement(sql);
		pmst.setString(1, sw.getName());
		pmst.setString(2, sw.getRollnumber());
		pmst.setString(3, sw.getBranch());
		pmst.setString(4, sw.getEmail());
		pmst.setString(5, sw.getSection());
		pmst.setInt(6, sw.getId());
	
		int i =pmst.executeUpdate();
		if (i > 0) {
			f=true;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return f;
   }
}
