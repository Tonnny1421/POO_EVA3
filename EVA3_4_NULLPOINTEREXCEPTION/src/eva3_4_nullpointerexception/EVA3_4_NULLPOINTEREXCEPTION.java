/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva3_4_nullpointerexception;

public class EVA3_4_NULLPOINTEREXCEPTION {

    public static void main(String[] args) {

        Persona persona = null;
        imprimir(persona);
        System.out.println("Nombre : " + persona.getNombre());
    }
    
    public static void imprimir(Persona perso) {
        System.out.println("Nombre: " + perso.getNombre);
    }
    
    public static void masComplicado(Persona perso) {
        masComplicado(perso);
    }
    
}
  class Persona{
            private String nombre;

            public Persona() {
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
        }