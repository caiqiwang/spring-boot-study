package com.example.springbootstudy.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

@Configurable
public class DataSourceConfig { // 数据源配置
	private DataSource dataSource;

	@Bean(name = "primaryDataSource")
	@Qualifier("primaryDataSource")
	@ConfigurationProperties(prefix = "spring.dataSource.primary")
	public DataSource primaryDataSource() { // 配置主数据源，以spring.dataSource.primary开头
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "SecondarDataSource")
	@Qualifier("SecondarDataSource")
	@ConfigurationProperties(prefix = "spring.dataSource.secondar")
	public DataSource SecondarDataSource() {// 配置第二数据源，以spring.dataSource.secondar开头
		return DataSourceBuilder.create().build();
	}
}
