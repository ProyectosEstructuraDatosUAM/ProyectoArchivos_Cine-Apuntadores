
package ProyectoArchivos_Cine;
/**
Clase encargada de manejar la informacion de los tiquetes y las peliculas
 */
public class Reservacion {
    String [][] campos = new String[5][13];
    
    private String nombre_completo;
    private String correo_electronico;
    private String cedula;
    private String telefono;
    private String Cantidad_tiquetes;
    private String tipo_tiquete;
    private String pelicula;
    private String tanda;
    private String Campo;
    private int row, column;
    
    //Informacion de pago y tarjeta
    private String PagoRealizado;
    private String Tarjeta_Tipo;
    private String Tarjeta_Habiente;
    private String Tarjeta_Numero;
    private String Tarjeta_Expiracion;
    private String Tarjeta_CVV;

    
    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCantidad_tiquetes() {
        return Cantidad_tiquetes;
    }

    public void setCantidad_tiquetes(String Cantidad_tiquetes) {
        this.Cantidad_tiquetes = Cantidad_tiquetes;
    }

    public String getTipo_tiquete() {
        return tipo_tiquete;
    }

    public void setTipo_tiquete(String tipo_tiquete) {
        this.tipo_tiquete = tipo_tiquete;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    
    public String getTanda() {
        return tanda;
    }

    public void setTanda(String tanda) {
        this.tanda = tanda;
    }
     
    public void setPosition(int row, int column, String campo){
        /*guarda la posicion de los botones para poder setear el numero de campo en a solicitud de
        compra*/
        this.row=row;
        this.column=column;
        this.Campo=campo;
        
        for(int i=0; i<campos.length; i++){
            if(i==row){
               for(int j=0; j<campos[0].length; j++){
                   if(j==column){
                       campos[row][column]=campo;
                   }
               } 
            }
        }
    }
    public String getPosition(int row, int column){
        
        return campos[row][column];
    }
    
    
}
