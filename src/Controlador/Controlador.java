package Controlador;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Controlador {

   public List<String> leerFichero(String nombrefichero) {
      String[] listaatributos= null;
      String ficheroEnString= "";
	  File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      List<String> items = null;
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (nombrefichero);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null)
         {
        	 ficheroEnString = ficheroEnString +linea + ",";
        	 
         }
           items = Arrays.asList(ficheroEnString.split(","));
     //    listaatributos =  ficheroEnString.split(",").;
     //    listaatributos[listaatributos.length-1] = null;
     //    ArrayList<String> hola = hola. ficheroEnString.split(",");
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      return items;
   }
}
