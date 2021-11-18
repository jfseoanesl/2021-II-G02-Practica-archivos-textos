/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Futbolista;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jairo
 */
public class ListaArrayList implements IArchivo, Serializable{
    private List<Futbolista> lista;

    public ListaArrayList() {
        this.lista = new ArrayList();
    }
    
    

    @Override
    public List<Futbolista> leer() throws IOException {
        return this.getLista();
    }

    @Override
    public Futbolista buscar(String cc) throws IOException {
        for(Futbolista f: this.getLista()){
            if(f.getCc().equals(cc)){
                return f;
            }
        }
        return null;
    }

    @Override
    public Futbolista eliminar(String cc) throws IOException {
        Iterator<Futbolista> i = this.getLista().iterator();
        while(i.hasNext()){
            Futbolista f = i.next();
            if(f.getCc().equals(cc)){
                i.remove();
                return f;
            }
        }
        return null;
        
    }

    @Override
    public boolean escribir(Futbolista f) throws IOException {
        return this.getLista().add(f);
    }

    /**
     * @return the lista
     */
    public List<Futbolista> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Futbolista> lista) {
        this.lista = lista;
    }
    
}
