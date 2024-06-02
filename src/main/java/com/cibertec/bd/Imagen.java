package com.cibertec.bd;

import java.io.Serializable;

public class Imagen implements Serializable {
    
    private String nombre;
    private int tamano;
    private byte[] datos;
    private String ruta;
   

    public Imagen() {
    }
    
    public Imagen(String nombre, int tamano, byte[] datos, String ruta) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.datos = datos;
        this.ruta = ruta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public byte[] getDatos() {
        return datos;
    }

    public void setDatos(byte[] datos) {
        this.datos = datos;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }


}
