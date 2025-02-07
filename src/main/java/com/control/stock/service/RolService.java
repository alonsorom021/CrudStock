package com.control.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.control.stock.entity.Rol;
import com.control.stock.repository.RolRepository;

@Service
public class RolService {

    /**
     * Inyección de dependencias del repositorio de roles.
     */
    @Autowired
    private RolRepository rolRepository;

    /**
     * Obtiene todos los roles de la base de datos.
     *
     * @return una lista de todos los roles.
     */
    public List<Rol> getAllRoles(){
        return rolRepository.findAll();
    }

    /**
     * Busca un Rol por su nombre.
     *
     * @param name El nombre del Rol a buscar.
     * @return El Rol con el nombre dado, o null si no se encuentra ningún Rol con ese nombre.
     */
    public Rol findByNombre(String name){
        return rolRepository.findByNombre(name);
    }

    /**
     * Guarda un Rol en la base de datos.
     *
     * @param rol El Rol a guardar.
     * @return El Rol guardado.
     */
    public Rol save(Rol rol){
        return rolRepository.save(rol);
    }

}