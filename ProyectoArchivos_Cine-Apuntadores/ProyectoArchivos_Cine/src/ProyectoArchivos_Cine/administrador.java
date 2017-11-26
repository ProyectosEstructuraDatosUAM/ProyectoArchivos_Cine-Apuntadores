package ProyectoArchivos_Cine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * Form para uso de administrador donde se vizualiza la reservacion se acepta o
 * se rechaza, si se rechaza el metodo en selecciona campos se pondra de nuevo
 * en verde, de lo contrario el sistema lo mantendra en rojo
 */
public class administrador extends javax.swing.JFrame {
    //Se agrega objeto de la clase de apuntador 
    private Cls_DatosApuntador tempDatos = new Cls_DatosApuntador();
    private ArrayList<RegistroCompra> ComprasRegistradas = new ArrayList<RegistroCompra>();
    private ArrayList<String> RegistrosActuales = new ArrayList<String>();
    private int IndiceLista = 0;
    int count=0; //se agrega variable contador
    /**
     * Creates new form administrador
     */
    public administrador() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPelicula = new javax.swing.JTextField();
        txtCantidadTiquetes = new javax.swing.JTextField();
        txtCostoTiquetes = new javax.swing.JTextField();
        txtTipoTarjeta = new javax.swing.JTextField();
        txtNumeroTarjeta = new javax.swing.JTextField();
        txtVencimiento = new javax.swing.JTextField();
        txtCVV = new javax.swing.JTextField();
        txtNombreTarjetaHabiente = new javax.swing.JTextField();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnDenegar = new javax.swing.JButton();
        btnAceptarCambios = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IMAX - TICKET MANAGEMENT");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Area Administrativa");

        jLabel2.setText("Pelicula Seleccionada");

        jLabel3.setText("Cantidad de boletos");

        jLabel4.setText("Costo final de boletos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Datos de la tarjeta");

        jLabel6.setText("Numero de tarjeta");

        jLabel7.setText("Tipo de tarjeta");

        jLabel8.setText("Vencimiento");

        jLabel9.setText("CVV");

        jLabel10.setText("Nombre del Tarjeta-Habiente");

        txtPelicula.setEditable(false);

        txtCantidadTiquetes.setEditable(false);

        txtCostoTiquetes.setEditable(false);

        txtTipoTarjeta.setEditable(false);

        txtNumeroTarjeta.setEditable(false);

        txtVencimiento.setEditable(false);

        txtCVV.setEditable(false);

        txtNombreTarjetaHabiente.setEditable(false);

        btnPrimero.setText("|<");
        btnPrimero.setEnabled(false);
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnAnterior.setText("<");
        btnAnterior.setEnabled(false);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setText(">");
        btnSiguiente.setEnabled(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnUltimo.setText(">|");
        btnUltimo.setEnabled(false);
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnCargar.setText("Cargar Base de datos");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar Nuevo Usuario Administrador");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnDenegar.setText("Denegar");
        btnDenegar.setEnabled(false);
        btnDenegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenegarActionPerformed(evt);
            }
        });

        btnAceptarCambios.setText("Aceptar Cambios");
        btnAceptarCambios.setEnabled(false);
        btnAceptarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCambiosActionPerformed(evt);
            }
        });

        jButton1.setText("Total Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombreTarjetaHabiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCostoTiquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCantidadTiquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtCVV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                            .addComponent(txtVencimiento, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(btnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(btnDenegar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(btnAceptarCambios)))
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(txtCantidadTiquetes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(txtCostoTiquetes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtNombreTarjetaHabiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtTipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jButton1))
                        .addGap(22, 22, 22)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimero)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente)
                    .addComponent(btnUltimo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDenegar)
                    .addComponent(btnAceptarCambios))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed

        if (tempDatos.objetoInicial == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay datos a mostrar");
        } else {
            MostrarDatos(tempDatos.Primero());
        }

    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed

        if (tempDatos.objetoInicial == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay datos a mostrar");
        } else {
            MostrarDatos(tempDatos.Anterior());
        }

    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        if (tempDatos.objetoInicial == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay datos a mostrar");
        } else {
            MostrarDatos(tempDatos.Siguiente());
        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed

        if (tempDatos.objetoInicial == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay datos a mostrar");
        } else {
            MostrarDatos(tempDatos.Ultimo());
        }

    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:

        Registrar nuevo = new Registrar();
        nuevo.setVisible(true);

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        principal princ = new principal();
        princ.setVisible(true);

    }//GEN-LAST:event_formWindowClosing

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        
        String linea;
        FileReader f = null;
        try {
            f = new FileReader("Informacion de Compra.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (BufferedReader b = new BufferedReader(f)) {
            while ((linea = b.readLine()) != null) {

                RegistroCompra temp = new RegistroCompra();
                String DatosCompra[] = linea.split(";");
                temp.setNombreComprador(DatosCompra[0]);
                temp.setTelefonoComprador(DatosCompra[1]);
                temp.setCedulaComprador(DatosCompra[2]);
                temp.setEmailComprador(DatosCompra[3]);

                temp.setTarjeta_Habiente(DatosCompra[4]);
                temp.setTarjeta_Tipo(DatosCompra[5]);
                temp.setTarjeta_Numero(DatosCompra[6]);
                temp.setTarjeta_Expiracion(DatosCompra[7]);
                temp.setTarjeta_CVV(DatosCompra[8]);
                temp.setPagoRealizado(DatosCompra[9]);

                temp.setTipoTiquetes(DatosCompra[10]);
                temp.setCantidadTiquetes(DatosCompra[11]);
                temp.setPeliculaSeleccionada(DatosCompra[12]);
                temp.setFuncionSeleccionada(DatosCompra[13]);
                temp.setAsientosSeleccionados(DatosCompra[14]);
                temp.setIDCompra(DatosCompra[15]);

                tempDatos.guardar(temp);
                /*Se crea contador para el total de los registros*/
                count++;

            }

        } catch (IOException e) {
            //lblResultado.setText("Error al leer el archivo");
        }

        IndiceLista = 0;

        btnPrimero.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnSiguiente.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnCargar.setEnabled(false);
        btnDenegar.setEnabled(true);

        tempDatos.objetoTemp = tempDatos.objetoInicial;
        MostrarDatos(tempDatos.objetoInicial);

    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnDenegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenegarActionPerformed

        try {
            tempDatos.Eliminar(tempDatos.objetoTemp.getIDCompra());
            btnAceptarCambios.setEnabled(true);
            btnDenegar.setEnabled(true);

            JOptionPane.showMessageDialog(this, "Dato eliminado");
            MostrarDatos(tempDatos.objetoTemp);
            //se agrega contador restando 1
            count--;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay mas registros");
            RegistroCompra ob = new RegistroCompra();
            ob.setPeliculaSeleccionada("");
            ob.setCantidadTiquetes("");
            ob.setPagoRealizado("");
            ob.setTarjeta_Habiente("");

            ob.setTarjeta_Tipo("");
            ob.setTarjeta_Numero("");
            ob.setTarjeta_Expiracion("");
            ob.setTarjeta_CVV("");
            MostrarDatos(ob);
        }

    }//GEN-LAST:event_btnDenegarActionPerformed

    private void btnAceptarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCambiosActionPerformed
        // TODO add your handling code here:
        // UsoArchivos archivo = new UsoArchivos();
        String linea = "";

        for (int i = 0; i < RegistrosActuales.size(); i++) {
            linea = linea + RegistrosActuales.get(i) + "\r\n";
        }

        tempDatos.ActualizarArchivo();

        tempDatos.objetoTemp = tempDatos.objetoInicial;
        MostrarDatos(tempDatos.objetoTemp);

        btnAceptarCambios.setEnabled(false);


    }//GEN-LAST:event_btnAceptarCambiosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "El total de registros dentro del sistema es de : "
                +count);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MostrarDatos(RegistroCompra ob) {
        txtPelicula.setText(ob.getPeliculaSeleccionada());
        txtCantidadTiquetes.setText(ob.getCantidadTiquetes());
        txtCostoTiquetes.setText(ob.getPagoRealizado());

        txtNombreTarjetaHabiente.setText(ob.getTarjeta_Habiente());
        txtTipoTarjeta.setText(ob.getTarjeta_Tipo());
        txtNumeroTarjeta.setText(ob.getTarjeta_Numero());
        txtVencimiento.setText(ob.getTarjeta_Expiracion());
        txtCVV.setText(ob.getTarjeta_CVV());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarCambios;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnDenegar;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JTextField txtCantidadTiquetes;
    private javax.swing.JTextField txtCostoTiquetes;
    private javax.swing.JTextField txtNombreTarjetaHabiente;
    private javax.swing.JTextField txtNumeroTarjeta;
    private javax.swing.JTextField txtPelicula;
    private javax.swing.JTextField txtTipoTarjeta;
    private javax.swing.JTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables
}
