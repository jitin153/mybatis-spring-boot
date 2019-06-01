package com.jitin.mybatisspringboot;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
@MapperScan(basePackages = "com.jitin.mybatisspringboot.dao")
public class MybatisSpringBootApplication {
	@Bean
	public SqlSessionFactory SqlSessionFactory(DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setConfigLocation(new ClassPathResource("mapperConfig.xml"));
		return sessionFactory.getObject();
	}
	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringBootApplication.class, args);
	}

}
