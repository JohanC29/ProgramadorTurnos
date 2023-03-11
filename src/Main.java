import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        String vaAux;
        int nuAux;

        String formatoFecha = "dd-MM-yyyy";

        // Se crea una lista con los turnos ingresados
        ArrayList<Turno> turnos = new ArrayList<>();
        boolean ingresarNuevoTurno;
        do {
            ingresarNuevoTurno = false;

            // Control de fechas parceadas
            boolean intentoFecha;
            Date fechaTurno = null;
            String fecha = "";
            do {
                intentoFecha = false;

                // Solicitamos la fecha del turno a ingresar
                fecha = JOptionPane.showInputDialog("Ingrese la fecha para el turno a programar en formato [" + formatoFecha + "]: ");
                SimpleDateFormat dateFormater = new SimpleDateFormat(formatoFecha);

                try {
                    //Parseo de la fecha
                    fechaTurno = dateFormater.parse(fecha);
                } catch (ParseException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "No es posible encontrar la fecha ingresada. Valide el formato de la fecha [" + formatoFecha + "]");
                    intentoFecha = true;
                }

            } while (intentoFecha);
            Turno miTurno = null;
            // Validamos si el turno con la fecha ingresada exite.
            if(!turnos.isEmpty()){
                // recorremos el arrayList con las fechas hasta encontrar una fecha igual
                for (Turno turno:
                     turnos) {
                    if(fechaTurno==turno.getFechaTurno()){
                        // De encontrar coincidencias, finalizamos el ciclo.
                        miTurno = turno;
                        break;
                    }
                }
            }

            // Validamos si encontramos un turno programado para ese dia. De no encontrarlo, vamos a crear el objeto
            if(miTurno==null){
                miTurno = new Turno();
            }

            // Asignamos la empresa que requiere los trabajadores
            Empresa miEmpresa = miTurno.getEmpresa();
            if(miEmpresa==null){
                // Se debe de crear la empresa para el turno
                vaAux = JOptionPane.showInputDialog("Ingrese el nombre de la empresa que desea agendar el turno");
                nuAux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personal requierido:"));
                miEmpresa = new Empresa(vaAux,nuAux);
            }

            vaAux = "Fecha Turno: "+fecha+"\n"+
                    "Nombre Empresa: "+miTurno.getEmpresa().getNombre()+"\n"+
                    "Cantidad Personal Asignado: "+miTurno.getListPersonal().size()+"\n"+
                    "Por Favor digite una de las siguientes opciones: \n1.Asignar Personal.\n2.Quitar Personal.\n3.Ver Personal"
            ;
            int menuOpciones = Integer.parseInt(JOptionPane.showInputDialog(vaAux));

            // Con la cantidad de trabajadores requeridos. Creamos el personal
            for (int i = 0; i < miEmpresa.getCantidadPersonalRequerida(); i++) {

            }


            int nuNuevoTurno = Integer.parseInt(JOptionPane.showInputDialog("¿Desea Agregar otro turno? 1.Si\n2.No\n(otro - No)"));
            ingresarNuevoTurno = nuNuevoTurno == 1 ? true : false;
        } while (ingresarNuevoTurno);


    }
}