
package ejercicio.pkg4;
import Java.out.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int password;
        do {
            System.out.print( "Introduzca su contraseña numérica: ");
            password = keyboard.nextInt();
            if (password != 1234)
                System.out.println( "La contraseña no es válida." );
        }
        while (password != 1234);
    }
    
}
