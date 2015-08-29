package com.hand.dao.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hand.dao.IFilmDao;

@Configuration
public class DaoConfig {
	@Bean
	public IFilmDao filmDao() {
		return new FilmDaoImpl();
	}
}
