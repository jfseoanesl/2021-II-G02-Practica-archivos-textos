/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.ArchivoGoleadores;
import entidades.Futbolista;
import java.util.List;
import modelo.RegistroGoleadores;

/**
 *
 * @author jairo
 */
public class Test {
    
    public static void main(String[] args) {
        
        RegistroGoleadores modelo = new RegistroGoleadores();
        Futbolista f1 = new Futbolista("123", "Valenciano", "Junior", 100, 70);
        Futbolista f2 = new Futbolista("456", "Ronaldo", "Madrid", 100, 70);
        Futbolista f3 = new Futbolista("789", "Falcao", "Rayo", 100, 70);
        Futbolista f4 = new Futbolista("543", "Seoanes", "Liverpool", 100, 70);
        
        modelo.registrar(f1);
        modelo.registrar(f2);
        modelo.registrar(f3);
        modelo.registrar(f4);
        System.out.println("---------------------");
        Futbolista eliminado = modelo.eliminar("123");
        System.out.println("Futbolista eliminado: ");
        imprimirFutbolista(eliminado);
        System.out.println("---------------------");
        System.out.println("Futbolista buscado: ");
        Futbolista buscado = modelo.buscar("789");
        if(buscado!=null)
            imprimirFutbolista(buscado);
        else
            System.out.println("El futbolista de cedula 555 no se encuentra en el archivo");
        System.out.println("---------------------");
        System.out.println("Futbolista en el archivo: ");
        List<Futbolista> goleadores = modelo.leer();
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
