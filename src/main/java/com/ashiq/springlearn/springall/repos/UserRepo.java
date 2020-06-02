package com.ashiq.springlearn.springall.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ashiq.springlearn.springall.entity.User;

//how to run
//https://spring.io/guides/gs/accessing-data-mongodb/
//how to define query methods
//https://docs.spring.io/spring-data/mongodb/docs/1.2.0.RELEASE/reference/html/mongo.repositories.html
//https://mkyong.com/spring-data/spring-data-add-custom-method-to-repository/
public interface UserRepo extends MongoRepository<User, String>{
	public User findByMobilenumber(String mobilenumber);

}
