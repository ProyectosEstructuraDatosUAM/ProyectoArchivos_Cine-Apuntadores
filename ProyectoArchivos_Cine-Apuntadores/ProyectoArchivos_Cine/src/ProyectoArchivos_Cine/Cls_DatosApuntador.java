package ProyectoArchivos_Cine;

/*Usando listas doblemente enlazadas*/
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cls_DatosApuntador {

    RegistroCompra objetoInicial;
    RegistroCompra objetoCola;
    RegistroCompra objetoTemp;

  
    public RegistroCompra llenar(RegistroCompra obTemp, RegistroCompra anterior, RegistroCompra siguente) {

        obTemp.setAnterior(anterior);
        obTemp.setSiguiente(siguente);

        return obTemp;
    }

    public void ActualizarArchivo() {
        File nuevo = new File("Informacion de Compra.txt");
        nuevo.delete();
        objetoTemp = objetoInicial;
        do {
            UsoArchivos archivo = new UsoArchivos();
            try {
                archivo.GuardarCompra(objetoTemp);
            } catch (IOException ex) {
                Logger.getLogger(Cls_DatosApuntador.class.getName()).log(Level.SEVERE, null, ex);
            }

            objetoTemp = objetoTemp.getSiguiente();
        } while (objetoTemp != objetoInicial);
    }

    public void guardar(RegistroCompra nuevo) {

        if (objetoInicial == null) {
            objetoInicial = llenar(nuevo, null, null);
            objetoCola = objetoInicial;
        } else {
            objetoCola.setSiguiente(llenar(nuevo, objetoCola, objetoInicial));
            objetoCola = objetoCola.getSiguiente();
            objetoInicial.setAnterior(objetoCola);
        }

        objetoTemp = objetoCola;
    }

    public RegistroCompra Siguiente() {
        if (objetoTemp == objetoCola) {
            objetoTemp = objetoInicial;
            return objetoTemp;
        } else {
            objetoTemp = objetoTemp.getSiguiente();
            return objetoTemp;
        }

    }

    public RegistroCompra Anterior() {
        if (objetoTemp == objetoInicial) {
            objetoTemp = objetoCola;
            return objetoTemp;
        } else {
            objetoTemp = objetoTemp.getAnterior();
            return objetoTemp;
        }
    }

    public RegistroCompra Primero() {
        objetoTemp = objetoInicial;
        return objetoTemp;
    }

    public RegistroCompra Ultimo() {
        objetoTemp = objetoCola;
        return objetoTemp;
    }

    public void Eliminar(String IDCompra) {
        if (objetoInicial == null) {
            JOptionPane.showMessageDialog(null, "No hay datos a eliminar");
        } else if ((objetoInicial == objetoCola)
                && (IDCompra.equals(objetoInicial.getIDCompra()))) {
            objetoInicial = null;
            objetoCola = null;
        } else if (IDCompra.equals(objetoInicial.getIDCompra())) {
           
            objetoInicial = objetoInicial.getSiguiente();
            objetoInicial.setAnterior(objetoCola);
            objetoCola.setSiguiente(objetoInicial);
            objetoTemp = objetoInicial;

        } else if (IDCompra.equals(objetoCola.getIDCompra())) {
           
            objetoCola = objetoCola.getAnterior();
            objetoCola.setSiguiente(objetoInicial);
            objetoInicial.setAnterior(objetoCola);
            objetoTemp = objetoCola;
        } else {
            RegistroCompra TempAnterior = new RegistroCompra();
            objetoTemp = objetoInicial;
            while (objetoTemp.getSiguiente() != objetoInicial) {
                if (IDCompra.equals(objetoTemp.getIDCompra())) {
                    TempAnterior = objetoTemp.getAnterior();
                    objetoTemp = objetoTemp.getSiguiente();
                    objetoTemp.setAnterior(TempAnterior);
                    TempAnterior.setSiguiente(objetoTemp);
                } else {
                    objetoTemp = objetoTemp.getSiguiente();
                }
            }
        }
    }

}
