package com.sjm.application.service.interfaces;

import com.sjm.application.model.User;

public interface UserService {

	public String getUsername(String userId,Object value);
	public String getUserAddress();
	public String saveUser(User user);
}
