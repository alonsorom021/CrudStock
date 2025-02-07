package com.control.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.control.stock.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> { 

	/**
	 * Busca un Usuario por su correo electrónico.
     *
     * @param correo El correo electrónico del Usuario a buscar.
     * @return El Usuario con el correo electrónico dado, o null si no se encuentra ningún Usuario con ese correo electrónico.
     */
    Usuario findByCorreo(String correo);
}
