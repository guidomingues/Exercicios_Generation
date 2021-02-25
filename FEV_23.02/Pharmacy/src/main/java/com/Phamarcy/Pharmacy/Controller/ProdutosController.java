package com.Phamarcy.Pharmacy.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Phamarcy.Pharmacy.Categoria.Categoria;
import com.Phamarcy.Pharmacy.Repository.CategoriaRepository;

@RestController
@RequestMapping ("/produtos")
@CrossOrigin("*")

public class ProdutosController {
	@Autowired
	private CategoriaRepository repository; 
	
	@GetMapping
	public ResponseEntity<List<Categoria>>GetAll(){
		return ResponseEntity.ok(repository.findAll());
		 
		
	}
	
}
