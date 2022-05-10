/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva3_3_division_cero;

import java.util.Scanner;

public class EVA3_3_DIVISION_CERO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad(Numero entero): ");
       
        System.out.println("Introduce un numero entero : ");
         int entero = sc.nextInt();
        
        
        System.out.println("Introduce otro numero entero : ");
         int entero2 = sc.nextInt();
         
         System.out.println("Division : "  + (entero/entero2));
        
      
    }
    
}
