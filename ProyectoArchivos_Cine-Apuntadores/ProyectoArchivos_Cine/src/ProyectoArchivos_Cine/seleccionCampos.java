package ProyectoArchivos_Cine;
/**
Proyeto realizado por:
Rafa
Carlos
 */
import java.awt.Color;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class seleccionCampos extends javax.swing.JFrame {

   

    public seleccionCampos() {
        initComponents();
    }
     /*Creamos el arraylist para almacenar los datosde botones y asientos seleccionados*/
    ArrayList<Reservacion> lista = new ArrayList<Reservacion>();
    ArrayList<String> TiquetesSeleccionados = new ArrayList<String>();
    ArrayList<String> AsientosSeleccionados = new ArrayList<String>();
    Reservacion reserva = new Reservacion(); //Esta clase almacena todos los elementos importantes
    String tipoTicket = " ", tanda = " ";

    String TiquetesYaReservados = "";
    String TandaYaReservada = "";
    String PeliculaYaReservada = "";
    public int CantidadTiquetes = 1;
    public int CantidadTiquetesSeleccionados = 0;

    private void color(javax.swing.JButton evt, int row, int column, String campo) {
        /*Se crea el metodo para cambiar de color en los botones de verde a amarillo
        tambien setea la posicion del array de la clase reserva*/
     
        if (evt.getBackground() == Color.green) {

            evt.setBackground(Color.yellow);
            reserva.setPosition(row, column, campo);
            TiquetesSeleccionados.add(evt.getName() + ",");
            AsientosSeleccionados.add(campo);
            CantidadTiquetesSeleccionados++;

        } else if (evt.getBackground() == Color.yellow) {
            evt.setBackground(Color.green);
            TiquetesSeleccionados.remove(evt.getName() + ",");
             AsientosSeleccionados.remove(campo);
            CantidadTiquetesSeleccionados--;

        }
        txt_CantidadSeleccionada.setText(CantidadTiquetesSeleccionados + "");
        
        // <editor-fold defaultstate="collapsed" desc="Codigo anterior que verificaba que pelicula era">
/* start of comment
         File file = new File("reservados/Pelicula1/ReservadosBladeManana.txt");

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                if (evt.getBackground() == java.awt.Color.yellow) {
                    try {
                        FileWriter escribiendo = new FileWriter(file, true);
                        escribiendo.append(evt.getName() + "\n");
                        escribiendo.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        //Blade Runner - Double Feature - Tarde 16:00-18:00
        if (pelicula.equalsIgnoreCase("Blade Runner - Double Feature")
                && tanda.equalsIgnoreCase("Tarde 16:00-18:00")) {
            if (evt.getBackground() == Color.green) {

                evt.setBackground(Color.yellow);
                reserva.setPosition(row, column, campo);
                TiquetesSeleccionados.add(row + "," + column);
                CantidadTiquetesSeleccionados++;

            } else if (evt.getBackground() == Color.yellow) {
                evt.setBackground(Color.green);
                TiquetesSeleccionados.remove(row + "," + column);
                CantidadTiquetesSeleccionados--;

            }
            txt_CantidadSeleccionada.setText(CantidadTiquetesSeleccionados + "");

            File file = new File("reservados/Pelicula1/ReservadosBladeTarde.txt");

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                if (evt.getBackground() == java.awt.Color.yellow) {
                    try {
                        FileWriter escribiendo = new FileWriter(file, true);
                        escribiendo.append(evt.getName() + "\n");
                        escribiendo.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        //Blade Runner - Double Feature - Noche 20:00-22:00
        if (pelicula.equalsIgnoreCase("Blade Runner - Double Feature")
                && tanda.equalsIgnoreCase("Noche 20:00-22:00")) {
            if (evt.getBackground() == Color.green) {

                evt.setBackground(Color.yellow);
                reserva.setPosition(row, column, campo);
                TiquetesSeleccionados.add(row + "," + column);
                CantidadTiquetesSeleccionados++;

            } else if (evt.getBackground() == Color.yellow) {
                evt.setBackground(Color.green);
                TiquetesSeleccionados.remove(row + "," + column);
                CantidadTiquetesSeleccionados--;

            }
            txt_CantidadSeleccionada.setText(CantidadTiquetesSeleccionados + "");

            File file = new File("reservados/Pelicula1/ReservadosBladeNoche.txt");

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                if (evt.getBackground() == java.awt.Color.yellow) {
                    try {
                        FileWriter escribiendo = new FileWriter(file, true);
                        escribiendo.append(evt.getName() + "\n");
                        escribiendo.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        //######################################################################
        //It - El payaso diabolico
        //It - El payaso diabolico - Mañana 10:00-12:00
        if (pelicula.equalsIgnoreCase("It - El payaso diabolico")
                && tanda.equalsIgnoreCase("Mañana 10:00-12:00")) {
            if (evt.getBackground() == Color.green) {

                evt.setBackground(Color.yellow);
                reserva.setPosition(row, column, campo);
                TiquetesSeleccionados.add(row + "," + column);
                CantidadTiquetesSeleccionados++;

            } else if (evt.getBackground() == Color.yellow) {
                evt.setBackground(Color.green);
                TiquetesSeleccionados.remove(row + "," + column);
                CantidadTiquetesSeleccionados--;

            }
            txt_CantidadSeleccionada.setText(CantidadTiquetesSeleccionados + "");

            File file = new File("reservados/Pelicula2/ReservadosItManana.txt");

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                if (evt.getBackground() == java.awt.Color.yellow) {
                    try {
                        FileWriter escribiendo = new FileWriter(file, true);
                        escribiendo.append(evt.getName() + "\n");
                        escribiendo.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        //It - El payaso diabolico - Tarde 16:00-18:00
        if (pelicula.equalsIgnoreCase("It - El payaso diabolico")
                && tanda.equalsIgnoreCase("Tarde 16:00-18:00")) {
            if (evt.getBackground() == Color.green) {

                evt.setBackground(Color.yellow);
                reserva.setPosition(row, column, campo);
                TiquetesSeleccionados.add(row + "," + column);
                CantidadTiquetesSeleccionados++;

            } else if (evt.getBackground() == Color.yellow) {
                evt.setBackground(Color.green);
                TiquetesSeleccionados.remove(row + "," + column);
                CantidadTiquetesSeleccionados--;

            }
            txt_CantidadSeleccionada.setText(CantidadTiquetesSeleccionados + "");

            File file = new File("reservados/Pelicula2/ReservadosItTarde.txt");

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                if (evt.getBackground() == java.awt.Color.yellow) {
                    try {
                        FileWriter escribiendo = new FileWriter(file, true);
                        escribiendo.append(evt.getName() + "\n");
                        escribiendo.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        //It - El payaso diabolico - Noche 20:00-22:00
        if (pelicula.equalsIgnoreCase("It - El payaso diabolico")
                && tanda.equalsIgnoreCase("Noche 20:00-22:00")) {
            if (evt.getBackground() == Color.green) {

                evt.setBackground(Color.yellow);
                reserva.setPosition(row, column, campo);
                TiquetesSeleccionados.add(row + "," + column);
                CantidadTiquetesSeleccionados++;

            } else if (evt.getBackground() == Color.yellow) {
                evt.setBackground(Color.green);
                TiquetesSeleccionados.remove(row + "," + column);
                CantidadTiquetesSeleccionados--;

            }
            txt_CantidadSeleccionada.setText(CantidadTiquetesSeleccionados + "");

            File file = new File("reservados/Pelicula2/ReservadosItNoche.txt");

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                if (evt.getBackground() == java.awt.Color.yellow) {
                    try {
                        FileWriter escribiendo = new FileWriter(file, true);
                        escribiendo.append(evt.getName() + "\n");
                        escribiendo.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        //######################################################################
        //NinjaGo - Lego
        //NinjaGo - Lego - Mañana 10:00-12:00
        if (pelicula.equalsIgnoreCase("NinjaGo - Lego")
                && tanda.equalsIgnoreCase("Mañana 10:00-12:00")) {
            if (evt.getBackground() == Color.green) {

                evt.setBackground(Color.yellow);
                reserva.setPosition(row, column, campo);
                TiquetesSeleccionados.add(row + "," + column);
                CantidadTiquetesSeleccionados++;

            } else if (evt.getBackground() == Color.yellow) {
                evt.setBackground(Color.green);
                TiquetesSeleccionados.remove(row + "," + column);
                CantidadTiquetesSeleccionados--;

            }
            txt_CantidadSeleccionada.setText(CantidadTiquetesSeleccionados + "");

            File file = new File("reservados/Pelicula3/ReservadoslegoManana.txt");

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                if (evt.getBackground() == java.awt.Color.yellow) {
                    try {
                        FileWriter escribiendo = new FileWriter(file, true);
                        escribiendo.append(evt.getName() + "\n");
                        escribiendo.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        //NinjaGo - Lego - Tarde 16:00-18:00
        if (pelicula.equalsIgnoreCase("NinjaGo - Lego")
                && tanda.equalsIgnoreCase("Tarde 16:00-18:00")) {
            if (evt.getBackground() == Color.green) {

                evt.setBackground(Color.yellow);
                reserva.setPosition(row, column, campo);
                TiquetesSeleccionados.add(row + "," + column);
                CantidadTiquetesSeleccionados++;

            } else if (evt.getBackground() == Color.yellow) {
                evt.setBackground(Color.green);
                TiquetesSeleccionados.remove(row + "," + column);
                CantidadTiquetesSeleccionados--;

            }
            txt_CantidadSeleccionada.setText(CantidadTiquetesSeleccionados + "");

            File file = new File("reservados/Pelicula3/ReservadoslegoTarde.txt");

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                if (evt.getBackground() == java.awt.Color.yellow) {
                    try {
                        FileWriter escribiendo = new FileWriter(file, true);
                        escribiendo.append(evt.getName() + "\n");
                        escribiendo.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        //NinjaGo - Lego - Noche 20:00-22:00
        if (pelicula.equalsIgnoreCase("NinjaGo - Lego")
                && tanda.equalsIgnoreCase("Noche 20:00-22:00")) {
            if (evt.getBackground() == Color.green) {

                evt.setBackground(Color.yellow);
                reserva.setPosition(row, column, campo);
                TiquetesSeleccionados.add(row + "," + column);
                CantidadTiquetesSeleccionados++;

            } else if (evt.getBackground() == Color.yellow) {
                evt.setBackground(Color.green);
                TiquetesSeleccionados.remove(row + "," + column);
                CantidadTiquetesSeleccionados--;

            }
            txt_CantidadSeleccionada.setText(CantidadTiquetesSeleccionados + "");

            File file = new File("reservados/Pelicula3/ReservadoslegoNoche.txt");

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                if (evt.getBackground() == java.awt.Color.yellow) {
                    try {
                        FileWriter escribiendo = new FileWriter(file, true);
                        escribiendo.append(evt.getName() + "\n");
                        escribiendo.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        //######################################################################
        //Battle of the Sexes
        //Battle of the Sexes - Mañana 10:00-12:00
        if (pelicula.equalsIgnoreCase("Battle of the Sexes")
                && tanda.equalsIgnoreCase("Mañana 10:00-12:00")) {
            if (evt.getBackground() == Color.green) {

                evt.setBackground(Color.yellow);
                reserva.setPosition(row, column, campo);
                TiquetesSeleccionados.add(row + "," + column);
                CantidadTiquetesSeleccionados++;

            } else if (evt.getBackground() == Color.yellow) {
                evt.setBackground(Color.green);
                TiquetesSeleccionados.remove(row + "," + column);
                CantidadTiquetesSeleccionados--;

            }
            txt_CantidadSeleccionada.setText(CantidadTiquetesSeleccionados + "");

            File file = new File("reservados/Pelicula4/ReservadosBattleManana.txt");

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                if (evt.getBackground() == java.awt.Color.yellow) {
                    try {
                        FileWriter escribiendo = new FileWriter(file, true);
                        escribiendo.append(evt.getName() + "\n");
                        escribiendo.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        //Battle of the Sexes - Tarde 16:00-18:00
        if (pelicula.equalsIgnoreCase("Battle of the Sexes")
                && tanda.equalsIgnoreCase("Tarde 16:00-18:00")) {
            if (evt.getBackground() == Color.green) {

                evt.setBackground(Color.yellow);
                reserva.setPosition(row, column, campo);
                TiquetesSeleccionados.add(row + "," + column);
                CantidadTiquetesSeleccionados++;

            } else if (evt.getBackground() == Color.yellow) {
                evt.setBackground(Color.green);
                TiquetesSeleccionados.remove(row + "," + column);
                CantidadTiquetesSeleccionados--;

            }
            txt_CantidadSeleccionada.setText(CantidadTiquetesSeleccionados + "");

            File file = new File("reservados/Pelicula4/ReservadosBattleTarde.txt");

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                if (evt.getBackground() == java.awt.Color.yellow) {
                    try {
                        FileWriter escribiendo = new FileWriter(file, true);
                        escribiendo.append(evt.getName() + "\n");
                        escribiendo.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        //Battle of the Sexes - Noche 20:00-22:00
        if (pelicula.equalsIgnoreCase("Battle of the Sexes")
                && tanda.equalsIgnoreCase("Noche 20:00-22:00")) {
            if (evt.getBackground() == Color.green) {

                evt.setBackground(Color.yellow);
                reserva.setPosition(row, column, campo);
                TiquetesSeleccionados.add(row + "," + column);
                CantidadTiquetesSeleccionados++;

            } else if (evt.getBackground() == Color.yellow) {
                evt.setBackground(Color.green);
                TiquetesSeleccionados.remove(row + "," + column);
                CantidadTiquetesSeleccionados--;

            }
            txt_CantidadSeleccionada.setText(CantidadTiquetesSeleccionados + "");

            File file = new File("reservados/Pelicula4/ReservadosBattleNoche.txt");

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                if (evt.getBackground() == java.awt.Color.yellow) {
                    try {
                        FileWriter escribiendo = new FileWriter(file, true);
                        escribiendo.append(evt.getName() + "\n");
                        escribiendo.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            //  }
        //######################################################################
*/
// </editor-fold>       
    }

    private void DesactBoton(javax.swing.JButton evt) {
        //Se recibe un objeto boton y se verifica si está seleccionado anteriormente para desactivarlo
        
        String pelicula = txt_peliculas.getText();
        String tanda = txt_tanda.getText();
        
        //Se dividen todos los nombres de botones que se ingresaron
        String array[] = TiquetesYaReservados.split(",");
        
        //Se comparan todos los nombres ingresados anteriormente al boton que está evaluando este metodo
        for (int i = 0; i <= array.length - 1; i++) {

            //se guardan las posiciones del array en una variable temporal
            String temp = array[i];
            
            //Se comparan el nombre del boton con la variable temporal, si son iguales, está seleccionado y debe desactivarse
            if (evt.getName().equals(temp)) {
                evt.setBackground(Color.red);
            }
            if (temp == null) {
                break;
            }

        }        
        // <editor-fold defaultstate="collapsed" desc="Codigo anterior que verificaba que peliculas se habían seleccionado en el txt">

        /**                         
        if (pelicula.equalsIgnoreCase("Blade Runner - Double Feature")
                && tanda.equalsIgnoreCase("Mañana 10:00-12:00")) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("reservados/Pelicula1/ReservadosBladeManana.txt"));
                String temp = " ";
                while (temp != null) {
                    temp = buffer.readLine();
                    if (evt.getName().equals(temp)) {
                        evt.setBackground(Color.red);
                    }
                    if (temp == null) {
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else if (pelicula.equalsIgnoreCase("Blade Runner - Double Feature")
                && tanda.equalsIgnoreCase("Tarde 16:00-18:00")) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("reservados/Pelicula1/ReservadosBladeTarde.txt"));
                String temp = " ";
                while (temp != null) {
                    temp = buffer.readLine();
                    if (evt.getName().equals(temp)) {
                        evt.setBackground(Color.red);
                    }
                    if (temp == null) {
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else if (pelicula.equalsIgnoreCase("Blade Runner - Double Feature")
                && tanda.equalsIgnoreCase("Noche 20:00-22:00")) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("reservados/Pelicula1/ReservadosBladeNoche.txt"));
                String temp = " ";
                while (temp != null) {
                    temp = buffer.readLine();
                    if (evt.getName().equals(temp)) {
                        evt.setBackground(Color.red);
                    }
                    if (temp == null) {
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        //######################################################################
        //It - El payaso diabolico
        if (pelicula.equalsIgnoreCase("It - El payaso diabolico")
                && tanda.equalsIgnoreCase("Mañana 10:00-12:00")) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("reservados/Pelicula2/ReservadosItManana.txt"));
                String temp = " ";
                while (temp != null) {
                    temp = buffer.readLine();
                    if (evt.getName().equals(temp)) {
                        evt.setBackground(Color.red);
                    }
                    if (temp == null) {
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else if (pelicula.equalsIgnoreCase("It - El payaso diabolico")
                && tanda.equalsIgnoreCase("Tarde 16:00-18:00")) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("reservados/Pelicula2/ReservadosItTarde.txt"));
                String temp = " ";
                while (temp != null) {
                    temp = buffer.readLine();
                    if (evt.getName().equals(temp)) {
                        evt.setBackground(Color.red);
                    }
                    if (temp == null) {
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else if (pelicula.equalsIgnoreCase("It - El payaso diabolico")
                && tanda.equalsIgnoreCase("Noche 20:00-22:00")) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("reservados/Pelicula2/ReservadosItNoche.txt"));
                String temp = " ";
                while (temp != null) {
                    temp = buffer.readLine();
                    if (evt.getName().equals(temp)) {
                        evt.setBackground(Color.red);
                    }
                    if (temp == null) {
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        //######################################################################
        //NinjaGo - Lego
        if (pelicula.equalsIgnoreCase("NinjaGo - Lego")
                && tanda.equalsIgnoreCase("Mañana 10:00-12:00")) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("reservados/Pelicula3/ReservadoslegoManana.txt"));
                String temp = " ";
                while (temp != null) {
                    temp = buffer.readLine();
                    if (evt.getName().equals(temp)) {
                        evt.setBackground(Color.red);
                    }
                    if (temp == null) {
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else if (pelicula.equalsIgnoreCase("NinjaGo - Lego")
                && tanda.equalsIgnoreCase("Tarde 16:00-18:00")) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("reservados/Pelicula3/ReservadoslegoTarde.txt"));
                String temp = " ";
                while (temp != null) {
                    temp = buffer.readLine();
                    if (evt.getName().equals(temp)) {
                        evt.setBackground(Color.red);
                    }
                    if (temp == null) {
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else if (pelicula.equalsIgnoreCase("NinjaGo - Lego")
                && tanda.equalsIgnoreCase("Noche 20:00-22:00")) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("reservados/Pelicula3/ReservadoslegoNoche.txt"));
                String temp = " ";
                while (temp != null) {
                    temp = buffer.readLine();
                    if (evt.getName().equals(temp)) {
                        evt.setBackground(Color.red);
                    }
                    if (temp == null) {
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        //######################################################################
        //Battle of the Sexes
        if (pelicula.equalsIgnoreCase("Battle of the Sexes")
                && tanda.equalsIgnoreCase("Mañana 10:00-12:00")) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("reservados/Pelicula4/ReservadosBattleManana.txt"));
                String temp = " ";
                while (temp != null) {
                    temp = buffer.readLine();
                    if (evt.getName().equals(temp)) {
                        evt.setBackground(Color.red);
                    }
                    if (temp == null) {
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else if (pelicula.equalsIgnoreCase("Battle of the Sexes")
                && tanda.equalsIgnoreCase("Tarde 16:00-18:00")) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("reservados/Pelicula4/ReservadosBattleTarde.txt"));
                String temp = " ";
                while (temp != null) {
                    temp = buffer.readLine();
                    if (evt.getName().equals(temp)) {
                        evt.setBackground(Color.red);
                    }
                    if (temp == null) {
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else if (pelicula.equalsIgnoreCase("Battle of the Sexes")
                && tanda.equalsIgnoreCase("Noche 20:00-22:00")) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("reservados/Pelicula4/ReservadosBattleNoche.txt"));
                String temp = " ";
                while (temp != null) {
                    temp = buffer.readLine();
                    if (evt.getName().equals(temp)) {
                        evt.setBackground(Color.red);
                    }
                    if (temp == null) {
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
         */
        //######################################################################
        /*try{
            BufferedReader buffer = new BufferedReader(new FileReader("Reservados.txt"));
            String temp = " "; 
            while(temp !=null){
                temp = buffer.readLine();
                if(evt.getName().equals(temp)){
                    evt.setBackground(Color.red);
                }
                if(temp==null){
                    break;
                }
            }

        }catch(IOException ex){
            ex.printStackTrace();
        }
        */
        // </editor-fold>   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Btn_E14 = new javax.swing.JButton();
        Btn_A14 = new javax.swing.JButton();
        Btn_B14 = new javax.swing.JButton();
        Btn_C14 = new javax.swing.JButton();
        Btn_D14 = new javax.swing.JButton();
        Btn_A7 = new javax.swing.JButton();
        Btn_B7 = new javax.swing.JButton();
        Btn_C7 = new javax.swing.JButton();
        Btn_D7 = new javax.swing.JButton();
        Btn_E7 = new javax.swing.JButton();
        Btn_A6 = new javax.swing.JButton();
        Btn_E6 = new javax.swing.JButton();
        Btn_B6 = new javax.swing.JButton();
        Btn_C6 = new javax.swing.JButton();
        Btn_D6 = new javax.swing.JButton();
        Btn_B5 = new javax.swing.JButton();
        Btn_D5 = new javax.swing.JButton();
        Btn_C5 = new javax.swing.JButton();
        Btn_E5 = new javax.swing.JButton();
        Btn_A5 = new javax.swing.JButton();
        Btn_B4 = new javax.swing.JButton();
        Btn_E4 = new javax.swing.JButton();
        Btn_D4 = new javax.swing.JButton();
        Btn_A4 = new javax.swing.JButton();
        Btn_C4 = new javax.swing.JButton();
        Btn_B3 = new javax.swing.JButton();
        Btn_E3 = new javax.swing.JButton();
        Btn_C3 = new javax.swing.JButton();
        Btn_A3 = new javax.swing.JButton();
        Btn_D3 = new javax.swing.JButton();
        Btn_C2 = new javax.swing.JButton();
        Btn_D2 = new javax.swing.JButton();
        Btn_A2 = new javax.swing.JButton();
        Btn_B2 = new javax.swing.JButton();
        Btn_E2 = new javax.swing.JButton();
        Btn_B1 = new javax.swing.JButton();
        Btn_D1 = new javax.swing.JButton();
        Btn_E1 = new javax.swing.JButton();
        Btn_C1 = new javax.swing.JButton();
        Btn_A1 = new javax.swing.JButton();
        Btn_A10 = new javax.swing.JButton();
        Btn_B10 = new javax.swing.JButton();
        Btn_C10 = new javax.swing.JButton();
        Btn_D10 = new javax.swing.JButton();
        Btn_E10 = new javax.swing.JButton();
        Btn_A9 = new javax.swing.JButton();
        Btn_E9 = new javax.swing.JButton();
        Btn_B9 = new javax.swing.JButton();
        Btn_C9 = new javax.swing.JButton();
        Btn_D9 = new javax.swing.JButton();
        Btn_B8 = new javax.swing.JButton();
        Btn_D8 = new javax.swing.JButton();
        Btn_C8 = new javax.swing.JButton();
        Btn_E8 = new javax.swing.JButton();
        Btn_A8 = new javax.swing.JButton();
        Btn_A13 = new javax.swing.JButton();
        Btn_D13 = new javax.swing.JButton();
        Btn_D11 = new javax.swing.JButton();
        Btn_C11 = new javax.swing.JButton();
        Btn_D12 = new javax.swing.JButton();
        Btn_E12 = new javax.swing.JButton();
        Btn_B11 = new javax.swing.JButton();
        Btn_E13 = new javax.swing.JButton();
        Btn_B13 = new javax.swing.JButton();
        Btn_A11 = new javax.swing.JButton();
        Btn_B12 = new javax.swing.JButton();
        Btn_E11 = new javax.swing.JButton();
        Btn_C13 = new javax.swing.JButton();
        Btn_A12 = new javax.swing.JButton();
        Btn_C12 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre_completo = new javax.swing.JTextField();
        txt_correo_electronico = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        Btn_Atras = new javax.swing.JButton();
        txt_tipo_tiquete = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Btn_Pagar = new javax.swing.JButton();
        btn_masTiquetes = new javax.swing.JButton();
        btn_menosTiquetes = new javax.swing.JButton();
        txt_cantidad_tiquetes = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_CantidadSeleccionada = new javax.swing.JLabel();
        txt_peliculas = new javax.swing.JTextField();
        txt_tanda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seleccion de Butacas");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(60, 51, 87));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(246, 245, 255));
        jLabel3.setText("B");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(246, 245, 255));
        jLabel4.setText("A");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(246, 245, 255));
        jLabel5.setText("A");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(246, 245, 255));
        jLabel6.setText("B");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(246, 245, 255));
        jLabel7.setText("C");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(246, 245, 255));
        jLabel8.setText("D");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(246, 245, 255));
        jLabel9.setText("E");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(246, 245, 255));
        jLabel10.setText("E");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(246, 245, 255));
        jLabel11.setText("C");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(246, 245, 255));
        jLabel12.setText("D");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        Btn_E14.setBackground(java.awt.Color.green);
        Btn_E14.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E14.setText("14");
        Btn_E14.setName("Btn_E14"); // NOI18N
        Btn_E14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E14ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 40, -1));

        Btn_A14.setBackground(java.awt.Color.green);
        Btn_A14.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A14.setText("14");
        Btn_A14.setName("Btn_A14"); // NOI18N
        Btn_A14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A14ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 40, -1));

        Btn_B14.setBackground(java.awt.Color.green);
        Btn_B14.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B14.setText("14");
        Btn_B14.setName("Btn_B14"); // NOI18N
        Btn_B14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B14ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 40, -1));

        Btn_C14.setBackground(java.awt.Color.green);
        Btn_C14.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C14.setText("14");
        Btn_C14.setName("Btn_C14"); // NOI18N
        Btn_C14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C14ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 40, -1));

        Btn_D14.setBackground(java.awt.Color.green);
        Btn_D14.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D14.setText("14");
        Btn_D14.setName("Btn_D14"); // NOI18N
        Btn_D14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D14ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 40, -1));

        Btn_A7.setBackground(java.awt.Color.green);
        Btn_A7.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A7.setText("7");
        Btn_A7.setName("Btn_A7"); // NOI18N
        Btn_A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A7ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 40, -1));

        Btn_B7.setBackground(java.awt.Color.green);
        Btn_B7.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B7.setText("7");
        Btn_B7.setName("Btn_B7"); // NOI18N
        Btn_B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B7ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 40, -1));

        Btn_C7.setBackground(java.awt.Color.green);
        Btn_C7.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C7.setText("7");
        Btn_C7.setName("Btn_C7"); // NOI18N
        Btn_C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C7ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 40, -1));

        Btn_D7.setBackground(java.awt.Color.green);
        Btn_D7.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D7.setText("7");
        Btn_D7.setName("Btn_D7"); // NOI18N
        Btn_D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D7ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 40, -1));

        Btn_E7.setBackground(java.awt.Color.green);
        Btn_E7.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E7.setText("7");
        Btn_E7.setName("Btn_E7"); // NOI18N
        Btn_E7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E7ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 40, -1));

        Btn_A6.setBackground(java.awt.Color.green);
        Btn_A6.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A6.setText("6");
        Btn_A6.setName("Btn_A6"); // NOI18N
        Btn_A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A6ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 40, -1));

        Btn_E6.setBackground(java.awt.Color.green);
        Btn_E6.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E6.setText("6");
        Btn_E6.setName("Btn_E6"); // NOI18N
        Btn_E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E6ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 40, -1));

        Btn_B6.setBackground(java.awt.Color.green);
        Btn_B6.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B6.setText("6");
        Btn_B6.setName("Btn_B6"); // NOI18N
        Btn_B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B6ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 40, -1));

        Btn_C6.setBackground(java.awt.Color.green);
        Btn_C6.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C6.setText("6");
        Btn_C6.setName("Btn_C6"); // NOI18N
        Btn_C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C6ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 40, -1));

        Btn_D6.setBackground(java.awt.Color.green);
        Btn_D6.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D6.setText("6");
        Btn_D6.setName("Btn_D6"); // NOI18N
        Btn_D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D6ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 40, -1));

        Btn_B5.setBackground(java.awt.Color.green);
        Btn_B5.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B5.setText("5");
        Btn_B5.setName("Btn_B5"); // NOI18N
        Btn_B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B5ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 40, -1));

        Btn_D5.setBackground(java.awt.Color.green);
        Btn_D5.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D5.setText("5");
        Btn_D5.setName("Btn_D5"); // NOI18N
        Btn_D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D5ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 40, -1));

        Btn_C5.setBackground(java.awt.Color.green);
        Btn_C5.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C5.setText("5");
        Btn_C5.setName("Btn_C5"); // NOI18N
        Btn_C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C5ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 40, -1));

        Btn_E5.setBackground(java.awt.Color.green);
        Btn_E5.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E5.setText("5");
        Btn_E5.setName("Btn_E5"); // NOI18N
        Btn_E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E5ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 40, -1));

        Btn_A5.setBackground(java.awt.Color.green);
        Btn_A5.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A5.setText("5");
        Btn_A5.setName("Btn_A5"); // NOI18N
        Btn_A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A5ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 40, -1));

        Btn_B4.setBackground(java.awt.Color.green);
        Btn_B4.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B4.setText("4");
        Btn_B4.setName("Btn_B4"); // NOI18N
        Btn_B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B4ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 40, -1));

        Btn_E4.setBackground(java.awt.Color.green);
        Btn_E4.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E4.setText("4");
        Btn_E4.setName("Btn_E4"); // NOI18N
        Btn_E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E4ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 40, -1));

        Btn_D4.setBackground(java.awt.Color.green);
        Btn_D4.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D4.setText("4");
        Btn_D4.setName("Btn_D4"); // NOI18N
        Btn_D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D4ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 40, -1));

        Btn_A4.setBackground(java.awt.Color.green);
        Btn_A4.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A4.setText("4");
        Btn_A4.setName("Btn_A4"); // NOI18N
        Btn_A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A4ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 40, -1));

        Btn_C4.setBackground(java.awt.Color.green);
        Btn_C4.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C4.setText("4");
        Btn_C4.setName("Btn_C4"); // NOI18N
        Btn_C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C4ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 40, -1));

        Btn_B3.setBackground(java.awt.Color.green);
        Btn_B3.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B3.setText("3");
        Btn_B3.setName("Btn_B3"); // NOI18N
        Btn_B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B3ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 40, -1));

        Btn_E3.setBackground(java.awt.Color.green);
        Btn_E3.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E3.setText("3");
        Btn_E3.setName("Btn_E3"); // NOI18N
        Btn_E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E3ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 40, -1));

        Btn_C3.setBackground(java.awt.Color.green);
        Btn_C3.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C3.setText("3");
        Btn_C3.setName("Btn_C3"); // NOI18N
        Btn_C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C3ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 40, -1));

        Btn_A3.setBackground(java.awt.Color.green);
        Btn_A3.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A3.setText("3");
        Btn_A3.setName("Btn_A3"); // NOI18N
        Btn_A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A3ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 40, -1));

        Btn_D3.setBackground(java.awt.Color.green);
        Btn_D3.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D3.setText("3");
        Btn_D3.setName("Btn_D3"); // NOI18N
        Btn_D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D3ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 40, -1));

        Btn_C2.setBackground(java.awt.Color.green);
        Btn_C2.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C2.setText("2");
        Btn_C2.setName("Btn_C2"); // NOI18N
        Btn_C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C2ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 40, -1));

        Btn_D2.setBackground(java.awt.Color.green);
        Btn_D2.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D2.setText("2");
        Btn_D2.setName("Btn_D2"); // NOI18N
        Btn_D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D2ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 40, -1));

        Btn_A2.setBackground(java.awt.Color.green);
        Btn_A2.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A2.setText("2");
        Btn_A2.setName("Btn_A2"); // NOI18N
        Btn_A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A2ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 40, -1));

        Btn_B2.setBackground(java.awt.Color.green);
        Btn_B2.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B2.setText("2");
        Btn_B2.setName("Btn_B2"); // NOI18N
        Btn_B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B2ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 40, -1));

        Btn_E2.setBackground(java.awt.Color.green);
        Btn_E2.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E2.setText("2");
        Btn_E2.setName("Btn_E2"); // NOI18N
        Btn_E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E2ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 40, -1));

        Btn_B1.setBackground(java.awt.Color.green);
        Btn_B1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B1.setText("1");
        Btn_B1.setName("Btn_B1"); // NOI18N
        Btn_B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B1ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 40, -1));

        Btn_D1.setBackground(java.awt.Color.green);
        Btn_D1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D1.setText("1");
        Btn_D1.setName("Btn_D1"); // NOI18N
        Btn_D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D1ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 40, -1));

        Btn_E1.setBackground(java.awt.Color.green);
        Btn_E1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E1.setText("1");
        Btn_E1.setName("Btn_E1"); // NOI18N
        Btn_E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E1ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 40, -1));

        Btn_C1.setBackground(java.awt.Color.green);
        Btn_C1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C1.setText("1");
        Btn_C1.setName("Btn_C1"); // NOI18N
        Btn_C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C1ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 40, -1));

        Btn_A1.setBackground(java.awt.Color.green);
        Btn_A1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A1.setText("1");
        Btn_A1.setName("Btn_A1"); // NOI18N
        Btn_A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A1ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 40, -1));

        Btn_A10.setBackground(java.awt.Color.green);
        Btn_A10.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A10.setText("10");
        Btn_A10.setName("Btn_A10"); // NOI18N
        Btn_A10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A10ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 40, -1));

        Btn_B10.setBackground(java.awt.Color.green);
        Btn_B10.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B10.setText("10");
        Btn_B10.setName("Btn_B10"); // NOI18N
        Btn_B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B10ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 40, -1));

        Btn_C10.setBackground(java.awt.Color.green);
        Btn_C10.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C10.setText("10");
        Btn_C10.setName("Btn_C10"); // NOI18N
        Btn_C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C10ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 40, -1));

        Btn_D10.setBackground(java.awt.Color.green);
        Btn_D10.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D10.setText("10");
        Btn_D10.setName("Btn_D10"); // NOI18N
        Btn_D10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D10ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 40, -1));

        Btn_E10.setBackground(java.awt.Color.green);
        Btn_E10.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E10.setText("10");
        Btn_E10.setName("Btn_E10"); // NOI18N
        Btn_E10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E10ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 40, -1));

        Btn_A9.setBackground(java.awt.Color.green);
        Btn_A9.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A9.setText("9");
        Btn_A9.setName("Btn_A9"); // NOI18N
        Btn_A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A9ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 40, -1));

        Btn_E9.setBackground(java.awt.Color.green);
        Btn_E9.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E9.setText("9");
        Btn_E9.setName("Btn_E9"); // NOI18N
        Btn_E9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E9ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 40, -1));

        Btn_B9.setBackground(java.awt.Color.green);
        Btn_B9.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B9.setText("9");
        Btn_B9.setName("Btn_B9"); // NOI18N
        Btn_B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B9ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 40, -1));

        Btn_C9.setBackground(java.awt.Color.green);
        Btn_C9.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C9.setText("9");
        Btn_C9.setName("Btn_C9"); // NOI18N
        Btn_C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C9ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 40, -1));

        Btn_D9.setBackground(java.awt.Color.green);
        Btn_D9.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D9.setText("9");
        Btn_D9.setName("Btn_D9"); // NOI18N
        Btn_D9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D9ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 40, -1));

        Btn_B8.setBackground(java.awt.Color.green);
        Btn_B8.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B8.setText("8");
        Btn_B8.setName("Btn_B8"); // NOI18N
        Btn_B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B8ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 40, -1));

        Btn_D8.setBackground(java.awt.Color.green);
        Btn_D8.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D8.setText("8");
        Btn_D8.setName("Btn_D8"); // NOI18N
        Btn_D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D8ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 40, -1));

        Btn_C8.setBackground(java.awt.Color.green);
        Btn_C8.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C8.setText("8");
        Btn_C8.setName("Btn_C8"); // NOI18N
        Btn_C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C8ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 40, -1));

        Btn_E8.setBackground(java.awt.Color.green);
        Btn_E8.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E8.setText("8");
        Btn_E8.setName("Btn_E8"); // NOI18N
        Btn_E8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E8ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 40, -1));

        Btn_A8.setBackground(java.awt.Color.green);
        Btn_A8.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A8.setText("8");
        Btn_A8.setName("Btn_A8"); // NOI18N
        Btn_A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A8ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 40, -1));

        Btn_A13.setBackground(java.awt.Color.green);
        Btn_A13.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A13.setText("13");
        Btn_A13.setName("Btn_A13"); // NOI18N
        Btn_A13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A13ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 40, -1));

        Btn_D13.setBackground(java.awt.Color.green);
        Btn_D13.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D13.setText("13");
        Btn_D13.setName("Btn_D13"); // NOI18N
        Btn_D13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D13ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 40, -1));

        Btn_D11.setBackground(java.awt.Color.green);
        Btn_D11.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D11.setText("11");
        Btn_D11.setName("Btn_D11"); // NOI18N
        Btn_D11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D11ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 40, -1));

        Btn_C11.setBackground(java.awt.Color.green);
        Btn_C11.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C11.setText("11");
        Btn_C11.setName("Btn_C11"); // NOI18N
        Btn_C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C11ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 40, -1));

        Btn_D12.setBackground(java.awt.Color.green);
        Btn_D12.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_D12.setText("12");
        Btn_D12.setName("Btn_D12"); // NOI18N
        Btn_D12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D12ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_D12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 40, -1));

        Btn_E12.setBackground(java.awt.Color.green);
        Btn_E12.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E12.setText("12");
        Btn_E12.setName("Btn_E12"); // NOI18N
        Btn_E12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E12ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 40, -1));

        Btn_B11.setBackground(java.awt.Color.green);
        Btn_B11.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B11.setText("11");
        Btn_B11.setName("Btn_B11"); // NOI18N
        Btn_B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B11ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 40, -1));

        Btn_E13.setBackground(java.awt.Color.green);
        Btn_E13.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E13.setText("13");
        Btn_E13.setName("Btn_E13"); // NOI18N
        Btn_E13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E13ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 40, -1));

        Btn_B13.setBackground(java.awt.Color.green);
        Btn_B13.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B13.setText("13");
        Btn_B13.setName("Btn_B13"); // NOI18N
        Btn_B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B13ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 40, -1));

        Btn_A11.setBackground(java.awt.Color.green);
        Btn_A11.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A11.setText("11");
        Btn_A11.setName("Btn_A11"); // NOI18N
        Btn_A11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A11ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 40, -1));

        Btn_B12.setBackground(java.awt.Color.green);
        Btn_B12.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_B12.setText("12");
        Btn_B12.setName("Btn_B12"); // NOI18N
        Btn_B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B12ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_B12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 40, -1));

        Btn_E11.setBackground(java.awt.Color.green);
        Btn_E11.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_E11.setText("11");
        Btn_E11.setName("Btn_E11"); // NOI18N
        Btn_E11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E11ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_E11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 40, -1));

        Btn_C13.setBackground(java.awt.Color.green);
        Btn_C13.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C13.setText("13");
        Btn_C13.setName("Btn_C13"); // NOI18N
        Btn_C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C13ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 40, -1));

        Btn_A12.setBackground(java.awt.Color.green);
        Btn_A12.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_A12.setText("12");
        Btn_A12.setName("Btn_A12"); // NOI18N
        Btn_A12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A12ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_A12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 40, -1));

        Btn_C12.setBackground(java.awt.Color.green);
        Btn_C12.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Btn_C12.setText("12");
        Btn_C12.setName("Btn_C12"); // NOI18N
        Btn_C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C12ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_C12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 40, -1));

        jLabel13.setFont(new java.awt.Font("Abyssinica SIL", 2, 24)); // NOI18N
        jLabel13.setForeground(java.awt.Color.orange);
        jLabel13.setText("Formulario de Reservación");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 2, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Tipo de tiquete");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Abyssinica SIL", 2, 14)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Nombre Completo: ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel15.setBackground(java.awt.Color.white);
        jLabel15.setFont(new java.awt.Font("Abyssinica SIL", 2, 14)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("Correo Electronico: ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel16.setFont(new java.awt.Font("Abyssinica SIL", 2, 14)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("Cedula: ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel17.setFont(new java.awt.Font("Abyssinica SIL", 2, 14)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("Cantidad de tiquetes: ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel18.setFont(new java.awt.Font("Abyssinica SIL", 2, 14)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Telefono: ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 2, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.orange);
        jLabel1.setText("Seleccione Butacas: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));
        getContentPane().add(txt_nombre_completo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 270, -1));

        txt_correo_electronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correo_electronicoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_correo_electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 210, -1));
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 210, -1));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, -1));

        Btn_Atras.setText("Atras");
        Btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AtrasActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txt_tipo_tiquete.setFont(new java.awt.Font("Abyssinica SIL", 2, 12)); // NOI18N
        txt_tipo_tiquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adulto Mayor", "Adulto", "Joven", "Niño" }));
        txt_tipo_tiquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipo_tiqueteActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tipo_tiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 140, -1));

        jPanel1.setBackground(java.awt.Color.black);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imax.jpg"))); // NOI18N
        jLabel19.setText("jLabel19");

        jLabel20.setFont(new java.awt.Font("Abyssinica SIL", 2, 18)); // NOI18N
        jLabel20.setForeground(java.awt.Color.white);
        jLabel20.setText("Seleccione Pelicula: ");

        Btn_Pagar.setText("Siguiente");
        Btn_Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PagarActionPerformed(evt);
            }
        });

        btn_masTiquetes.setText("+");
        btn_masTiquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masTiquetesActionPerformed(evt);
            }
        });

        btn_menosTiquetes.setText("-");
        btn_menosTiquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosTiquetesActionPerformed(evt);
            }
        });

        txt_cantidad_tiquetes.setEditable(false);
        txt_cantidad_tiquetes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cantidad_tiquetes.setText("1");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cantidad Seleccionada: ");

        txt_CantidadSeleccionada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_CantidadSeleccionada.setForeground(new java.awt.Color(255, 255, 255));
        txt_CantidadSeleccionada.setText("0");
        txt_CantidadSeleccionada.setEnabled(false);

        txt_peliculas.setFont(new java.awt.Font("Abyssinica SIL", 2, 14)); // NOI18N
        txt_peliculas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_peliculas.setEnabled(false);

        txt_tanda.setEditable(false);
        txt_tanda.setFont(new java.awt.Font("Abyssinica SIL", 2, 14)); // NOI18N
        txt_tanda.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_CantidadSeleccionada))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel20)
                                .addGap(75, 75, 75)
                                .addComponent(txt_peliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_menosTiquetes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cantidad_tiquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_masTiquetes))
                            .addComponent(Btn_Pagar)
                            .addComponent(txt_tanda, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_masTiquetes)
                            .addComponent(btn_menosTiquetes)
                            .addComponent(txt_cantidad_tiquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(txt_tanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(Btn_Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_peliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txt_CantidadSeleccionada))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E3ActionPerformed
        color(Btn_E3, 4, 2, "E3"); //Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E3ActionPerformed

    private void Btn_B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B4ActionPerformed
        color(Btn_B4, 1, 3, "B4");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B4ActionPerformed

    private void Btn_A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A2ActionPerformed
        color(Btn_A2, 0, 1, "A2");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A2ActionPerformed

    private void Btn_B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B6ActionPerformed
        color(Btn_B6, 1, 5, "B6");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B6ActionPerformed

    private void Btn_A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A5ActionPerformed
        color(Btn_A5, 0, 4, "A5");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A5ActionPerformed

    private void Btn_A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A8ActionPerformed
        color(Btn_A8, 0, 7, "A8");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A8ActionPerformed

    private void Btn_B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B9ActionPerformed
        color(Btn_B9, 1, 8, "B9");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B9ActionPerformed

    private void Btn_C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C12ActionPerformed
        color(Btn_C12, 2, 11, "C12");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C12ActionPerformed

    private void Btn_B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B12ActionPerformed
        color(Btn_B12, 1, 11, "B12");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B12ActionPerformed

    private void Btn_A11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A11ActionPerformed
        color(Btn_A11, 0, 10, "A11");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A11ActionPerformed

    private void Btn_B14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B14ActionPerformed
        color(Btn_B14, 1, 13, "B14");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B14ActionPerformed

    private void txt_tipo_tiqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipo_tiqueteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipo_tiqueteActionPerformed

    private void txt_correo_electronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correo_electronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correo_electronicoActionPerformed

    private void Btn_PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PagarActionPerformed
        // TODO add your handling code here:        
        
        //Se verifica que los espacios estén llenos
        boolean Infocorrecta = false;
        
        if (txt_nombre_completo.getText().equals("") || txt_cedula.getText().equals("") || txt_telefono.getText().equals("") || txt_correo_electronico.getText().equals(""))
        {
            Infocorrecta = false;
        }
        else{
            Infocorrecta = true;
        }
        
        //Se comprueba que la info esté toda completa y que se están seleccionando los tiquetes 
        if (CantidadTiquetes == CantidadTiquetesSeleccionados && Infocorrecta) {
            
            //Si todo está correcto, se llena el objeto
            reserva.setNombre_completo(txt_nombre_completo.getText());
            reserva.setCorreo_electronico(txt_correo_electronico.getText());
            reserva.setCedula(txt_cedula.getText());
            reserva.setTelefono(txt_telefono.getText());
            tipoTicket = txt_tipo_tiquete.getSelectedItem().toString();
            reserva.setTipo_tiquete(tipoTicket);
            reserva.setCantidad_tiquetes(txt_cantidad_tiquetes.getText());
            reserva.setPelicula(txt_peliculas.getText());
            reserva.setTanda(txt_tanda.getText());

            String[][] campos = new String[5][13];
            String capturaArray = " ";
            for (int i = 0; i <= campos.length - 1; i++) {
                for (int j = 0; j <= campos[i].length - 1; j++) {
                    if (reserva.getPosition(i, j) != null) {
                        capturaArray = capturaArray + reserva.getPosition(i, j) + " ";
                    }
                }
            }
            /*Nota importante al momento de guardar el objeto en el arrayList
        todas las pocisiones del reserva.setPosition estan almacenados en el array
        del objeto reserva, como null o como el String pasado por parmetro
        donde null seria unsinonimo de disponible.*/
            String tiquetes = "";

            //Crea una variable string en la que guarda todos los tiquetes (botones) seleccionados
            for (int i = 0; i < TiquetesSeleccionados.size(); i++) {
                tiquetes = tiquetes + TiquetesSeleccionados.get(i);
            }
            
            //////////////////////
            capturaArray = "";
            //Crea una variable string en la que guarda todos los asientos seleccionados para mostrarlo en el resumen
            for (int i = 0; i < AsientosSeleccionados.size(); i++) {
                capturaArray = capturaArray + " " + AsientosSeleccionados.get(i);
            }
            /////////////////////
            lista.add(reserva);

            int tickets = Integer.parseInt(reserva.getCantidad_tiquetes());
            int total = tickets * 2000;
            String totaltickets = Integer.toString(total);

            /*JOptionPane.showMessageDialog(rootPane,"\nResumen de solicitud:\n"
            +"Nombre:        "+reserva.getNombre_completo()+"\n"
            +"Correo:        "+reserva.getCorreo_electronico()+"\n"
            +"Cedula:        "+reserva.getCedula()+"\n"
            +"Telefono:      "+reserva.getTelefono()+"\n"
            +"Tipo tiquete:  "+reserva.getTipo_tiquete()+"\n"
            +"Total a pagar: "+totaltickets+"\n"
            +"Pelicula:      "+reserva.getPelicula());*/
            //Se crea un nuevo formulario y se llenan los valores en él.
            ResumenReservacion abrir = new ResumenReservacion();

            abrir.txt_nombre_completo.setText(txt_nombre_completo.getText());
            abrir.txt_correo_electronico.setText(txt_correo_electronico.getText());
            abrir.txt_cedula.setText(txt_cedula.getText());
            abrir.txt_telefono.setText(txt_telefono.getText());
            abrir.txt_tipo_tiquete.setText(tipoTicket);
            abrir.txt_pelicula.setText(reserva.getPelicula());
            abrir.txt_total.setText(totaltickets);
            abrir.txt_tanda.setText(txt_tanda.getText());
            abrir.txt_butacas.setText(capturaArray);
            abrir.tiquetes = tiquetes;

            
            abrir.setVisible(true);
            this.setVisible(false);

        } else {
           
            if (Infocorrecta) 
            {
                JOptionPane.showMessageDialog(this, "Debe seleccionar la cantidad de tiquetes ingresada");            
            }
            
            else
            {
                 JOptionPane.showMessageDialog(this, "Debe colocar toda su información.");
            }
           
            
        }
    }//GEN-LAST:event_Btn_PagarActionPerformed

    private void Btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AtrasActionPerformed
        // Regresa a principal
        principal abrir = new principal();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_AtrasActionPerformed

    private void Btn_A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A1ActionPerformed
        color(Btn_A1, 0, 0, "A1");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A1ActionPerformed

    private void Btn_B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B1ActionPerformed
        color(Btn_B1, 1, 0, "B1");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B1ActionPerformed

    private void Btn_C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C1ActionPerformed
        color(Btn_C1, 2, 0, "C1");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C1ActionPerformed

    private void Btn_D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D1ActionPerformed
        color(Btn_D1, 3, 0, "D1");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D1ActionPerformed

    private void Btn_E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E1ActionPerformed
        color(Btn_E1, 4, 0, "E1");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E1ActionPerformed

    private void Btn_E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E2ActionPerformed
        color(Btn_E2, 4, 1, "E2");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E2ActionPerformed

    private void Btn_D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D2ActionPerformed
        color(Btn_D2, 3, 1, "D2");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D2ActionPerformed

    private void Btn_C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C2ActionPerformed
        color(Btn_C2, 2, 1, "C2");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C2ActionPerformed

    private void Btn_B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B2ActionPerformed
        color(Btn_B2, 1, 1, "B2");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B2ActionPerformed

    private void Btn_A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A3ActionPerformed
        color(Btn_A3, 0, 2, "A3");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A3ActionPerformed

    private void Btn_B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B3ActionPerformed
        color(Btn_B3, 1, 2, "B3");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B3ActionPerformed

    private void Btn_C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C3ActionPerformed
        color(Btn_C3, 2, 2, "C3");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C3ActionPerformed

    private void Btn_D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D3ActionPerformed
        color(Btn_D3, 3, 2, "D3");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D3ActionPerformed

    private void Btn_E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E4ActionPerformed
        color(Btn_E4, 4, 3, "E4");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E4ActionPerformed

    private void Btn_D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D4ActionPerformed
        color(Btn_D4, 3, 3, "D4");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D4ActionPerformed

    private void Btn_C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C4ActionPerformed
        color(Btn_C4, 2, 3, "C4");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C4ActionPerformed

    private void Btn_A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A4ActionPerformed
        color(Btn_A4, 0, 3, "A4");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A4ActionPerformed

    private void Btn_A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A6ActionPerformed
        color(Btn_A6, 0, 5, "A6");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A6ActionPerformed

    private void Btn_A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A7ActionPerformed
        color(Btn_A7, 0, 6, "A7");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A7ActionPerformed

    private void Btn_A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A9ActionPerformed
        color(Btn_A9, 0, 8, "A9");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A9ActionPerformed

    private void Btn_A10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A10ActionPerformed
        color(Btn_A10, 0, 9, "A10");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A10ActionPerformed

    private void Btn_A12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A12ActionPerformed
        color(Btn_A12, 0, 11, "A12");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A12ActionPerformed

    private void Btn_A13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A13ActionPerformed
        color(Btn_A13, 0, 12, "A13");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A13ActionPerformed

    private void Btn_A14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A14ActionPerformed
        color(Btn_A14, 0, 13, "A14");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_A14ActionPerformed

    private void Btn_B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B5ActionPerformed
        color(Btn_B5, 1, 4, "B5");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B5ActionPerformed

    private void Btn_B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B7ActionPerformed
        color(Btn_B7, 1, 6, "B7");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B7ActionPerformed

    private void Btn_C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C7ActionPerformed
        color(Btn_C7, 2, 6, "C7");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C7ActionPerformed

    private void Btn_B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B8ActionPerformed
        color(Btn_B8, 1, 7, "B8");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B8ActionPerformed

    private void Btn_C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C8ActionPerformed
        color(Btn_C8, 2, 7, "C8");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C8ActionPerformed

    private void Btn_B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B10ActionPerformed
        color(Btn_B10, 1, 9, "B10");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B10ActionPerformed

    private void Btn_B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B11ActionPerformed
        color(Btn_B11, 1, 10, "B11");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B11ActionPerformed

    private void Btn_B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B13ActionPerformed
        color(Btn_B13, 1, 12, "B13");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_B13ActionPerformed

    private void Btn_C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C5ActionPerformed
        color(Btn_C5, 2, 4, "C5");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C5ActionPerformed

    private void Btn_C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C6ActionPerformed
        color(Btn_C6, 2, 5, "C6");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C6ActionPerformed

    private void Btn_C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C9ActionPerformed
        color(Btn_C9, 2, 8, "C9");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C9ActionPerformed

    private void Btn_C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C10ActionPerformed
        color(Btn_C10, 2, 9, "C10");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C10ActionPerformed

    private void Btn_C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C11ActionPerformed
        color(Btn_C11, 2, 10, "C11");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C11ActionPerformed

    private void Btn_C13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C13ActionPerformed
        color(Btn_C13, 2, 12, "C13");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C13ActionPerformed

    private void Btn_C14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C14ActionPerformed
        color(Btn_C14, 2, 13, "C14");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_C14ActionPerformed

    private void Btn_D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D5ActionPerformed
        color(Btn_D5, 3, 4, "D5");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D5ActionPerformed

    private void Btn_D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D6ActionPerformed
        color(Btn_D6, 3, 5, "D6");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D6ActionPerformed

    private void Btn_D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D7ActionPerformed
        color(Btn_D7, 3, 6, "D7");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D7ActionPerformed

    private void Btn_D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D8ActionPerformed
        color(Btn_D8, 3, 7, "D8");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D8ActionPerformed

    private void Btn_D9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D9ActionPerformed
        color(Btn_D9, 3, 8, "D9");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D9ActionPerformed

    private void Btn_D10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D10ActionPerformed
        color(Btn_D10, 3, 9, "D10");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D10ActionPerformed

    private void Btn_D11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D11ActionPerformed
        color(Btn_D11, 3, 10, "D11");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D11ActionPerformed

    private void Btn_D12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D12ActionPerformed
        color(Btn_D12, 3, 11, "D12");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D12ActionPerformed

    private void Btn_D13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D13ActionPerformed
        color(Btn_D13, 3, 12, "D13");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D13ActionPerformed

    private void Btn_D14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D14ActionPerformed
        color(Btn_D14, 3, 13, "D14");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_D14ActionPerformed

    private void Btn_E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E5ActionPerformed
        color(Btn_E5, 4, 4, "E5");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E5ActionPerformed

    private void Btn_E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E6ActionPerformed
        color(Btn_E6, 4, 5, "E6");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E6ActionPerformed

    private void Btn_E7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E7ActionPerformed
        color(Btn_E7, 4, 6, "E7");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E7ActionPerformed

    private void Btn_E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E8ActionPerformed
        color(Btn_E8, 4, 7, "E8");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E8ActionPerformed

    private void Btn_E9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E9ActionPerformed
        color(Btn_E9, 4, 8, "E9");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E9ActionPerformed

    private void Btn_E10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E10ActionPerformed
        color(Btn_E10, 4, 9, "E10");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E10ActionPerformed

    private void Btn_E11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E11ActionPerformed
        color(Btn_E11, 4, 10, "E11");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E11ActionPerformed

    private void Btn_E12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E12ActionPerformed
        color(Btn_E12, 4, 11, "E12");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E12ActionPerformed

    private void Btn_E13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E13ActionPerformed
        color(Btn_E13, 4, 12, "E13");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E13ActionPerformed

    private void Btn_E14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E14ActionPerformed
        color(Btn_E14, 4, 13, "E14");//Llama al metodo color que recive un boton, int, int, String
    }//GEN-LAST:event_Btn_E14ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // regresa a principal
        principal princ = new principal();
        princ.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btn_menosTiquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosTiquetesActionPerformed
        // Metodo para restar tiquetes
        CantidadTiquetes--;
        if (CantidadTiquetes < 1) {
            CantidadTiquetes = 1;
        }
        txt_cantidad_tiquetes.setText(CantidadTiquetes + "");
    }//GEN-LAST:event_btn_menosTiquetesActionPerformed

    private void btn_masTiquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masTiquetesActionPerformed
        // // Metodo para sumar tiquetes
        CantidadTiquetes++;
        txt_cantidad_tiquetes.setText(CantidadTiquetes + "");
    }//GEN-LAST:event_btn_masTiquetesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Aqui debe ejecutarse el metodo DesactivaBoton
        //************************************* se agrega codigo para leer el archivo y obtener asientos y pelicula ************
        //Lectura del archivo para buscar la pelicula, tanda y asientos.
        
        PeliculaYaReservada = txt_peliculas.getText();
        TandaYaReservada = txt_tanda.getText();

        String linea;
        FileReader f = null;
        try {
            f = new FileReader("Informacion de Compra.txt");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(administrador.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader b = new BufferedReader(f);
        try {
            
            //Se leen todas las lineas del archivo
            while ((linea = b.readLine()) != null) {

                //Se dividen cada linea en un arreglo separado por ;
                String DatosCompra[] = linea.split(";");

                //Cuando se encuentren las coincidencias tanto de pelicula como de la tanda, se extraen esos datos en un string.
                if (((DatosCompra[12]).equals(PeliculaYaReservada)) && (DatosCompra[13].equals(TandaYaReservada))) {
                    TiquetesYaReservados = (DatosCompra[14]) + "," + TiquetesYaReservados;
                    //Se extrae el archivo con comma de separador

                }

            }
        } catch (IOException ex) {
            Logger.getLogger(seleccionCampos.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        //************************************************************************************************************************
        DesactBoton(Btn_A1);DesactBoton(Btn_A2);DesactBoton(Btn_A3);DesactBoton(Btn_A4);DesactBoton(Btn_A5);
        DesactBoton(Btn_A6);DesactBoton(Btn_A7);DesactBoton(Btn_A8);DesactBoton(Btn_A9);DesactBoton(Btn_A10);
        DesactBoton(Btn_A11);DesactBoton(Btn_A12);DesactBoton(Btn_A13);DesactBoton(Btn_A14);
        DesactBoton(Btn_B1);DesactBoton(Btn_B2);DesactBoton(Btn_B3);DesactBoton(Btn_B4);DesactBoton(Btn_B5);
        DesactBoton(Btn_B6); DesactBoton(Btn_B7);DesactBoton(Btn_B8);DesactBoton(Btn_B9);DesactBoton(Btn_B10);
        DesactBoton(Btn_B11);DesactBoton(Btn_B12);DesactBoton(Btn_B13);DesactBoton(Btn_B14);
        DesactBoton(Btn_C1);DesactBoton(Btn_C2);DesactBoton(Btn_C3);DesactBoton(Btn_C4);DesactBoton(Btn_C5);
        DesactBoton(Btn_C6);DesactBoton(Btn_C7);DesactBoton(Btn_C8);DesactBoton(Btn_C9);DesactBoton(Btn_C10);
        DesactBoton(Btn_C11);DesactBoton(Btn_C12);DesactBoton(Btn_C13);DesactBoton(Btn_C14);
        DesactBoton(Btn_D1);DesactBoton(Btn_D2);DesactBoton(Btn_D3);DesactBoton(Btn_D4);DesactBoton(Btn_D5);
        DesactBoton(Btn_D6);DesactBoton(Btn_D7);DesactBoton(Btn_D8);DesactBoton(Btn_D9);DesactBoton(Btn_D10);
        DesactBoton(Btn_D11);DesactBoton(Btn_D12);DesactBoton(Btn_D13);DesactBoton(Btn_D14);
        DesactBoton(Btn_E1);DesactBoton(Btn_E2);DesactBoton(Btn_E3);DesactBoton(Btn_E4);DesactBoton(Btn_E5);
        DesactBoton(Btn_E6);DesactBoton(Btn_E7);DesactBoton(Btn_E8);DesactBoton(Btn_E9);DesactBoton(Btn_E10);
        DesactBoton(Btn_E11);DesactBoton(Btn_E12);DesactBoton(Btn_E13);DesactBoton(Btn_E14);
    }//GEN-LAST:event_formWindowOpened


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
            java.util.logging.Logger.getLogger(seleccionCampos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seleccionCampos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seleccionCampos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seleccionCampos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seleccionCampos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_A1;
    private javax.swing.JButton Btn_A10;
    private javax.swing.JButton Btn_A11;
    private javax.swing.JButton Btn_A12;
    private javax.swing.JButton Btn_A13;
    private javax.swing.JButton Btn_A14;
    private javax.swing.JButton Btn_A2;
    private javax.swing.JButton Btn_A3;
    private javax.swing.JButton Btn_A4;
    private javax.swing.JButton Btn_A5;
    private javax.swing.JButton Btn_A6;
    private javax.swing.JButton Btn_A7;
    private javax.swing.JButton Btn_A8;
    private javax.swing.JButton Btn_A9;
    private javax.swing.JButton Btn_Atras;
    private javax.swing.JButton Btn_B1;
    private javax.swing.JButton Btn_B10;
    private javax.swing.JButton Btn_B11;
    private javax.swing.JButton Btn_B12;
    private javax.swing.JButton Btn_B13;
    private javax.swing.JButton Btn_B14;
    private javax.swing.JButton Btn_B2;
    private javax.swing.JButton Btn_B3;
    private javax.swing.JButton Btn_B4;
    private javax.swing.JButton Btn_B5;
    private javax.swing.JButton Btn_B6;
    private javax.swing.JButton Btn_B7;
    private javax.swing.JButton Btn_B8;
    private javax.swing.JButton Btn_B9;
    private javax.swing.JButton Btn_C1;
    private javax.swing.JButton Btn_C10;
    private javax.swing.JButton Btn_C11;
    private javax.swing.JButton Btn_C12;
    private javax.swing.JButton Btn_C13;
    private javax.swing.JButton Btn_C14;
    private javax.swing.JButton Btn_C2;
    private javax.swing.JButton Btn_C3;
    private javax.swing.JButton Btn_C4;
    private javax.swing.JButton Btn_C5;
    private javax.swing.JButton Btn_C6;
    private javax.swing.JButton Btn_C7;
    private javax.swing.JButton Btn_C8;
    private javax.swing.JButton Btn_C9;
    private javax.swing.JButton Btn_D1;
    private javax.swing.JButton Btn_D10;
    private javax.swing.JButton Btn_D11;
    private javax.swing.JButton Btn_D12;
    private javax.swing.JButton Btn_D13;
    private javax.swing.JButton Btn_D14;
    private javax.swing.JButton Btn_D2;
    private javax.swing.JButton Btn_D3;
    private javax.swing.JButton Btn_D4;
    private javax.swing.JButton Btn_D5;
    private javax.swing.JButton Btn_D6;
    private javax.swing.JButton Btn_D7;
    private javax.swing.JButton Btn_D8;
    private javax.swing.JButton Btn_D9;
    private javax.swing.JButton Btn_E1;
    private javax.swing.JButton Btn_E10;
    private javax.swing.JButton Btn_E11;
    private javax.swing.JButton Btn_E12;
    private javax.swing.JButton Btn_E13;
    private javax.swing.JButton Btn_E14;
    private javax.swing.JButton Btn_E2;
    private javax.swing.JButton Btn_E3;
    private javax.swing.JButton Btn_E4;
    private javax.swing.JButton Btn_E5;
    private javax.swing.JButton Btn_E6;
    private javax.swing.JButton Btn_E7;
    private javax.swing.JButton Btn_E8;
    private javax.swing.JButton Btn_E9;
    private javax.swing.JButton Btn_Pagar;
    private javax.swing.JButton btn_masTiquetes;
    private javax.swing.JButton btn_menosTiquetes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_CantidadSeleccionada;
    private javax.swing.JTextField txt_cantidad_tiquetes;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_correo_electronico;
    private javax.swing.JTextField txt_nombre_completo;
    public static javax.swing.JTextField txt_peliculas;
    public static javax.swing.JTextField txt_tanda;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JComboBox<String> txt_tipo_tiquete;
    // End of variables declaration//GEN-END:variables
}
