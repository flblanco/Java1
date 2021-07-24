/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;
import java.util.Scanner;


/**
 *
 * @author florb
 */
public class Java1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner teclado = new Scanner(System.in);

String nombre,apellido,edad,hobbie,editor,sistema_op;

System.out.println("Ingrese su nombre:");

nombre = teclado.nextLine();

System.out.println("Ingrese su apellido:");

apellido = teclado.nextLine();

System.out.println("Ingrese su edad:");

edad = teclado.nextLine();

System.out.println("Algún hobbie que tenga:");

hobbie = teclado.nextLine();

System.out.println("Su editor de código preferido:");

editor = teclado.nextLine();

System.out.println("Su Sistema Operativo preferido:");

sistema_op = teclado.nextLine();

System.out.println("Usted se llama "+nombre+" "+apellido+" y tiene "+edad+" años. Su hobbie es "+hobbie+". Su editor de código preferido es "+editor+" y su Sistema Operativo preferido es "+sistema_op);

    }
    
}
