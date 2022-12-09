package com.example.ApiG11.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiG11.Modelos.UsuarioModelo;
import com.example.ApiG11.Servicios.UsuarioServicio;

@RestController
//https://paginadeportesbackend-production.up.railway.app/usuario
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioControlador {

    @Autowired
    UsuarioServicio servicio;

    //https://paginadeportesbackend-production.up.railway.app/usuario/guardar
    @PostMapping("/guardar")
    public UsuarioModelo guardar(@RequestBody UsuarioModelo usuario){
        return servicio.guardarUsuario(usuario);
    }

    //https://paginadeportesbackend-production.up.railway.app/usuario/consultar
    @GetMapping("/consultar")
    public ArrayList<UsuarioModelo> consultarUsuario(){
        return servicio.consultarUsuarios();
    }

    //https://paginadeportesbackend-production.up.railway.app/loc/usuario/consultaFecha/
    @GetMapping("/consultaFecha/{fecha}")
    public Optional<UsuarioModelo> consultaFecha(@PathVariable("fecha")Long fecha){
        return servicio.consultaFecha(fecha);
    }
    
}
