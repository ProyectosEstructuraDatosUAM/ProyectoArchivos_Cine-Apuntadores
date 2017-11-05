package ProyectoArchivos_Cine;

import java.io.BufferedReader;
import java.io.FileReader;
/**
 * metodo recibe un parametro tipo String que sera el archivo a leer
 * luego de ser leido se almacena en el buffer de memoria en almacen
 * luego lo que esta en almacen se guarda en una variable tipo String llamada contrasena
 * y el mismo metodo retorna el valor almacenado en contrasena.
 */
public class Contrasena {
    public String leer(String archivo) {
        try {
            FileReader LeerArchivo = new FileReader(archivo);
            BufferedReader almacen= new BufferedReader(LeerArchivo );
            String contrasena = almacen.readLine();
            return contrasena;
        } catch (Exception e) {
            return e.getMessage();
        }
        
    }

}
