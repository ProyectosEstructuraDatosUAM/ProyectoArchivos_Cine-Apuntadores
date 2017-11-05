/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoArchivos_Cine;

import java.io.*;

/**
maneja os archivos del sistema para el almacenamiento de la informacion
 */
public class UsoArchivos {

    public void CrearArchivo(File nuevo) throws IOException {

        if (!nuevo.exists()) {
            FileWriter crear = new FileWriter(nuevo);
            crear.write("");
            crear.close();
        }

    }

    public void GuardarUsuario(Administradores Usuario) throws IOException {
        File nuevo = new File("Administradores.txt");

        if (!nuevo.exists()) {
            CrearArchivo(nuevo);
        }

        FileWriter escribir = new FileWriter(nuevo, true);
        BufferedWriter buffer = new BufferedWriter(escribir);
        String registro = Usuario.getNombre() + ";"
                + Usuario.getContrasena() + "\r\n";
        buffer.write(registro);
        buffer.close();
        escribir.close();

    }

    public void GuardarCompra(RegistroCompra Usuario) throws IOException {
        File nuevo = new File("Informacion de Compra.txt");

        if (!nuevo.exists()) {
            CrearArchivo(nuevo);
        }

        FileWriter escribir = new FileWriter(nuevo, true);
        BufferedWriter buffer = new BufferedWriter(escribir);
        String registro
                = //Informacion General del cliente y compra
                Usuario.getNombreComprador() + ";"
                + Usuario.getTelefonoComprador() + ";"
                + Usuario.getCedulaComprador() + ";"
                + Usuario.getEmailComprador() + ";"
                //Informacion de pago y tarjeta
                + Usuario.getTarjeta_Habiente() + ";"
                + Usuario.getTarjeta_Tipo() + ";"
                + Usuario.getTarjeta_Numero() + ";"
                + Usuario.getTarjeta_Expiracion() + ";"
                + Usuario.getTarjeta_CVV() + ";"
                + Usuario.getPagoRealizado() + ";"
                //Informacion de los tiquetes
                + Usuario.getTipoTiquetes() + ";"
                + Usuario.getCantidadTiquetes() + ";"
                + Usuario.getPeliculaSeleccionada() + ";"
                + Usuario.getFuncionSeleccionada() + ";"
                + Usuario.getAsientosSeleccionados() + "\r\n"; //Ultimo dato de la línea

        buffer.write(registro);
        buffer.close();
        escribir.close();

    }
    
    public void GuardarCambios(String cambios) throws IOException {
        File nuevo = new File("Informacion de Compra.txt");
        
        nuevo.delete();
        if (!nuevo.exists()) {
            CrearArchivo(nuevo);
        }
        
        

        FileWriter escribir = new FileWriter(nuevo, true);
        BufferedWriter buffer = new BufferedWriter(escribir);
        String registro = cambios; //Ultimo dato de la línea

        buffer.write(registro);
        buffer.close();
        escribir.close();

    }

}
