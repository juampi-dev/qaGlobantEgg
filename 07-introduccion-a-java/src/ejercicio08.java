/* EJERCICIO N°8 :: GUIA 07 - Introducción a Java
 * PDF: Material de Trabajo
 * Curso QA + Automation by Globant / Egg Cooperation
*/

// IMPORTAMOS CLASE SCANNER DESDE EL PAQUETE JAVA UTIL
import java.util.Scanner;

/**
 * @author Juan Pablo Sinkachkuk / GITHUB: '@juan-ps'
 * @version 1.0
 */

public class ejercicio08 {
    
    public static void main(String[] args) {
        
        /* ENUNCIADO
         * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
         * el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
         * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
         * “INCORRECTO”. Nota: investigar la función Lenght() en Java.
         */

        // DECLARAMOS LAS VARIABLES A UTILIZAR Y EL METODO leer
        String frase;
        Scanner leer = new Scanner(System.in);

        // PEDIMOS AL USUARIO LA FRASE O PALABRA
        System.out.println("----------------------------------------------------------");
        System.out.print("Ingrese una frase o palabra: ");
        frase = leer.nextLine();
        System.out.println("----------------------------------------------------------");
        System.out.println("");

        // HACEMOS LA VERIFICACION DEL DATO INGRESADO POR EL USUARIO
        if (frase.length() <= 8){
            System.out.println("                        CORRECTO!");
            System.out.println("");
            System.out.println("La frase que ingresaste tiene 8 caracteres o menos de largo.");
            System.out.println("                           :)                               ");
        } else {
            System.out.println("                       INCORRECTO!");
            System.out.println("");
            System.out.println("La frase que ingresaste tiene más de 8 caracteres de largo");
            System.out.println("                           >:(                            ");
        }
        
        // FIN PROGRAMA
        leer.close();
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("         Programa hecho por @juan-ps (GitHub)             ");
        System.out.println("");

    }

}
