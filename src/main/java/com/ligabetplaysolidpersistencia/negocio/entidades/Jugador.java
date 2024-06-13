package com.ligabetplaysolidpersistencia.negocio.entidades;

import java.time.LocalDate;

public class Jugador extends Team {
    private int dorsal;
    private String posicion;
    private String nacionalidad;
    private LocalDate fechaIngreso;
    private int golesAnotados;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    
    public Jugador() {
    }

    public Jugador(long id, String nombre, int edad, String rol, int dorsal, String posicion, String nacionalidad,
            LocalDate fechaIngreso) {
        super(id, nombre, edad, rol);
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
        this.fechaIngreso = fechaIngreso;
        this.golesAnotados = 0;
        this.tarjetasAmarillas = 0;
        this.tarjetasRojas = 0;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }
    
}