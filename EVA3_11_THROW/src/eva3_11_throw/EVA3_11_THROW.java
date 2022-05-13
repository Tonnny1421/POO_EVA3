/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */

package eva3_11_throw;

public class EVA3_11_THROW {

    public static void main(String[] args) {

        try {
            throw new Exception("Mi excepcion");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
