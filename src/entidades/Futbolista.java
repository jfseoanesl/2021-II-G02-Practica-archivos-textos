/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;


/**
 *
 * @author jairo
 */
public class Futbolista implements Serializable {
    
    private String cc;
    private String nombre;
    private String equipo;
    private int noGoles;
    private int noPartidos;
    private double promedioGoles;

    public Futbolista(String cc, String nombre, String equipo, int noGoles, int noPartidos) {
        this.cc = cc;
        this.nombre = nombre;
        this.equipo = equipo;
        this.noGoles = noGoles;
        this.noPartidos = noPartidos;
        this.promedioGoles = (double)this.noGoles/this.noPartidos;
    }

    public Futbolista() {
    }

    /**
     * @return the cc
     */
    public String getCc() {
        return cc;
    }

    /**
     * @param cc the cc to set
     */
    public void setCc(String cc) {
        this.cc = cc;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the equipo
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    /**
     * @return the noGoles
     */
    public int getNoGoles() {
        return noGoles;
    }

    /**
     * @param noGoles the noGoles to set
     */
    public void setNoGoles(int noGoles) {
        this.noGoles = noGoles;
    }

    /**
     * @return the noPartidos
     */
    public int getNoPartidos() {
        return noPartidos;
    }

    /**
     * @param noPartidos the noPartidos to set
     */
    public void setNoPartidos(int noPartidos) {
        this.noPartidos = noPartidos;
    }

    /**
     * @return the promedioGoles
     */
    public double getPromedioGoles() {
        return promedioGoles;
    }

    /**
     * @param promedioGoles the promedioGoles to set
     */
    public void setPromedioGoles(double promedioGoles) {
        this.promedioGoles = promedioGoles;
    }
    
    public String getDatosArchivoTexto(){
        return this.cc+";"+
               this.nombre+";"+ 
               this.equipo+";"+ 
               this.noGoles+";"+ 
               this.noPartidos+";"+ 
               this.promedioGoles;
    }
    
}
