/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
import java.util.*;

public class EVA3_13_MEJORAR_CAPTURA {

    public static void main(String[] args) {
        boolean dErroneo = true;
        Scanner spect = new Scanner(System.in);
        do {
            try {

                System.out.println("Introduce tu edad");
                int edad = spect.nextInt();
                if(edad < 0){
            throw new Exception("El valor"+ edad+" No es una edad valida");
        }
                System.out.println("Tu edad es " + edad);
                dErroneo = false;
            } catch (InputMismatchException e) {
                System.out.println(spect.next()+ " no es un numero valido");
            }catch(Exception e){
                System.out.println("Edad no es un valida");
            }

        } while (dErroneo);

    }
}
