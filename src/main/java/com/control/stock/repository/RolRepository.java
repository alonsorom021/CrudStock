package com.control.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.control.stock.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
	/**
     * Busca un Rol por su nombre.
     *
     * @param name El nombre del Rol a buscar.
     * @return El Rol con el nombre dado, o null si no se encuentra ningún Rol con ese nombre.
     */
    Rol findByNombre(String name);
}
