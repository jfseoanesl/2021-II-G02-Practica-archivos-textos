/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.ArchivoGoleadores;
import entidades.Futbolista;
import java.util.List;

/**
 *
 * @author jairo
 */
public class RegistroGoleadores {
    private ArchivoGoleadores datos;

    public RegistroGoleadores() {
        this.datos = new ArchivoGoleadores();
    }

    /**
     * @return the datos
     */
    public ArchivoGoleadores getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(ArchivoGoleadores datos) {
        this.datos = datos;
    }
    
    
    public boolean registrar(Futbolista f){
        return this.datos.escribir(f);
    }
    
    public List<Futbolista> leer(){
        return this.datos.leer();
    }
    
    public Futbolista eliminar(String cc){
        return this.datos.eliminar(cc);
    }
    
    public Futbolista buscar(String cc){
        return this.datos.buscar(cc);
    }
    
    public boolean mofdificar(Futbolista f){
        return true;
    }
    
    public List<Futbolista> leer(double prome){
      return null;
    }
}
