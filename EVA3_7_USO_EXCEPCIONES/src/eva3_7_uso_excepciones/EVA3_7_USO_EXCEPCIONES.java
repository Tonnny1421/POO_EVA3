/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva3_7_uso_excepciones;
import java.util.*;

public class EVA3_7_USO_EXCEPCIONES {

    public static void main(String[] args) {
        boolean dErroneo = true;
        Scanner spect = new Scanner(System.in);
        do {
            try {

                System.out.println("Introduce tu edad");
                int edad = spect.nextInt();
                System.out.println("Tu edad es " + edad);
                dErroneo = false;
            } catch (InputMismatchException e) {
                System.out.println(spect.next()+ " no es un numero valido");
            }

        } while (dErroneo);

    }
}
