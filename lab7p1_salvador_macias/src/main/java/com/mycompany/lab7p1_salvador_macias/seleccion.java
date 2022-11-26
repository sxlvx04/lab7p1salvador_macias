
package com.mycompany.lab7p1_salvador_macias;

/**
 *
 * @author user
 */
public class seleccion {
     
//atributos
     private String entrenador;
     private String grupo;
     private int jugadores_con;
     private String mundial;
     private String posicion;
     private  int acum_goles;
     private String nom;
      
     public String nom_g() {
        return grupo;
    }

    public void nom_g(String grupo) {
        this.grupo = grupo;
    }

    public String nom_sele() {
        return nom;
    }

    public void nom_sele(String neim_sele) {
        this.nom = neim_sele;
    }

    public String coach() {
        return entrenador;
    }

    public void coach(String d_t) {
        this.entrenador = d_t;
    }

    public int jugadores() {
        return jugadores_con;
    }

    public void jugadores(int convocatoria) {
        this.jugadores_con = convocatoria;
    }

    public String mundial_ganado() {
        return mundial;
    }

    public void mundial_ganado(String mundi_ganado) {
        this.mundial = mundi_ganado;
    }

    public String pos() {
        return posicion;
    }

    public void pos(String posicion_Tabla) {
        this.posicion = posicion_Tabla;
    }

    public int goles_cantidad() {
        return acum_goles;
    }

    public void goles_cantidad(int cant_g) {
        this.acum_goles = cant_g;
    }

        
}
         
     
     
    


    

