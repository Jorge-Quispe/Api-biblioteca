package com.edu.EXAQUISPEJBACK.entity;

public class biblioteca {
private int idlibro;
private String titulo;
private String fecha;
private String editorial;
public biblioteca() {

}
public biblioteca(int idlibro, String titulo, String fecha, String editorial) {
	super();
	this.idlibro = idlibro;
	this.titulo = titulo;
	this.fecha = fecha;
	this.editorial = editorial;
}
public int getIdlibro() {
	return idlibro;
}
public void setIdlibro(int idlibro) {
	this.idlibro = idlibro;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public String getEditorial() {
	return editorial;
}
public void setEditorial(String editorial) {
	this.editorial = editorial;
}

}
