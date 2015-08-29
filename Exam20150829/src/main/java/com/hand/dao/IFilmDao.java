package com.hand.dao;

import java.util.List;

import javax.sql.DataSource;

import com.hand.entity.Film;
import com.hand.entity.Language;

public interface IFilmDao {
	
	public void setDataSource(DataSource dataSource);
	
	public void addFilm(Film film);
	
	public List<Language> queryLanguage();

}
