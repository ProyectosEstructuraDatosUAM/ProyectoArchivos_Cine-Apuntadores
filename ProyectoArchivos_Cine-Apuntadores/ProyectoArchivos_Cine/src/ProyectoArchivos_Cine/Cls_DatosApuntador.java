
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
    
    
   /* //Se comentan porque se modificaron para usar todo el objeto, no se consiguen datos separados 
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
    */
    
    
        public RegistroCompra llenar(RegistroCompra obTemp, RegistroCompra anterior, RegistroCompra siguente){
            
        obTemp.setAnterior(anterior);
        obTemp.setSiguiente(siguente);
        
        return obTemp;       
    }

        
    public void ActualizarArchivo()
            
    {
        File nuevo = new File("Informacion de Compra.txt");        
        nuevo.delete();
        objetoTemp=objetoInicial;
        do {            
                UsoArchivos archivo = new UsoArchivos();
            try {
                archivo.GuardarCompra(objetoTemp);
            } catch (IOException ex) {
                Logger.getLogger(Cls_DatosApuntador.class.getName()).log(Level.SEVERE, null, ex);
            }
         
                
            objetoTemp=objetoTemp.getSiguiente();
        } while (objetoTemp != null);
    }
    
    
        public void guardar(RegistroCompra nuevo){
        
        if(objetoInicial==null){
            objetoInicial = llenar(nuevo,null,null);
            objetoCola = objetoInicial;   
        }else{
            objetoCola.setSiguiente(llenar(nuevo,objetoCola, objetoInicial));
            objetoCola = objetoCola.getSiguiente();
            objetoInicial.setAnterior(objetoCola);
        }
        
        objetoTemp = objetoCola;
    }

    
    public RegistroCompra Siguiente(){
        if(objetoTemp.getSiguiente()==null){
            return objetoTemp;
        }else{
            objetoTemp = objetoTemp.getSiguiente();
            return objetoTemp;
        }
    }
    public RegistroCompra Anterior(){
        if(objetoTemp.getAnterior()==null){
            return objetoTemp;
        }else{
            objetoTemp = objetoTemp.getAnterior();
            return objetoTemp;
        }
    }
    public RegistroCompra Primero(){
        return objetoInicial;
    }
    public RegistroCompra Ultimo(){
       return objetoCola; 
    }
    
    public void  Eliminar(String IDCompra){
        if (objetoInicial==null) {
            JOptionPane.showMessageDialog(null, "No hay datos a mostrar");
        }else if ((objetoInicial == objetoCola) && 
                (IDCompra.equals(objetoInicial.getIDCompra()))){
                objetoInicial= null;
                objetoCola= null;
        }else if (IDCompra.equals(objetoInicial.getIDCompra())) {
                RegistroCompra TempAnterior= new RegistroCompra();
                TempAnterior=objetoTemp.getAnterior();
                objetoTemp=objetoTemp.getSiguiente();
                objetoInicial=objetoTemp;
                objetoTemp.setAnterior(TempAnterior);
                TempAnterior.setSiguiente(objetoTemp);
                
        }else if(IDCompra.equals(objetoCola.getIDCompra())){
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
                if (IDCompra.equals(objetoTemp.getIDCompra())) {
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

