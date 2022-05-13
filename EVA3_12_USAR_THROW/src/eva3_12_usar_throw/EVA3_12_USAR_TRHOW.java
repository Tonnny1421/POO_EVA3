/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva3_12_usar_throw;

import java.util.*;

public class EVA3_12_USAR_TRHOW {

    public static void main(String[] args) {
        Scanner spect = new Scanner(System.in);
        int valor =0;
        try{
        System.out.println("Ingresa un numero: ");
        valor = spect.nextInt();

        if(valor < 0){
            throw new Exception("El valor"+ valor+" No es una edad valida");
        }
        System.out.println("Ingreso el numero: " + valor);
        }catch(Exception e){
        e.printStackTrace();
    }
    }
}