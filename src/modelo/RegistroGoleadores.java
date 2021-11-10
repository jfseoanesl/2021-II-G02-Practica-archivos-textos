/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.ArchivoGoleadoresTexto;
import entidades.Futbolista;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jairo
 */
public class RegistroGoleadores {
    private ArchivoGoleadoresTexto datos; //

    public RegistroGoleadores() {
        this.datos = new ArchivoGoleadoresTexto();
    }

    /**
     * @return the datos
     */
    public ArchivoGoleadoresTexto getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(ArchivoGoleadoresTexto datos) {
        this.datos = datos;
    }
    
    
    public boolean registrar(Futbolista f) throws IOException{
        return this.datos.escribir(f);
    }
    
    public List<Futbolista> leer() throws IOException{
        return this.datos.leer();
    }
    
    public Futbolista eliminar(String cc) throws IOException{
        return this.datos.eliminar(cc);
    }
    
    public Futbolista buscar(String cc) throws IOException{
        return this.datos.buscar(cc);
    }
   
    /* Para implementar
    public boolean mofdificar(Futbolista f){
        return true;
    }
    
    public List<Futbolista> leer(double prome){
      return null;
    }
    */
}
