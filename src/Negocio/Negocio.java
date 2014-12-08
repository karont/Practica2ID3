package Negocio;
import java.util.List;

import Controlador.*;
public class Negocio {
	 public static void main(String [] arg) {
		Controlador controlador=new Controlador();
		Negocio negocio = new Negocio(); 
		
		 List<String> atributos=controlador.leerFichero("AtributosJuego.txt");
		 List<String> juego=controlador.leerFichero("Juego.txt");
		 negocio.algoritmoID3(atributos,juego);
	 }
	 
	 public void algoritmoID3(List<String> atributos,List<String> juego)
	 {
		 
		 
	 }
}
