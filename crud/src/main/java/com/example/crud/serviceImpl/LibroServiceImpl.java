package com.example.crud.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.dao.LibroDao;
import com.example.crud.entity.LibroEntity;
import com.example.crud.service.LibroService;

import jakarta.transaction.Transactional;

@Service
public class LibroServiceImpl implements LibroService {

	private final LibroDao libroDao;

	@Autowired

	public LibroServiceImpl(LibroDao libroDao) {
		this.libroDao = libroDao;
	}

	@Override
	@Transactional
	public List<LibroEntity> listarLibros() {
		// TODO Auto-generated method stub
		return libroDao.findAll();
	}

	@Override
	@Transactional
	public LibroEntity listarLibroPorId(long id) {
		// TODO Auto-generated method stub
		return libroDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public LibroEntity crearLibro(LibroEntity libro) {
		// TODO Auto-generated method stub
		return libroDao.save(libro);
	}

	@Override
	@Transactional
	public LibroEntity updateLibro(Long id, LibroEntity newLibro) {
		LibroEntity libroExistente = libroDao.findById(id).orElse(null);

		if (libroExistente != null) {
			if (newLibro.getTitulo() != null) {
				libroExistente.setTitulo(newLibro.getTitulo());
			}
			if (newLibro.getCodigo() != null) {
				libroExistente.setCodigo(newLibro.getCodigo());
			}

			if (newLibro.getnPaginas() != null) {
				libroExistente.setnPaginas(newLibro.getnPaginas());
			}

			if (newLibro.getPrecio() != null) {
				libroExistente.setPrecio(newLibro.getPrecio());
			}

			if (newLibro.getStock() != null) {
				libroExistente.setStock(newLibro.getStock());
			}

			if (newLibro.getStock() != null) {
				libroExistente.setStock(newLibro.getStock());
			}

			
			if (newLibro.getCategoria() != null) {
				libroExistente.setCategoria(newLibro.getCategoria());
			}

			if (newLibro.getCategoria() != null) {
				libroExistente.setCategoria(newLibro.getCategoria());
			}

			if (newLibro.getEditorial() != null) {
				libroExistente.setEditorial(newLibro.getEditorial());
			}

			if (newLibro.getAutor() != null) {
				libroExistente.setAutor(newLibro.getAutor());
			}
			return libroDao.save(libroExistente);

		} else {
			return null;
		}
	}

	@Override
	@Transactional
	public void deleteLibro(Long id) {
		libroDao.deleteById(id);

	}

}
