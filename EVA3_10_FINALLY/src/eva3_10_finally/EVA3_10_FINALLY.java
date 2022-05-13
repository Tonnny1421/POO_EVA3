/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva3_10_finally;


import java.util.*;

public class EVA3_10_FINALLY {

    public static void main(String[] args) {

        try {
            Scanner spect = new Scanner(System.in);
            System.out.println("Ingresa un numero: ");
            int valor = spect.nextInt();
            System.out.println("Ingreso el numero: " + valor);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            System.out.println("ESTA LINEA SIEMPRE SE EJECUTARA");
        }
        System.out.println("Fin del programa");

    }
    
}
