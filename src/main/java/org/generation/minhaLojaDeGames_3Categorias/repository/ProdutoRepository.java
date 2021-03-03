package org.generation.minhaLojaDeGames_3Categorias.repository;

import java.util.List;

import org.generation.minhaLojaDeGames_3Categorias.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
