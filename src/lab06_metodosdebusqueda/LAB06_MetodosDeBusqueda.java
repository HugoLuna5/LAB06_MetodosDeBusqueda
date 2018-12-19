/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_metodosdebusqueda;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import lab06_metodosdebusqueda.utilerias.Utilerias;

/**
 *
 * @author Dell
 */
public class LAB06_MetodosDeBusqueda {

    /**
     * declaracion de variables
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
             Utilerias obj = new Utilerias();
            String ca = obj.leer("datos.txt");
            String vectorCad[] = vectorCadena(ca);
            int vector[] = obj.convertirVector(vectorCad.length, vectorCad);
            
            int vectorOrdenado[] = obj.burbuja(vector);
            
            
            for (int i = 0; i < vectorOrdenado.length; i++) {
           
            
                System.out.println(vectorOrdenado[i]);
            
        }
       
            
    }

    public static String[] vectorCadena(String cadena) {
      
       String vector[]= cadena.split(",");
       
       
       return vector;

    }

}
