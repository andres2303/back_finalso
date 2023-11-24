package com.example.crud.service;
import java.util.List;

import com.example.crud.entity.LibroEntity;
public interface LibroService {
	
	List<LibroEntity>listarLibros();
	LibroEntity listarLibroPorId(long id);
	LibroEntity crearLibro(LibroEntity libro);
	LibroEntity updateLibro(Long id, LibroEntity newLibro);
	void deleteLibro(Long id);

}
