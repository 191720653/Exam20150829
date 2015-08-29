package com.hand.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hand.dao.IFilmDao;
import com.hand.entity.Film;
import com.hand.entity.Language;
import com.hand.mapper.LanRowMapper;

public class FilmDaoImpl implements IFilmDao {

	private JdbcTemplate jdbcTemplateObject = null;

	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<Language> queryLanguage() {
		System.out.println("query language......");
		List<Language> list = null;
		try {
			String SQL = "select language_id,name from language";
			list = jdbcTemplateObject.query(SQL, new LanRowMapper());
			// throw new RuntimeException("simulate Error condition");
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			throw e;
		}
		return list;
	}

	public void addFilm(Film film) {
		// TODO Auto-generated method stub
		System.out.println("add Film......");
		try {
			String SQL = "INSERT INTO film(title,language_id,rental_duration,rental_rate,replacement_cost,last_update) VALUES(?, ?, ?, ?, ?, NOW());";
			jdbcTemplateObject.update(SQL, film.getTitle(), film.getLanguageId(), film.getRentalDuration(),
					film.getRentalRate(), film.getReplacementCost());
			// throw new RuntimeException("simulate Error condition");
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			throw e;
		}
	}

}
