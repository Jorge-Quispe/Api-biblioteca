package com.edu.EXAQUISPEJBACK.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.edu.EXAQUISPEJBACK.dao.bibliotecadao;
import com.edu.EXAQUISPEJBACK.entity.biblioteca;
@Repository
public class bibliotecadaoimp implements bibliotecadao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public List<biblioteca>  readAll() {
		return jdbctemplate.query("select * from libro", BeanPropertyRowMapper.newInstance(biblioteca.class));
	}

	@Override
	public biblioteca listarid(int idlibro) {
		return null;
	}

	@Override
	public biblioteca add(biblioteca b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public biblioteca edit(biblioteca b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public biblioteca delete(biblioteca b) {
		// TODO Auto-generated method stub
		return null;
	}

}
