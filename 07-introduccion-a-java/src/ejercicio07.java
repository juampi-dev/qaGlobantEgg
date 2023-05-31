/* EJERCICIO N°7 :: GUIA 07 - Introducción a Java
 * PDF: Material de Trabajo
 * Curso QA + Automation by Globant / Egg Cooperation
*/

// IMPORTAMOS CLASE SCANNER DESDE EL PAQUETE JAVA UTIL
import java.util.Scanner;

/**
 * @author Juan Pablo Sinkachkuk / GITHUB: '@juan-ps'
 * @version 1.0
 */

public class ejercicio07 {

    public static void main(String[] args) {

        /*
         * ENUNCIADO
         * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
         * programa
         * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
         * investigar la función equals() en Java.
         */

        // DEFINIMOS LAS VARIABLES A UTILIZAR Y EL METODO leer
        String frase, username;
        Scanner leer = new Scanner(System.in);

        // PEDIMOS AL USUARIO LA FRASE
        System.out.println("-------------------------------------------------------");
        System.out.print("Ingrese una frase: ");
        frase = leer.nextLine();
        System.out.println("-------------------------------------------------------");
        System.out.print("Ingrese su nombre: ");
        username = leer.nextLine();
        System.out.println("-------------------------------------------------------");

        // VERIFICAMOS SI LA FRASE ES IGUAL A "eureka" (sin importar grafía)
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("Correcto.");
            System.out.println("Hola Arquímedes!");
        } else {
            System.out.println("Incorrecto.");
            System.out.println("Hola " + username + "!");
        }

        // FIN PROGRAMA
        leer.close();
        System.out.println("-------------------------------------------------------");
        System.out.println("         Programa hecho por @juan-ps (GitHub)          ");
        System.out.println("");
    }
}
