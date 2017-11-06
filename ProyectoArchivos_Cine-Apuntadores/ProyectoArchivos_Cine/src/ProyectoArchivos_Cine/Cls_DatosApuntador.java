
package ProyectoArchivos_Cine;
/*Usando listas doblemente enlazadas*/
import javax.swing.JOptionPane;

public class Cls_DatosApuntador {
    RegistroCompra objetoInicial;
    RegistroCompra objetoCola;
    RegistroCompra objetoTemp;
    
    public RegistroCompra llenar(String PeliculaSeleccionada, String CantidadTiquetes,
            String PagoRealizado, String Tarjeta_Habiente, String Tarjeta_Tipo,
            String Tarjeta_Numero, String Tarjeta_Expiracion, String Tarjeta_CVV,
            RegistroCompra anterior){
        RegistroCompra obTemp = new RegistroCompra();
        obTemp.setPeliculaSeleccionada(PeliculaSeleccionada);
        obTemp.setCantidadTiquetes(CantidadTiquetes);
        obTemp.setPagoRealizado(PagoRealizado);
        obTemp.setTarjeta_Habiente(Tarjeta_Habiente);
        obTemp.setTarjeta_Tipo(Tarjeta_Tipo);
        obTemp.setTarjeta_Numero(Tarjeta_Numero);
        obTemp.setTarjeta_Expiracion(Tarjeta_Expiracion);
        obTemp.setTarjeta_CVV(Tarjeta_CVV);
        obTemp.setAnterior(anterior);
        obTemp.setSiguiente(null);
        
        return obTemp;       
    }
    public void guardar(String PeliculaSeleccionada, String CantidadTiquetes,
            String PagoRealizado, String Tarjeta_Habiente, String Tarjeta_Tipo,
            String Tarjeta_Numero, String Tarjeta_Expiracion, String Tarjeta_CVV){
        
        if(objetoInicial==null){
            objetoInicial = llenar(PeliculaSeleccionada,CantidadTiquetes,PagoRealizado,
                    Tarjeta_Habiente,Tarjeta_Tipo,Tarjeta_Numero,Tarjeta_Expiracion,
                    Tarjeta_CVV,null);
            objetoCola = objetoInicial;
            objetoTemp = objetoInicial;   
        }else{
            objetoCola.setSiguiente(llenar(PeliculaSeleccionada, CantidadTiquetes, 
                    PagoRealizado, Tarjeta_Habiente,Tarjeta_Tipo,Tarjeta_Numero,
                    Tarjeta_Expiracion,Tarjeta_CVV,objetoCola));
            objetoCola = objetoCola.getSiguiente();
        }
    }
    public RegistroCompra sigiente(){
        if(objetoTemp.getSiguiente()==null){
            return objetoTemp;
        }else{
            objetoTemp = objetoTemp.getSiguiente();
            return objetoTemp;
        }
    }
    public RegistroCompra anterior(){
        if(objetoTemp.getAnterior()==null){
            return objetoTemp;
        }else{
            objetoTemp = objetoTemp.getAnterior();
            return objetoTemp;
        }
    }
    public RegistroCompra primero(){
        return objetoInicial;
    }
    public RegistroCompra ultimo(){
       return objetoCola; 
    }
    
    public void  Eliminar(String Tarjeta_Numero){
        if (objetoInicial==null) {
            JOptionPane.showMessageDialog(null, "No hay datos a mostrar");
        }else if ((objetoInicial == objetoCola) && 
                (Tarjeta_Numero.equals(objetoInicial.getTarjeta_Numero()))){
                objetoInicial= null;
                objetoCola= null;
        }else if (Tarjeta_Numero.equals(objetoInicial.getTarjeta_Numero())) {
                RegistroCompra TempAnterior= new RegistroCompra();
                TempAnterior=objetoTemp.getAnterior();
                objetoTemp=objetoTemp.getSiguiente();
                objetoInicial=objetoTemp;
                objetoTemp.setAnterior(TempAnterior);
                TempAnterior.setSiguiente(objetoTemp);
                
        }else if(Tarjeta_Numero.equals(objetoCola.getTarjeta_Numero())){
                RegistroCompra TempAnterior= new RegistroCompra();
                TempAnterior=objetoCola.getAnterior();
                objetoTemp=objetoCola.getSiguiente();
                objetoCola= TempAnterior;
                objetoTemp.setAnterior(TempAnterior);
                TempAnterior.setSiguiente(objetoTemp);
        }else{
            RegistroCompra TempAnterior= new RegistroCompra();
            objetoTemp=objetoInicial;
            while(objetoTemp.getSiguiente()!=objetoCola)    
            {
                if (Tarjeta_Numero.equals(objetoTemp.getTarjeta_Numero())) {
                    TempAnterior=objetoTemp.getAnterior();
                    objetoTemp=objetoTemp.getSiguiente();
                    objetoTemp.setAnterior(TempAnterior);
                    TempAnterior.setSiguiente(objetoTemp);
                }else{
                    objetoTemp=objetoTemp.getSiguiente();
                }
            }
        }
    }
  }

