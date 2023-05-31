/* EJERCICIO N°5 :: GUIA 07 - Introducción a Java
 * PDF: Material de Trabajo
 * Curso QA + Automation by Globant / Egg Cooperation
*/

// IMPORTAMOS CLASE SCANNER DESDE EL PAQUETE JAVA UTIL
import java.util.Scanner;

     /**
     * @author Juan Pablo Sinkachkuk / GITHUB: '@juan-ps'
     * @version 1.0
     */

public class ejercicio05 {

     /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
    // ENUNCIADO
    /*
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
     * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
     * Math.sqrt().
     */

     // DEFINIMOS LAS VARIABLES A UTILIZAR Y EL METODO 'leer'
     int num, dobleDeNum, tripleDeNum;
     double raizCuadradaDeNum;
     Scanner leer = new Scanner(System.in);

     // LE PEDIMOS AL USUARIO QUE INGRESE EL NUMERO
     System.out.println("");
     System.out.println("-------------------------------------------------------------------------------------");
     System.out.print("Ingrese un número entero para calcular su doble, triple y raíz cuadrada: ");
     num = leer.nextInt();
     System.out.println("-------------------------------------------------------------------------------------");
     System.out.println("");

     // HACEMOS LOS CALCULOS
     dobleDeNum = (num * 2); // duplicamos 'num'
     tripleDeNum = (num * 3); // triplicamos 'num'
     raizCuadradaDeNum = Math.sqrt(num); // square root de 'num'

     // IMPRIMIMOS POR CONSOLA EL NUMERO INGRESADO
     System.out.println("El número que Usted ingresó es el: " + num);
     System.out.println("");
     System.out.println("RESULTADOS:");
     System.out.println("El doble de " + num + " es: " + dobleDeNum);
     System.out.println("El triple de " + num + " es: " + tripleDeNum);
     System.out.println("La raíz cuadrada de " + num + " es: " + raizCuadradaDeNum);
     System.out.println("");

     // FIN DEL PROGRAMA
     leer.close();
     System.out.println("-------------------------------------------------------------------------------------");
     System.out.println("");
     System.out.println("                         Programa hecho por @juan-ps (GitHub)                        ");
     System.out.println("");
    }
}
