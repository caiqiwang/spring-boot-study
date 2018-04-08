package com.example.springbootstudy.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@Configurable
public class JdbcTemplateConfig { // jdbc 支持
	@Bean(name = "primaryJdbcTemplate")
	public JdbcTemplate primaryDatasource(@Qualifier("primaryDataSource") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean(name = "secondarJdbcTemplate")
	public JdbcTemplate secondarDatasource(@Qualifier("secondarDataSource") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
