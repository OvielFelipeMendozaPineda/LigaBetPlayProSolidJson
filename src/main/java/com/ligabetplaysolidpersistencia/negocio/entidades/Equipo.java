package com.ligabetplaysolidpersistencia.negocio.entidades;

public class Equipo {
    private Long id;
    private String nombre;
    private int PJ;
    private int PG;
    private int PP;
    private int PE;
    private int GF;
    private int GC;
    private int TP;

    public Equipo() {
        
    }
    
    public Equipo(Long id, String nombre, int pJ, int pG, int pP, int pE, int gF, int gC, int tP) {
        this.id = id;
        this.nombre = nombre;
        PJ = pJ;
        PG = pG;
        PP = pP;
        PE = pE;
        GF = gF;
        GC = gC;
        TP = tP;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPJ() {
        return PJ;
    }
    public void setPJ(int pJ) {
        PJ = pJ;
    }
    public int getPG() {
        return PG;
    }
    public void setPG(int pG) {
        PG = pG;
    }
    public int getPP() {
        return PP;
    }
    public void setPP(int pP) {
        PP = pP;
    }
    public int getPE() {
        return PE;
    }
    public void setPE(int pE) {
        PE = pE;
    }
    public int getGF() {
        return GF;
    }
    public void setGF(int gF) {
        GF = gF;
    }
    public int getGC() {
        return GC;
    }
    public void setGC(int gC) {
        GC = gC;
    }
    public int getTP() {
        return TP;
    }
    public void setTP(int tP) {
        TP = tP;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}

