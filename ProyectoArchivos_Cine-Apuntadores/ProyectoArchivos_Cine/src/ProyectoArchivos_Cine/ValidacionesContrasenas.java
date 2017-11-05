
package ProyectoArchivos_Cine;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
Clase encargada de validar las contraseñas del sistema 
 */
public class ValidacionesContrasenas {

    public boolean ValidarContrasena(String C1, String C2) {

        int i = C1.compareTo(C2); //Compare To devuelve 0 cuando es verdadero (Ambas son iguales)

        if (i == 0) {
            return (true);
        } else {
            return (false);
        }

    }

    public boolean ValidarInicioSesion(String Usuario, String Contrasena) throws FileNotFoundException, IOException {
        // TODO add your handling code here:

        String linea;
        FileReader f = new FileReader("Administradores.txt");
        try (BufferedReader b = new BufferedReader(f)) {
            while ((linea = b.readLine()) != null) {
                String UserPass[] = linea.split(";");

                if ((Usuario.equals(UserPass[0])) && (Contrasena.equals(UserPass[1]))) {
                    return true;
                }
            }

        } catch (IOException e) {
            //lblResultado.setText("Error al leer el archivo");
        }
        return false; //No se encontro el usuario
    }

}
