package com.srikanth.impl;

public class SignupImpl implements SignupDao {
	  @Autowired
	  DataSource datasource;
	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  public void register(Signup signup) {
	    String sql = "insert into users values(?,?,?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { signup.getFirstname(), signup.getEmail_id(), signup.getCre_pwd(),
	    		signup.getCon_pwd(),signup.getNumber() });
	    }
	    public User validateUser(LoginPOJO login) {
	    String sql = "select * from users where username='" + login.getEmail() + "' and password='" + login.getPassword()
	    + "'";
	    List<Signup> users = jdbcTemplate.query(sql, new SignupMapper());
	    return users.size() > 0 ? users.get(0) : null;
	    }
	  }
