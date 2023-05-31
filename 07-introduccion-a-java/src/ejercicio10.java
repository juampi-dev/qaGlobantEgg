/* EJERCICIO N°10 :: GUIA 07 - Introducción a Java
 * PDF: Material de Trabajo
 * Curso QA + Automation by Globant / Egg Cooperation
*/

// IMPORTAMOS CLASE SCANNER DESDE EL PAQUETE JAVA UTIL
import java.util.Scanner;

/**
 * @author Juan Pablo Sinkachkuk / GITHUB: '@juan-ps'
 * @version 1.0
 */

public class ejercicio10 {
    
    public static void main(String[] args) {
    
        /*                                  ENUNCIADO
         * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
         * solicite números al usuario hasta que la suma de los números introducidos supere el
         * límite inicial.
         */

        // DEFINIMOS E INICIALIZAMOS LAS VARIABLES A UTILIZAR
        int limit, number;
        int sum = 0;

        // INICIALIZAMOS METODO leer
        Scanner leer = new Scanner(System.in);

        // LE PEDIMOS AL USUARIO EL NUMERO LIMITE
        System.out.println("----------------------------------------------------------");
        System.out.print("Ingrese el numero limite: ");
        limit = leer.nextInt();
        System.out.println("----------------------------------------------------------");
        System.out.println("");

        // HACEMOS LA SUMA DE LOS NUMEROS INGRESADOS POR EL USUARIO HASTA QUE SE LLEGUE AL NUMERO LIMITE
        while (sum <= limit) {
            System.out.print("Ingrese un número para sumar: ");
            number = leer.nextInt();
            sum += number;

            // Si la suma supera el límite, sale del bucle
            if (sum > limit) {
                break;
            }
        }

        // CUANDO SE SUPERA EL LIMITE SE IMPRIME EL SIGUIENTE MENSAJE
        System.out.println("Se ha superado el límite. La suma final es: " + sum);

        // FIN DEL PROGRAMA
        leer.close();
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("         Programa hecho por @juan-ps (GitHub)             ");
        System.out.println("");
        
    }

}
