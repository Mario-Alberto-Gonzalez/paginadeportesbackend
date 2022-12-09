package com.example.ApiG11.Modelos;

import org.springframework.data.annotation.Id;

public class UsuarioModelo {
    @Id
    private Long fecha;
    private String deporte;
    private String equipo1;
    private String equipo2;
    private int numero;
    private int marcador1;
    private int marcador2;
    
    public Long getFecha() {
        return fecha;
    }
    public void setFecha(Long fecha) {
        this.fecha = fecha;
    }
    public String getDeporte() {
        return deporte;
    }
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    public String getEquipo1() {
        return equipo1;
    }
    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }
    public String getEquipo2() {
        return equipo2;
    }
    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getMarcador1() {
        return marcador1;
    }
    public void setMarcador1(int marcador1) {
        this.marcador1 = marcador1;
    }
    public int getMarcador2() {
        return marcador2;
    }
    public void setMarcador2(int marcador2) {
        this.marcador2 = marcador2;
    }

    
    
}
