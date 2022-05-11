/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva3_8_multiples_catch;

import java.util.*;

public class EVA3_8_MULTIPLES_CATCH {

    public static void main(String[] args) {
        Scanner spect = new Scanner(System.in);

        try {
            System.out.println("N1");
            int n1 = spect.nextInt();
            int n2 = spect.nextInt();
            System.out.println("Division "+n1/n2);

        }catch(ArithmeticException e){
            System.out.println("La division resulta en 0");
        }catch(InputMismatchException miVariable){
        System.out.println("No se ingreso un numero valido");
    }
        System.out.println("FIN");
    }
}
