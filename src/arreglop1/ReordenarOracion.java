/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglop1;

/**
 *
 * @author Kenneth
 */
import java.util.Arrays;
public class ReordenarOracion {
  public static String reordenarOracion(String[] palabras) {
        String[] resultado = new String[palabras.length];
        
        for (String palabra : palabras) {
            // Extraer el número al final de la palabra
            int indice = Character.getNumericValue(palabra.charAt(palabra.length() - 1)) - 1;
            // Remover el número y colocar la palabra en la posición correcta
            resultado[indice] = palabra.substring(0, palabra.length() - 1);
        }
        
        // Unir las palabras para formar la oración reordenada
        return String.join(" ", resultado); 

  }
   }