package org.generation.minhaLojaDeGames_3Categorias.repository;

import java.util.List;

import org.generation.minhaLojaDeGames_3Categorias.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}
