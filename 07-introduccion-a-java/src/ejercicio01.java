/* EJERCICIO N°1 :: GUIA 07 - Introducción a Java
 * PDF: Material de Trabajo
 * Curso QA + Automation by Globant / Egg Cooperation
*/

// IMPORTAMOS CLASE SCANNER DESDE EL PAQUETE JAVA UTIL
import java.util.Scanner;

    /**
     * @author Juan Pablo Sinkachkuk / GITHUB: '@juan-ps'
     * @version 1.0
     */

public class ejercicio01 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        /* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        dos. El programa deberá después mostrar el resultado de la suma */
        
        // DEFINIMOS VARIABLES Y SCANNER
        int num1, num2, suma;
        try (Scanner leer = new Scanner(System.in)) {

            // PEDIMOS LOS DATOS AL USUARIO Y LOS GUARDAMOS EN SUS RESPECTIVAS VARIABLES
            System.out.println("-------------------------------------------");
            System.out.println("");
            System.out.print("Ingrese el primer número entero: ");
            num1 = leer.nextInt();
            System.out.print("Ingrese el segundo número entero: ");
            num2 = leer.nextInt();
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("");
        }

        // REALIZAMOS LA SUMA Y LA GUARDAMOS EN LA VARIABLE 'suma'
        suma = num1 + num2; 

        // IMPRIMIMOS LOS RESULTADOS POR PANTALLA
        System.out.println("Los numeros ingresados son: " + num1 + " y " + num2 + ".");
        System.out.println("");
        System.out.println("La suma de ambos numeros es igual a: " + suma + ".");
        System.out.println("");

        // FIN DEL PROGRAMA
        System.out.println("-------------------------------------------");
        System.out.println("    Programa hecho por @juan-ps (GitHub)   ");
        System.out.println("");
    }
}
