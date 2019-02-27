package com.sign.up;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.database.DataBaseConnection;
import com.database.Login;

public class SignupDao {
	public int insert(Logsignup signup)throws SQLException
	{
		String query="insert into signup values(?,?,?,?,?)";
		Connection conn =DataBaseConnection.getConnection();
		PreparedStatement preparedStatement= conn.prepareStatement(query);
		preparedStatement.setString(1, signup.getFirstname());
		preparedStatement.setString(2, signup.getEmail_id());
		preparedStatement.setString(3, signup.getCre_pwd());
		preparedStatement.setString(4, signup.getCon_pwd());
		preparedStatement.setLong(5, signup.getNumber());
		int res=preparedStatement.executeUpdate();
		return res;
		
	}

}
