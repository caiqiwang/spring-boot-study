package com.example.springbootstudy.jdbcTempale;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.springbootstudy.dao.UserDao;
import com.example.springbootstudy.entity.User;

@Service
public class JdbcTemplateTest implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void create(String name, int age) {
		// TODO Auto-generated method stub
		String sql = "insert into User(name,age) value(?,?) ";
		jdbcTemplate.update(sql, name, age);
	}

	@Override
	public User selectByName(String name) {
		// TODO Auto-generated method stub
		String sql = "select from User where name=?";
		List<User> userlist = jdbcTemplate.query(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, name);
				return ps;
			}
		}, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
				return user;
			}
		});
		return null;
	}

	@Override
	public void DeleteAll() {
		// TODO Auto-generated method stub
		String sql = "delete form User";
		jdbcTemplate.update(sql);
	}

	@Override
	public void DeleteByName(String name) {
		// TODO Auto-generated method stub
		String sql = "delete from User where name=?";
		jdbcTemplate.update(sql, name);
	}

}
