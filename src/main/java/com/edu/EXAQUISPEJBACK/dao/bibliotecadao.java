package com.edu.EXAQUISPEJBACK.dao;

import java.util.List;

import com.edu.EXAQUISPEJBACK.entity.biblioteca;

public interface bibliotecadao {
	public List<biblioteca> readAll();
	public biblioteca listarid(int idlibro);
	public biblioteca add(biblioteca b);
	public biblioteca edit(biblioteca b);
	public biblioteca delete(biblioteca b);
}
