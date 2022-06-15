/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package EVA3_14_TRHOW2;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author tony
 */
public class EVA3_14_TRHOW2 {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Luis");
        try {
            persona.setEdad(capturarEdad());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            Persona persona2 = new Persona(capturarEdad(),"Lolo");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
    public static int capturarEdad() throws Exception{
            Scanner spect =  new Scanner (System.in);
            System.out.println("Ingresa la edad");
            int valor=0;
            try{
                valor = spect.nextInt();
            }catch(InputMismatchException ex){
                throw new Exception("INtrodujiste una cadena de texto");
            }


            return valor;
        }
}
class Persona{
    private int edad;
    private String nombre;

    public Persona() {

    }

    public Persona(int edad, String nombre) throws Exception {
        setEdad(edad);
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if((edad>=0) && (edad <=130)){
            this.edad = edad;
        }else {
            throw new Exception("Rango incorrecto");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}