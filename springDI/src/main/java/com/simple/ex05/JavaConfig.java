package com.simple.ex05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simple.ex01.Hello;
import com.simple.ex02.Chef;
import com.simple.ex02.Hotel;
import com.simple.ex03.DataSource;
import com.simple.ex03.MemberDAO;

@Configuration//스프링 설정파일로 쓰겠다는 뜻
public class JavaConfig {
	
	@Bean
	public Hello gildong() {
		return new Hello();
	}
	
	@Bean Chef chef() {
		return new Chef();
	}
	
	@Bean
	public Hotel hotel() {
		return new Hotel(chef());
	}
	
	@Bean
	public DataSource dataSource() {
		
		DataSource ds = new DataSource();
		ds.setUid("jsp");
		ds.setUrl("깔깔깔");
		ds.setUpw("낄렵");
		
		return ds;
	}
	
	@Bean
	public MemberDAO memberDAO() {
		
		MemberDAO memDAO = new MemberDAO();
		memDAO.setDataSource(dataSource());
		return memDAO;
	}
	
	
}
