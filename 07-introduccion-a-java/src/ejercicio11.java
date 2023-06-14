/* EJERCICIO N°11 :: GUIA 07 - Introducción a Java
 * PDF: Material de Trabajo
 * Curso QA + Automation by Globant / Egg Cooperation
*/

// IMPORTAMOS CLASE SCANNER DESDE EL PAQUETE JAVA UTIL
import java.util.Scanner;

/**
 * @author Juan Pablo Sinkachkuk / GITHUB: '@juan-ps'
 * @version 1.0
 */

public class ejercicio11 {
    public static void main(String[] args) {

        /* Realizar un programa que pida dos números enteros positivos por teclado y muestre por
        pantalla el siguiente menú:

        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:

        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
        pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
        programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
        seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
        del programa, caso contrario se vuelve a mostrar el menú. */

        // DEFINIMOS VARIABLES A UTILIZAR
        

        // INICIALIZAMOS METODO leer
        Scanner leer = new Scanner(System.in);

        // FIN DEL PROGRAMA
        leer.close();
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("         Programa hecho por @juan-ps (GitHub)             ");
        System.out.println("");

    }
}
