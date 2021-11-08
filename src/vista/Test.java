/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.ArchivoGoleadores;
import entidades.Futbolista;
import java.util.List;

/**
 *
 * @author jairo
 */
public class Test {
    
    public static void main(String[] args) {
        
        ArchivoGoleadores archivo = new ArchivoGoleadores();
        Futbolista f1 = new Futbolista("123", "Valenciano", "Junior", 100, 70);
        
        archivo.escribir(f1);
        
        List<Futbolista> goleadores = archivo.leer();
        imprimirLista(goleadores);
        
    }
    
    public static void imprimirFutbolista(Futbolista f){
        System.out.printf("%10s %20s %10s %10d %10d %10.2f%n", f.getCc(), f.getNombre(), f.getEquipo(),
                f.getNoGoles(), f.getNoPartidos(), f.getPromedioGoles());
    }
    
    public static void imprimirLista(List<Futbolista> lista){
        for(Futbolista f: lista ){
            imprimirFutbolista(f);
        }
    }
    
}
