package com.hand.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hand.entity.Language;

public class LanRowMapper implements RowMapper<Language>{
	
	public Language mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Language lan = new Language();
		lan.setLanguageId(rs.getShort("language_id"));
		lan.setName(rs.getString("name"));
		return lan;
	}

}
