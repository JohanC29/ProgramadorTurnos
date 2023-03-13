//import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
//import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        String vaAux;
        int nuAux;
        boolean boAux;
        boolean ingresarNuevoTurno;

        String formatoFecha = "dd-MM-yyyy";

        // Se crea una lista con los turnos ingresados
        ArrayList<Turno> turnos = new ArrayList<>();
        ArrayList<Personal> listaPersonal = new ArrayList<>();
        Utilidades utilidades = new Utilidades();
        SimpleDateFormat dateFormater = new SimpleDateFormat(formatoFecha);

        // Carga de datos aleatorios
        int cantPersonal = 10;
        int cantTurnos = 5;

        Carga carga = new Carga(cantPersonal,cantTurnos);
        turnos = carga.getTurnos();
        listaPersonal = carga.getListaPersonal();


        do {

            // Validamos cuales son los turnos programados
            vaAux = "Turnos programados:";
            for (Turno turno:
                 turnos) {
                vaAux+="\n"+dateFormater.format(turno.getFechaTurno())+"-"+turno.getEmpresa().getNombre();
            }


            ingresarNuevoTurno = false;
            // Control de fechas parceadas
            boolean intentoFecha;
            Date fechaTurno = null;
            String fecha = "";
            do {
                intentoFecha = false;

                // Solicitamos la fecha del turno a ingresar
                fecha = JOptionPane.showInputDialog(vaAux+"\n"+
                        "Ingrese la fecha para el turno a programar en formato [" + formatoFecha + "]: ");

                try {
                    // Parseo de la fecha
                    fechaTurno = dateFormater.parse(fecha);
                } catch (ParseException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,
                            "No es posible encontrar la fecha ingresada. Valide el formato de la fecha [" + formatoFecha
                                    + "]");
                    intentoFecha = true;
                }

            } while (intentoFecha);
            Turno miTurno = null;

            // Validamos si el turno con la fecha ingresada exite.
            if (!turnos.isEmpty()) {
                // recorremos el arrayList con las fechas hasta encontrar una fecha igual
                for (int i = 0; i < turnos.size(); i++) {
                    if (fechaTurno.equals(turnos.get(i).getFechaTurno())) {
                        // De encontrar coincidencias, finalizamos el ciclo.
                        miTurno = turnos.get(i);
                        miTurno.setId(i);
                        break;
                    }
                }
            }

            // Validamos si encontramos un turno programado para ese dia. De no encontrarlo,
            // vamos a crear el objeto
            if (miTurno == null) {
                miTurno = new Turno();
                // Seteamos el -1 indicando que no tiene posicion en el Array List
                miTurno.setId(-1);
                miTurno.setFechaTurno(fechaTurno);
            }

            // Asignamos la empresa que requiere los trabajadores
            if (miTurno.getEmpresa() == null) {
                // Se debe de crear la empresa para el turno
                vaAux = JOptionPane.showInputDialog("Ingrese el nombre de la empresa que desea agendar el turno");
                nuAux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personal requierido:"));
                // Se setea la clase recien creada
                miTurno.setEmpresa(new Empresa(vaAux, nuAux));
            }

            // Validamos la asignacion de personal al turno
            if (miTurno.getListPersonal() == null) {
                // Imprimiendo
                miTurno.setListPersonal(new ArrayList<Personal>());
            }

            boolean boRepetirMenu;
            do {
                boRepetirMenu = true;

                vaAux = "Fecha Turno: " + fecha + "\n" +
                        "Nombre Empresa: " + miTurno.getEmpresa().getNombre() + "\n" +
                        "Cantidad Personal Requerido: " + miTurno.getEmpresa().getCantidadPersonalRequerida() + "\n" +
                        "Cantidad Personal Asignado: " + miTurno.getListPersonal().size() + "\n\n" +
                        "Por Favor digite una de las siguientes opciones: \n1.Asignar Personal.\n2.Quitar Personal.\n3.Ver Personal. \n4.Salir Menu";

                int menuOpciones = Integer.parseInt(JOptionPane.showInputDialog(vaAux));

                switch (menuOpciones) {
                    case 1:

                        do {

                            // Validamos la lista de las personas disponbles para el turno

                            // Si no exiten personas creadas, no hay ninguna persona disponible
                            if (listaPersonal.isEmpty()) {
                                // Agregar persona
                                listaPersonal.add(utilidades.createPersona());
                            }

                            // Mostramos el listado de las personas diponibles para el turno

                            // Recorremos la lista de personas y validamos que no esten asigandas al turno
                            // seleccionado
                            ArrayList<Personal> personalDisponible = new ArrayList<>();
                            for (Personal personal : listaPersonal) {
                                Boolean exiteEnTurno = false;
                                for (Personal personalMiTurno : miTurno.getListPersonal()) {
                                    if (personalMiTurno.getId() == personal.getId()) {
                                        exiteEnTurno = true;
                                    }
                                }

                                // Si el empleado exite en turno, no se encuentra disponible
                                if (!exiteEnTurno) {
                                    personalDisponible.add(personal);
                                }
                            }

                            // Mostramos las personas disponibles para que se puedan asignar
                            vaAux = "Personal Disponible:\n0-Crear Nuevo Empleado";
                            for (int i = 0; i < personalDisponible.size(); i++) {
                                vaAux += "\n" + (i + 1) + "-" + personalDisponible.get(i).getNombre() + "[" + personalDisponible.get(i).getTipo() + "]";
                            }
                            nuAux = utilidades.inputNumber(vaAux);

                            // Validamos si se requiere crear el personal o se asigna al turno
                            if (nuAux == 0) {
                                // Agregar persona
                                listaPersonal.add(utilidades.createPersonaValidate(listaPersonal));
                                boAux = true;
                            } else {
                                // Asignamos al turno la persona seleccionada
                                miTurno.getListPersonal().add(personalDisponible.get(nuAux - 1));
                                boAux = ("SI".equals(utilidades.inputSelect("¿Desea asignar otro colaborador?", new String[]{"SI", "NO"}))) ? true : false;
                            }

                        } while (boAux);
                        break;
                    case 2:
                        // Quitar Personal del turno
                        do {

                            // Mostramos las personas asignadas al turno
                            vaAux = "Personal Asignado:\n0.Volver al Menu";
                            for (int i = 0; i < miTurno.getListPersonal().size(); i++) {
                                vaAux += "\n" + (i + 1) + "-" + miTurno.getListPersonal().get(i).getNombre() + "[" + miTurno.getListPersonal().get(i).getTipo() + "]";
                            }

                            nuAux = utilidades.inputNumber(vaAux);

                            // Validamos si se requiere crear el personal o se asigna al turno
                            if (nuAux != 0) {
                                // Removamos el elemento de la lista
                                miTurno.getListPersonal().remove((nuAux - 1));
                            }

                        } while (nuAux!=0);
                        break;
                    case 3:
                        vaAux="Fecha Turno: "+fecha+"\nEmpresa: "+miTurno.getEmpresa().getNombre()+"\nColaboradores:";
                        for (Personal personal :
                                miTurno.getListPersonal()) {
                            vaAux+="\n"+personal.getNombre()+"-"+personal.getTipo();
                        }
                        JOptionPane.showMessageDialog(null,vaAux);
                        break;
                    case 4:
                        boRepetirMenu = false;
                        break;

                    default:
                        boRepetirMenu = false;
                        break;
                }
            } while (boRepetirMenu);

            ingresarNuevoTurno = ("SI".equals(utilidades.inputSelect("¿Desea Agregar otro turno?", new String[]{"SI", "NO"}))) ? true : false;

            // Asignamos el turno a la lista
            if (miTurno.getId() == -1) {
                // Agregamos el nuevo turno
                turnos.add(miTurno);
            } else {
                // Remplazamos el objeto del array list
                turnos.set(miTurno.getId(), miTurno);
            }
        } while (ingresarNuevoTurno);


        // Imprimimos el turno correspondiente con sus respectivos colaboradores

        for (Turno turno:
             turnos) {
            vaAux = "\nFecha: "+turno.getFechaTurno().toString();
            vaAux += "\nEmpresa: "+turno.getEmpresa().getNombre();
            vaAux += "\nCantidad Personal Requerido: "+turno.getEmpresa().getCantidadPersonalRequerida();
            vaAux += "\nCantidad Personal Asignado: "+turno.getListPersonal().size();
            vaAux += "\nColaboradores Asignados: ";
            for (int i = 0; i < turno.getListPersonal().size(); i++) {
                vaAux+="\n"+(i+1)+" - "+turno.getListPersonal().get(i).getNombre()+" - "+turno.getListPersonal().get(i).getTipo()+" - "+turno.getListPersonal().get(i).getVehiculo().getTipoVehiculo();
            }
            if (turno.getListPersonal().size()==0){
                vaAux+="\n"+"No existe personal asignado";
            }

            System.out.println(vaAux);
            System.out.println("============================================================");
        }
        JOptionPane.showMessageDialog(null,"Se imprime la lista de turnos asignados.\nMuchas Gracias");

    }
}