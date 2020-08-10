package com.edu.EXAQUISPEJBACK.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.EXAQUISPEJBACK.dao.bibliotecadao;
import com.edu.EXAQUISPEJBACK.entity.biblioteca;
import com.edu.EXAQUISPEJBACK.service.bibliotecaservice;
@Service
public class bibliotecaserviceimp implements bibliotecaservice {
	@Autowired
	private bibliotecadao blibliotecaDao;
	@Override
	public List<biblioteca>  readAll() {
		// TODO Auto-generated method stub
		return blibliotecaDao.readAll();
	}

	@Override
	public biblioteca listarid(int idlibro) {
		// TODO Auto-generated method stub
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
