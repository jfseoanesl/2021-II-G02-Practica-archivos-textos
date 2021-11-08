/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Futbolista;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jairo
 */
public class ArchivoGoleadores {
    private File archivo;
    private FileWriter aEscritura;
    private Scanner aLectura;

    public ArchivoGoleadores() {
        this.archivo = new File("GoleadoresLiga1.dat");
    }
    
    public ArchivoGoleadores(String name){
        this.archivo = new File(name);
    }

    /**
     * @return the archivo
     */
    public File getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    /**
     * @return the aEscritura
     */
    public FileWriter getaEscritura() {
        return aEscritura;
    }

    /**
     * @param aEscritura the aEscritura to set
     */
    public void setaEscritura(FileWriter aEscritura) {
        this.aEscritura = aEscritura;
    }

    /**
     * @return the aLectura
     */
    public Scanner getaLectura() {
        return aLectura;
    }

    /**
     * @param aLectura the aLectura to set
     */
    public void setaLectura(Scanner aLectura) {
        this.aLectura = aLectura;
    }
    
    public Futbolista leerFutbolista(String linea[]){
        Futbolista f = new Futbolista();
        f.setCc(linea[0]);
        f.setNombre(linea[1]);
        f.setEquipo(linea[2]);
        f.setNoGoles(Integer.valueOf(linea[3]));
        f.setNoPartidos(Integer.valueOf(linea[4]));
        f.setPromedioGoles(Double.valueOf(linea[5]));
        return f;
    }
    
    public List<Futbolista> leer(){
        List<Futbolista> lista = null;
       
        
        try {
            this.aLectura = new Scanner(this.archivo);
            lista = new ArrayList();
            while(this.aLectura.hasNext()){
                String linea[] = this.aLectura.nextLine().split(";");
                Futbolista f = this.leerFutbolista(linea);
                lista.add(f);
            }
            return lista;
            
       
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer el archivo");
            return null;
        }
        finally{
            if(this.aLectura!=null)
                this.aLectura.close();
        }
        
        
    }
    
    public boolean escribir (Futbolista f){
        
        PrintWriter escritor=null;
        boolean exito = false;
        try{
            this.aEscritura = new FileWriter(this.archivo, true);
            escritor = new PrintWriter(this.aEscritura);
            escritor.println(f.getDatosArchivoTexto());
            exito = true;
            
        }catch(IOException ioe){
            System.out.println("Error al abrir el archvio en modo escritura");
            exito=false;
        }
        finally{
            if(escritor!=null)
                escritor.close();
            
            if(this.aEscritura!=null){
                try{
                    this.aEscritura.close();
                }catch(IOException io){
                    System.out.println(io);
                }    
            }    
            
            return exito;
        }
        
    }
    
    
}