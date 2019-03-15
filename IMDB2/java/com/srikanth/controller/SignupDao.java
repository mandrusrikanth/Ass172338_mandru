package com.srikanth.controller;

import com.pojo.Signup;

public interface SignupDao {
	 void register(RegistrationController signup);
	  Signup validateUser(LoginPOJO login);

}
