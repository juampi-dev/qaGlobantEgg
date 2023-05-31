/* EJERCICIO N°6 :: GUIA 07 - Introducción a Java
 * PDF: Material de Trabajo
 * Curso QA + Automation by Globant / Egg Cooperation
*/

// IMPORTAMOS CLASE SCANNER DESDE EL PAQUETE JAVA UTIL
import java.util.Scanner;

/**
 * @author Juan Pablo Sinkachkuk / GITHUB: '@juan-ps'
 * @version 1.0
 */

public class ejercicio06 {

    public static void main(String[] args) {

        // ENUNCIADO
        // Crear un programa que dado un numero determine si es par o impar.

        // DEFINIMOS LAS VARIABLES A UTILIZAR Y EL METODO leer
        int num;
        Scanner leer = new Scanner(System.in);

        // LE PEDIMOS AL USUARIO QUE INGRESE UN NUMERO ENTERO
        System.out.println("-------------------------------------");
        System.out.println("PAR O IMPAR");
        System.out.println("");
        System.out.print("Ingrese un número entero: ");
        num = leer.nextInt();
        System.out.println("-------------------------------------");
        System.out.println("");

        // VERIFICAMOS SI EL NUMERO ES PAR O IMPAR
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es PAR.");
            System.out.println("");
        } else {
            System.out.println("El número " + num + " es IMPAR.");
            System.out.println("");
        }

        // FIN DEL PROGRAMA
        leer.close();
        System.out.println("-------------------------------------");
        System.out.println("Programa hecho por @juan-ps (GitHub)");
        System.out.println("");
    }
}
