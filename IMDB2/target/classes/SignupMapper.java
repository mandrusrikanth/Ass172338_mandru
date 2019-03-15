class SignupMapper implements RowMapper<Signup> {
	  public Signup mapRow(ResultSet rs, int arg1) throws SQLException {
		  Signup user = new Signup();
	    user.setFirstname(rs.getString("firstname"));
	    user.setEmail(rs.getString("email"));
	    user.setCre_pwd(rs.getString("crepwd"));
	    user.setCon_pwd(rs.getString("conpwd"));
	    user.setNumber(rs.getLong("Number"));
	    
	    return user;
	  }
	}