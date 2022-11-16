package com.ta.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Repository;

import com.ta.model.User;

@Configurable
@Repository
public interface UserRepository {
	int save(User user);

	int update(User user);

	User findById(int id);

	int deleteById(int id);

	List<User> findAll();

}
