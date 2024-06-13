package com.ligabetplaysolidpersistencia.negocio.entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Partido {
    private Long id;
    private LocalDate fecha;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int GolesLocal;
    private int GolesVisitante;
    private Equipo equipoGanador;
    private Equipo equipoPerdedor;
    private ArrayList<Jugador> goleadores;
    private ArrayList<Jugador> tarjetasAmarillas;
    private ArrayList<Jugador> tarjetasRojas;

    public Partido() {
    }

    public Partido(Long id, LocalDate fecha, Equipo equipoLocal, Equipo equipoVisitante, int golesLocal,
            int golesVisitante, Equipo equipoGanador, Equipo equipoPerdedor, ArrayList<Jugador> goleadores,
            ArrayList<Jugador> tarjetasAmarillas, ArrayList<Jugador> tarjetasRojas) {
        this.id = id;
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        GolesLocal = golesLocal;
        GolesVisitante = golesVisitante;
        this.equipoGanador = equipoGanador;
        this.equipoPerdedor = equipoPerdedor;
        this.goleadores = goleadores;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolesLocal() {
        return GolesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        GolesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return GolesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        GolesVisitante = golesVisitante;
    }

    public Equipo getEquipoGanador() {
        return equipoGanador;
    }

    public void setEquipoGanador(Equipo equipoGanador) {
        this.equipoGanador = equipoGanador;
    }

    public Equipo getEquipoPerdedor() {
        return equipoPerdedor;
    }

    public void setEquipoPerdedor(Equipo equipoPerdedor) {
        this.equipoPerdedor = equipoPerdedor;
    }

    public ArrayList<Jugador> getGoleadores() {
        return goleadores;
    }

    public void setGoleadores(ArrayList<Jugador> goleadores) {
        this.goleadores = goleadores;
    }

    public ArrayList<Jugador> getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(ArrayList<Jugador> tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public ArrayList<Jugador> getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(ArrayList<Jugador> tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}