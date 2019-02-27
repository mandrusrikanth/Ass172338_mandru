package com.database;

import java.sql .Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sign.up.Logsignup;

public class ImdbDao {
	
	public int insert(Login user_id)throws SQLException
	{
		String query="insert into user_id values(?,?)";
		Connection conn =DataBaseConnection.getConnection();
		PreparedStatement preparedStatement= conn.prepareStatement(query);
		preparedStatement.setString(1, user_id.getEmail());
		preparedStatement.setString(2, user_id.getPassword());
		int res=preparedStatement.executeUpdate();
		return res;
		
	}
	
	public  boolean validate(String username,String password) {
		
		System.out.println(username+" "+password);
		try {
		 //String queryString = "SELECT * FROM users where user_emailid=? and user_password=?";
			Connection con=DataBaseConnection.getConnection();
			System.out.println(con);
					String query = "SELECT email, password FROM user_id";
			
		     PreparedStatement s=con.prepareStatement(query);
		      
		     
		      ResultSet results =s.executeQuery(query);
		    
			
			 while (results.next())
			 { 
				
				 String emailid = results.getString("EMAIL");
			  String pass = results.getString("PASSWORD");
			  
			 if ((username.equals(emailid)) && (password.equals(pass)))
			 { 
				 
				 return true;
			
			 } }
			
		      
		}
		catch (Exception e) {
			 e.printStackTrace();
		}
		return false;
		 
		
		
	}
	
	
	/*
	 * public static void main(String args[]) { try {
	 * 
	 * System.out.println(new ImdbDao().insert(new Login("sri@gmail.com","12345")));
	 * }catch(SQLException e) { e.printStackTrace();
	 * 
	 * } }
	 */
	
	

}
