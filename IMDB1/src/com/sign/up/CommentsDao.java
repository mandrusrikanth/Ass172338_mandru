package com.sign.up;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.database.DataBaseConnection;


public class CommentsDao {
	public void  insert(CommentPojo comm) throws SQLException
	{
		String query="insert into Comments values(?)";
		Connection conn =DataBaseConnection.getConnection();
		PreparedStatement pStatement= ((java.sql.Connection) conn).prepareStatement(query);
		pStatement.setString(1, comm.getComment());
	     pStatement.executeUpdate();
		
	}	
	/*public static void main(String args[]) throws SQLException
	{
		CommentsDAO o=new CommentsDAO();
		o.insert(new CommentPOJO("srikanth"));
	}*/
}


