package org.generation.minhaLojaDeGames_3Categorias.repository;

import java.util.List;
import java.util.Optional;

import org.generation.minhaLojaDeGames_3Categorias.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}
