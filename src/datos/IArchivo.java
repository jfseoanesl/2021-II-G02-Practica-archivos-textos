/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Futbolista;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jairo
 */
public interface IArchivo {
     public List<Futbolista> leer() throws IOException;
     public Futbolista buscar(String cc) throws IOException ;
     public Futbolista eliminar(String cc) throws IOException;
     public boolean escribir (Futbolista f) throws IOException;
}
