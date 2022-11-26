package com.mycompany.lab7p1_salvador_macias;

/**
 *
 * @author user
 */
public class avion {

    private String codigo;
    private int año;
    private String nom_aerolinea;
    private int cap_p;
    private String modelo;
    private int peso;

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getcapacidad() {
        return cap_p;
    }

    public void setcapacidad(int cap_p) {
        this.cap_p = cap_p;
    }

    public int getpeso() {
        return peso;
    }

    public void setpeso(int peso) {
        this.peso = peso;
    }

    public String getaerolinea() {
        return nom_aerolinea;
    }

    public void setaerolinea(String nom_aerolinea) {
        this.nom_aerolinea = nom_aerolinea;
    }

    public String getestado(int estado) {
        String estado_av = "";
        if (estado == 1) {
            estado_av = "despegando";
        } else if (estado == 2) {
            estado_av = "aterrizando";
        } else if (estado == 3) {
            estado_av = "estacionado";
        } else {
            System.out.println("Estado invalido");
        }
        return estado_av;

    }

}
