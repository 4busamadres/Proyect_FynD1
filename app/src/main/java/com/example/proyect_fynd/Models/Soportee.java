package com.example.proyect_fynd.Models;

public class Soportee {
    private String nombre;
    private String correo;
    private String problema;

    public Soportee(String nombre, String correo, String problema) {
        this.nombre = nombre;
        this.correo = correo;
        this.problema = problema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }
}
