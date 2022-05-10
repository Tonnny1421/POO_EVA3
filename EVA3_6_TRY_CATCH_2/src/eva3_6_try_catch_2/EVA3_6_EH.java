package com.mycompany.eva3_6_eh;


import java.util.*;

public class EVA3_6_EH {

    public static void main(String[] args) {
        Scanner Spect = new Scanner(System.in);
        int entero1 = Spect.nextInt();
        int entero2 = Spect.nextInt();

        try {
            System.out.println("Division " + (entero1 / entero2));

        } catch (ArithmeticException e) {
            e.printStackTrace();//imprimo la excepcion sin que el programa se detenga
            System.out.println("Se produjo un error, ya que hubo una division entre cero");
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
