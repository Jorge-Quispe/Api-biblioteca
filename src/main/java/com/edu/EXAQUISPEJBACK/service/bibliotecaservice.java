package com.edu.EXAQUISPEJBACK.service;

import java.util.List;

import com.edu.EXAQUISPEJBACK.entity.biblioteca;

public interface bibliotecaservice {
	public List<biblioteca> readAll();
	biblioteca listarid(int idlibro);
	biblioteca add(biblioteca b);
	biblioteca edit(biblioteca b);
	biblioteca delete(biblioteca b);
}
