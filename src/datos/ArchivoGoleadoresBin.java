/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Futbolista;
import java.io.*;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jairo
 */
public class ArchivoGoleadoresBin implements IArchivo {
    
    private File archivo;
    private FileOutputStream aEscritura;
    private FileInputStream aLectura;

    public ArchivoGoleadoresBin() {
        this.archivo = new File("ListaGoleadoresObjetos.dat");
    }
    
    
    private boolean guardarLista(ListaArrayList lista) throws IOException{
        
        this.aEscritura = new FileOutputStream(this.archivo);
        ObjectOutputStream escritor = new ObjectOutputStream(this.aEscritura);
        escritor.writeObject(lista);
        escritor.close();
        this.aEscritura.close();
        return true;
        
    }
    
    private ListaArrayList leerLista()throws IOException{
       if(this.archivo.exists()){
           this.aLectura = new FileInputStream(this.archivo);
           ObjectInputStream lector = new ObjectInputStream(this.aLectura);
           try{
                ListaArrayList lista = (ListaArrayList)lector.readObject();
                return lista;
           }catch(ClassNotFoundException nfe){
               throw new IOException("Error al leer");
           } finally{
                   lector.close();
                   this.aLectura.close();
           }
       }
       else{
            return new ListaArrayList();
       }
    }

    @Override
    public List<Futbolista> leer() throws IOException {
       ListaArrayList lista = this.leerLista();
       return lista.getLista();
      
    }

    @Override
    public Futbolista buscar(String cc) throws IOException {
        ListaArrayList lista = this.leerLista();
        return lista.buscar(cc);
        
    }

    @Override
    public Futbolista eliminar(String cc) throws IOException {
        ListaArrayList lista = this.leerLista();
        Futbolista eliminado = lista.eliminar(cc);
        this.guardarLista(lista);
        return eliminado;
        
    }

    @Override
    public boolean escribir(Futbolista f) throws IOException {
        ListaArrayList lista = this.leerLista();
        lista.escribir(f);
        return this.guardarLista(lista);
        
    }
    
}
