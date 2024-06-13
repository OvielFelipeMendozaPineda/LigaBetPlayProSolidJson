package com.ligabetplaysolidpersistencia.negocio.entidades;

 abstract public class Team {
    private long id;
    private String nombre;
    private int edad;
    private String rol;
    
    public Team() {
    }

    public Team(long id, String nombre, int edad, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.rol = rol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}