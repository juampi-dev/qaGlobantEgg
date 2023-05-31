import java.util.Scanner;

    /**
     * @author Juan Pablo Sinkachkuk / GITHUB: @juan-ps
     * @version 1.0
     */

public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        // ENUNCIADO

        /* Dada una cantidad de grados centígrados
        se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente
        es: F = 32 + (9 * C / 5). */

        // DECLARAMOS LAS VARIABLES Y METODO leer
        float celsius, fhrn;
        Scanner leer = new Scanner(System.in);

        // MENSAJE DE BIENVENIDA
        System.out.println("--------------------------------------------------");
        System.out.println("");
        System.out.println("   CONVERSOR DE GRADOS CENTIGRADOS A FAHRENHEIT");
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("");

        // PEDIMOS AL USUARIO QUE INGRESE LOS GRADOS CELSIUS A CONVERTIR
        System.out.println("|||        A continuación le pediremos que ingrese los grados Centígrados         |||");
        System.out.println("|   NOTA: Si ingresa un número decimal, utilice una coma para separar las cifras.   |");
        System.out.println("");
        System.out.print("Ingrese los grados Celsius a convertir: ");
        celsius = leer.nextFloat();
        System.out.println("");

        // HACEMOS EL CALCULO DE CONVERSION Y GUARDAMOS EL RESULTADO EN LA VARIABLE 'fhrn'
        fhrn = 32 + (9 * celsius / 5);

        // MOSTRAMOS EL RESULTADO POR PANTALLA
        System.out.println("------------------------------------------------------");
        System.out.println("");
        System.out.println("                   RESULTADO:");
        System.out.println(celsius + "° grados Centígrados son " + fhrn + "° grados Fahrenheit.");
        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println("         Gracias por usar nuestros servicios!         ");
        System.out.println("             Programa hecho por @juan-ps              ");
        System.out.println("");
    }
}
