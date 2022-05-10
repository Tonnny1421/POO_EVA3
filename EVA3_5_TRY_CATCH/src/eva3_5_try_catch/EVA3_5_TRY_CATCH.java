/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package EVA3_5_TRY_CATCH;

import java.util.*;

public class EVA3_5_TRY_CATCH {

    public static void main(String[] args) {
        //EXCEPCIONES--> OBJETOS
        Scanner Spect = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad=0;
        try {
            edad = Spect.nextInt();
        } catch (InputMismatchException e) {
            //e.printStackTrace();
            System.out.println("Fallo la captura!!!");
        }
        System.out.println("Tu edad es: " + edad);

    }
}