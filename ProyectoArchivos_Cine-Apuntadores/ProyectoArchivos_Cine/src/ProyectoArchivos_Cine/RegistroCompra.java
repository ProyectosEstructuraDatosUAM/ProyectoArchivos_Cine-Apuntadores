
package ProyectoArchivos_Cine;

/**
Clae encargada de manejar los datos de la compra
 */
public class RegistroCompra {

    //Informacion General del cliente y compra
    private String IDCompra;
    private String NombreComprador;
    private String ApellidosComprador;
    private String CedulaComprador;
    private String EmailComprador;
    private String TelefonoComprador;
    
    //Informacion de pago y tarjeta
    private String PagoRealizado;
    private String Tarjeta_Tipo;
    private String Tarjeta_Habiente;
    private String Tarjeta_Numero;
    private String Tarjeta_Expiracion;
    private String Tarjeta_CVV;

    //Informacion de los tiquetes
    private String CantidadTiquetes;
    private String TipoTiquetes;
    private String AsientosSeleccionados;
    private String PeliculaSeleccionada;
    private String FuncionSeleccionada;
    private String DiaSeleccionado;

    public String getIDCompra() {
        return IDCompra;
    }

    public void setIDCompra(String IDCompra) {
        this.IDCompra = IDCompra;
    }

    public String getNombreComprador() {
        return NombreComprador;
    }

    public void setNombreComprador(String NombreComprador) {
        this.NombreComprador = NombreComprador;
    }

    public String getApellidosComprador() {
        return ApellidosComprador;
    }

    public void setApellidosComprador(String ApellidosComprador) {
        this.ApellidosComprador = ApellidosComprador;
    }

    public String getCedulaComprador() {
        return CedulaComprador;
    }

    public void setCedulaComprador(String CedulaComprador) {
        this.CedulaComprador = CedulaComprador;
    }

    public String getEmailComprador() {
        return EmailComprador;
    }

    public void setEmailComprador(String EmailComprador) {
        this.EmailComprador = EmailComprador;
    }

    public String getPagoRealizado() {
        return PagoRealizado;
    }

    public void setPagoRealizado(String PagoRealizado) {
        this.PagoRealizado = PagoRealizado;
    }

    public String getTarjeta_Tipo() {
        return Tarjeta_Tipo;
    }

    public void setTarjeta_Tipo(String Tarjeta_Tipo) {
        this.Tarjeta_Tipo = Tarjeta_Tipo;
    }

    public String getTarjeta_Habiente() {
        return Tarjeta_Habiente;
    }

    public void setTarjeta_Habiente(String Tarjeta_Habiente) {
        this.Tarjeta_Habiente = Tarjeta_Habiente;
    }

    public String getTarjeta_Numero() {
        return Tarjeta_Numero;
    }

    public void setTarjeta_Numero(String Tarjeta_Numero) {
        this.Tarjeta_Numero = Tarjeta_Numero;
    }

    public String getTarjeta_Expiracion() {
        return Tarjeta_Expiracion;
    }

    public void setTarjeta_Expiracion(String Tarjeta_Expiracion) {
        this.Tarjeta_Expiracion = Tarjeta_Expiracion;
    }

    public String getTarjeta_CVV() {
        return Tarjeta_CVV;
    }

    public void setTarjeta_CVV(String Tarjeta_CVV) {
        this.Tarjeta_CVV = Tarjeta_CVV;
    }

    public String getCantidadTiquetes() {
        return CantidadTiquetes;
    }

    public void setCantidadTiquetes(String CantidadTiquetes) {
        this.CantidadTiquetes = CantidadTiquetes;
    }

    public String getTipoTiquetes() {
        return TipoTiquetes;
    }

    public void setTipoTiquetes(String TipoTiquetes) {
        this.TipoTiquetes = TipoTiquetes;
    }

    public String getAsientosSeleccionados() {
        return AsientosSeleccionados;
    }

    public void setAsientosSeleccionados(String AsientosSeleccionados) {
        this.AsientosSeleccionados = AsientosSeleccionados;
    }

    public String getPeliculaSeleccionada() {
        return PeliculaSeleccionada;
    }

    public void setPeliculaSeleccionada(String PeliculaSeleccionada) {
        this.PeliculaSeleccionada = PeliculaSeleccionada;
    }

    public String getFuncionSeleccionada() {
        return FuncionSeleccionada;
    }

    public void setFuncionSeleccionada(String FuncionSeleccionada) {
        this.FuncionSeleccionada = FuncionSeleccionada;
    }

    public String getDiaSeleccionado() {
        return DiaSeleccionado;
    }

    public void setDiaSeleccionado(String DiaSeleccionado) {
        this.DiaSeleccionado = DiaSeleccionado;
    }

    public String getTelefonoComprador() {
        return TelefonoComprador;
    }

    public void setTelefonoComprador(String TelefonoComprador) {
        this.TelefonoComprador = TelefonoComprador;
    }

}
