package com.ta.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ta.model.User;

@Service
public class JdbcUserRepository implements UserRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int addNewUser(User user) {
		String sql = "INSERT INTO SUSEENDHIRAN_MATRIMONY_USERS(email,password) VALUES (?,?)";
		return jdbcTemplate.update(sql, new Object[] { user.getEmail(), user.getPassword() });
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int findByEmail(User user) {
		String sql = "SELECT * FROM SUSEENDHIRAN_MATRIMONY_USERS WHERE email = ?";
		int temp = jdbcTemplate.update(sql, new Object[] { user.getEmail()});
		return jdbcTemplate.update(sql, new Object[] { user.getEmail()});
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> findAll() {
		return jdbcTemplate.query("SELECT * from SUSEENDHIRAN_MATRIMONY_USERS",
				BeanPropertyRowMapper.newInstance(User.class));
	}

}
