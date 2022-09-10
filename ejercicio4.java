package ejercicio4; 

        import java.util.Scanner;
        
public class ejercicio4 {
    
     public static void main(String[] args) {
         
         Scanner teclado = new Scanner (System.in);
         int nota;
         int i = 1; 
         int contador1 = 0; ///va a contar todas las notas mayores o iguales a 7 
         int contador2 = 0; ///va a contar las notas menores a 7 
         
         while(i<= 10 ) {
             System.out.print("Digite la " + i + " nota : " };
             nota = teclado.nextInt();
             
             if(nota >= 7){
                 contador1 ++;
                 
                }
             else if(nota < 7){
                 contador2 ++;
                 
               }
             i++;
             }
     
            System.out.println("");
            System.out.println("La cantidad de notas mayores o iguales a 7 son : " +contador1);
            System.out.println("La cantidad de notas menores a 7 son : " +contador2);
            
     }
}
