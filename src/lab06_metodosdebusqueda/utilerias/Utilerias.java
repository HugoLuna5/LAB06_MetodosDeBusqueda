/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_metodosdebusqueda.utilerias;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Utilerias {

    
    /**
     * Metodo para leer archivos de texto
     * @param nombre
     * @return 
     */
    public String leer(String nombre) {
        File fichero = new File(nombre);
        Scanner s = null;
        String texto = "";

        try {
            System.out.println("leemos el contenido del fichero");
            s = new Scanner(fichero);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                texto = linea;
                //System.out.println(linea);
            }
        } catch (Exception ex) {
            System.out.println("Mensaje:" + ex.getMessage());

        } finally {

            try {
                if (s != null) {
                    s.close();
                }

            } catch (Exception ex2) {
                System.out.println("Mensaje 2:" + ex2.getMessage());
            }
        }

        return texto;
    }

    /**
     * Metodo para convertir un vector de datos de tipo cadena
     * a un vector de tipo de datos entero
     * @param n
     * @param datos
     * @return 
     */
    public int[] convertirVector(int n, String datos[]) {
        int vector[] = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(datos[i]);

        }

        return vector;

    }

    /**
     * Algoritmo de ordenamiento burbuja
     * @param vector
     * @return 
     */
    public int[] burbuja(int vector[]) {

        int n = vector.length;
        int aux = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {

                if (vector[j] > vector[j + 1]) {

                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }

            }

        }

        return vector;

    }
    
    
    
    /**
     * Algoritmo de busqueda lineal
     * @param arreglo
     * @param dato
     * @return 
     */
    public int busquedaineal(int[] arreglo, int dato){
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == dato) {
             return i;   
            }
            
        }
        
        return -1;
    }

    
    /**
     * Algoritmo de busqueda binaria
     * @param arreglo
     * @param dato
     * @return 
     */
    public static int busquedaBinario(int[] arreglo, int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio + fin) / 2;
            if (arreglo[pos] == dato) {
                return pos;

            } else if (arreglo[pos] < dato) {
                inicio = pos+1;
            }else{
                fin = pos-1;

            }
        }
        return -1;

    }
    
    
    /**
     * Algoritmo de busqueda Hash
     * @param vector
     * @param dato 
     */
    public void busquedaHash(int vector[], int dato){
        
        
        String encon = "";
        
        for (int i = 0; i < vector.length; i++) {
            if (dato == vector[i]) {
                
                if (encon.hashCode() == 0) {
                    encon += i + "";
                }else{
                    encon += ", "+i;
                }
            }
            
        }
        
        if (encon.hashCode() != 0) {
            
            System.out.println("Dato encontrado en la posicion: "+encon+".");
        }else{
            System.err.println("Dato no encontrado");
        }
        
    }

}
