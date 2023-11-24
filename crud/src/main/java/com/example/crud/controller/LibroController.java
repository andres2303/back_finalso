package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.entity.LibroEntity;
import com.example.crud.service.LibroService;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")  
@RestController
@RequestMapping("/api/libros")
public class LibroController {

	@Autowired
	private LibroService libroService;

	@GetMapping("/listar")
	public ResponseEntity<List<LibroEntity>> listarLibros() {
		List<LibroEntity> libros = libroService.listarLibros();
		return new ResponseEntity<>(libros, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<LibroEntity> listarLibroPorId(@PathVariable Long id) {
		LibroEntity libro = libroService.listarLibroPorId(id);
		if (libro != null) {
			return new ResponseEntity<>(libro, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/crear")
	public ResponseEntity<LibroEntity> crearLibro(@RequestBody LibroEntity libro) {
		LibroEntity newLibro = libroService.crearLibro(libro);
		return new ResponseEntity<>(newLibro, HttpStatus.CREATED);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<LibroEntity> updateLibro(@PathVariable Long id, @RequestBody LibroEntity updatedLibro) {

		LibroEntity libroActualizado = libroService.updateLibro(id, updatedLibro);

		if (libroActualizado != null) {
			return new ResponseEntity<>(libroActualizado, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> deleteEliminar(@PathVariable Long id) {
		libroService.deleteLibro(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
