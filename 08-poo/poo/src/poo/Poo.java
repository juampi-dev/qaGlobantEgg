/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;
import poo.newpackage.Libro;

/**
 *
 * @author Juan Pablo
 */

/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/

public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MAIN
        
        // cargarLibro();
        
        Poo libroNuevo = new Poo();
        //libroNuevo.cargarLibro();
        
        Libro book1 = libroNuevo.cargarLibro();
        libroNuevo.informeLibro(book1);
    }
    
    public Libro cargarLibro(){
        Scanner leer = new Scanner(System.in);
        
        Libro libro1 = new Libro();
        System.out.print("Ingrese el ISBN del libro: ");
        libro1.isbn = leer.nextInt();
        System.out.print("Ingrese el titulo del libro: ");
        libro1.titulo = leer.next();
        System.out.print("Ingrese el autor del libro: ");
        libro1.autor = leer.next();
        System.out.print("Ingrese la cantidad de paginas del libro: ");
        libro1.paginas = leer.nextInt();
        return libro1;
        
    }
    
    public void informeLibro(Libro book1){
        
        System.out.println(book1.isbn);
        System.out.println(book1.titulo);
        System.out.println(book1.autor);
        System.out.println(book1.paginas);
        
    }
}
