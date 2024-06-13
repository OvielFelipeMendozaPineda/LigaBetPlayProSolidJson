package com.ligabetplaysolidpersistencia.negocio.entidades;

public class Equipo {
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
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.PJ = 0;
        this.PG = 0;
        this.PP = 0;
        this.PE = 0;
        this.GF = 0;
        this.GC = 0;
        this.TP = 0;
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
    
}

