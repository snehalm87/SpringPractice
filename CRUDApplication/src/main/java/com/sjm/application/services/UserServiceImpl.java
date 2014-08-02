package com.sjm.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.sjm.application.model.User;
import com.sjm.application.service.interfaces.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	MongoTemplate mongoTemplate;
	
	public static String USER_COLLECTION_NAME = "user";
	
	/*@Override
	public User getUsername(String userId,Object value) {
		// TODO Auto-generated method stub
		return mongoTemplate.find(new Query(Criteria.where("username").is(username)), SellerIdentity.class, SELLER_IDENTITY_COLLECTION_NAME);
	}*/

	@Override
	public String getUserAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveUser(User user) {
		mongoTemplate.save(user,USER_COLLECTION_NAME);
		return user.getUserId();
	}

	@Override
	public String getUsername(String userId, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

}
