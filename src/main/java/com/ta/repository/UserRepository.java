package com.ta.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Repository;

import com.ta.model.User;

@Configurable
@Repository
public interface UserRepository {
	int addNewUser(User user);

	int updateUser(User user);

	int findByEmail(User user);

	int deleteById(int id);

	List<User> findAll();

}
