package com.example.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "libro")
public class LibroEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_libros")
	private Long idLibros;

	@Column(name = "titulo")
	@NotBlank(message = "El campo 'titulo' no puede estar en blanco")
	private String titulo;

	@Column(name = "codigo")
	@NotBlank(message = "El campo 'codigo' no puede estar en blanco")
	private String codigo;

	@Column(name = "n_paginas")
	private Integer nPaginas;

	@Column(name = "precio")
	private Double precio;

	@Column(name = "stock")
	private Integer stock;


@Column(name = "categoria")
	private String categoria;

	@Column(name = "editorial")
	private String editorial;

 @Column(name = "autor")
	private String autor;

public Long getIdLibros() {
	return idLibros;
}

public void setIdLibros(Long idLibros) {
	this.idLibros = idLibros;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public Integer getnPaginas() {
	return nPaginas;
}

public void setnPaginas(Integer nPaginas) {
	this.nPaginas = nPaginas;
}

public Double getPrecio() {
	return precio;
}

public void setPrecio(Double precio) {
	this.precio = precio;
}

public Integer getStock() {
	return stock;
}

public void setStock(Integer stock) {
	this.stock = stock;
}



public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public String getEditorial() {
	return editorial;
}

public void setEditorial(String editorial) {
	this.editorial = editorial;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}
 
 

}
