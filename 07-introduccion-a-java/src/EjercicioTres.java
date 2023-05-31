import java.util.Scanner;

    /**
     * @author Juan Pablo Sinkachkuk / GITHUB: @juan-ps
     * @version 1.0
     */

public class EjercicioTres {

    /**
     * @param args the command line arguments
     */

    // ENUNCIADO

    /* Escribir un programa que pida una frase
    y la muestre toda en mayúsculas y después toda
    en minúsculas. Nota: investigar la función
    toUpperCase() y toLowerCase() en Java. */

    public static void main(String[] args) {
        
        // DEFINIMOS LAS VARIABLES Y EL METODO LEER
        String frase, minus, mayus;
        Scanner leer = new Scanner(System.in);

        // PEDIMOS LOS DATOS AL USUARIO
        System.out.println("----------------------------------------------------------------");
        System.out.print("Ingrese una frase: ");
        frase = leer.nextLine();
        System.out.println("----------------------------------------------------------------");
        System.out.println("");

        /* CONVERTIMOS LA FRASE INGRESADA A minusculas y MAYUSCULAS, RESPECTIVAMENTE
        Y LAS GUARDAMOS EN SUS VARIABLES */
        minus = frase.toLowerCase();
        mayus = frase.toUpperCase();

        // IMPRIMIMOS EL RESULTADO EN PANTALLA EN MINUSCULAS Y MAYUSCULAS, RESPECTIVAMENTE
        System.out.print("La frase que usted ingresó en minúsculas es: ");
        System.out.println(minus);
        System.out.print("La frase que usted ingresó en MAYUSCULAS es: ");
        System.out.println(mayus);
        System.out.println("");
        System.out.println("----------------------------------------------------------------");
        System.out.println("                 Programa hecho por @juan-ps                    ");
        System.out.println("");
        
    }   
}
