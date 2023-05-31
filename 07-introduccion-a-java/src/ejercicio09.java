/* EJERCICIO N°9 :: GUIA 07 - Introducción a Java
 * PDF: Material de Trabajo
 * Curso QA + Automation by Globant / Egg Cooperation
*/

// IMPORTAMOS CLASE SCANNER DESDE EL PAQUETE JAVA UTIL
import java.util.Scanner;

/**
 * @author Juan Pablo Sinkachkuk / GITHUB: '@juan-ps'
 * @version 1.0
 */

public class ejercicio09 {
    
    public static void main(String[] args) {
    
        /* ENUNCIADO
         * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
         * es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
         * que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
         * investigar la función Substring y equals() de Java.
         */

        // DEFINIMOS LAS VARIABLES A UTILIZAR Y EL METODO leer
        String frase, firstChar;
        Scanner leer = new Scanner(System.in);

        // PEDIMOS AL USUARIO QUE INGRESE EL DATO
        System.out.println("----------------------------------------------------------");
        System.out.print("Ingrese una frase o palabra: ");
        frase = leer.nextLine();
        System.out.println("----------------------------------------------------------");
        System.out.println("");

        // EXTRAEMOS EL PRIMER CARACTER DE LA VARIABLE 'frase' Y LA GUARDAMOS EN 'firstChar'
        firstChar = frase.substring(0, 1);

        // VERIFICAMOS SI LA FRASE EMPIEZA CON 'A', USANDO COMO ARGUMENTO A 'firstChar'
        if (firstChar.equalsIgnoreCase("a")){ // la condición ignora la grafía de la frase
            System.out.println("CORRECTO!");
            System.out.println("La frase que ingresaste comienza con A.");
        } else {
            System.out.println("INCORRECTO!");
            System.out.println("La frase que ingresaste no comienza con A.");
        }

        // FIN PROGRAMA
        leer.close();
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("         Programa hecho por @juan-ps (GitHub)             ");
        System.out.println("");
    }
}

