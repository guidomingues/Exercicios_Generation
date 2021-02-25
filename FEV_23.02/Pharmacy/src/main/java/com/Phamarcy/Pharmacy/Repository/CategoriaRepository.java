package com.Phamarcy.Pharmacy.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Phamarcy.Pharmacy.Categoria.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByProdutoContainingIgnoreCase(String Categoria);
	

}
