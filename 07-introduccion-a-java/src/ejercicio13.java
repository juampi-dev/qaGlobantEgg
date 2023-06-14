/* EJERCICIO N°13 :: GUIA 07 - Introducción a Java
 * PDF: Material de Trabajo
 * Curso QA + Automation by Globant / Egg Cooperation
*/

// IMPORTAMOS CLASE SCANNER DESDE EL PAQUETE JAVA UTIL
import java.util.Scanner;

/**
 * @author Juan Pablo Sinkachkuk / GITHUB: '@juan-ps'
 * @version 1.0
 */

public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // INICIALIZAMOS METODO leer
        Scanner leer = new Scanner(System.in);
        
        int n;
        System.out.println("ingrese la longitud del vector: ");
        n = leer.nextInt();
        int[] vector = new int[n];
        int[] resultado = new int[5];

        for (int i = 0; i < 5; i++){
            resultado[i] = 0;
        }

        for (int i = 0; i < n; i++){
            vector[i] = (int) (Math.random()*15000);
        //    System.out.println(vector[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++){
                if (vector[i] / (int)Math.pow(10, j + 1) == 0) {
                    resultado[j]++;
                    break;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("para " + (i+1) + " digitos: " + resultado[i]);
        }

        // FIN DEL PROGRAMA
        leer.close();
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("         Programa hecho por @juan-ps (GitHub)             ");
        System.out.println("");

    }

}