
package ejercicio.pkg2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
       Scanner Reader = new Scanner(System.in);
       String quieroJugar = "si";
       while(quieroJugar.equals("si")){
           System.out.println("¿Quiere seguir Jugando?");
           quieroJugar = Reader.next();
       }
    }
    
}
