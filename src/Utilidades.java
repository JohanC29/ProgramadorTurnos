import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Utilidades {
    public Personal createPersona() {

        // Solicitamos los datos de la persona
        int id = this.inputNumber("Por Favor ingrese el id del colaborador:");
        return this.createPersonaById(id);
    }

    public Personal createPersonaById(int id) {

        String nombre = JOptionPane.showInputDialog("Por Favor ingrese el nombre de la persona");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la edad de la persona"));
        int tipoPersona = this.inputNumber("Por favor ingrese el tipo de personal: \n1.Domiciliario\n2.Mensajero");

        // Solicitamos los datos del vehiculo
        String placa = JOptionPane.showInputDialog("Por Favor ingrese la placa de la persona " + nombre);
        String tipoVehiculo = this.inputSelect("Por Favor ingrese el tipo de vehiculo de la persona " + nombre + ":", new String[]{"Moto", "Carro"});
        String modelo = JOptionPane.showInputDialog("Por Favor ingrese el modelo del vehiculo de la persona " + nombre);
        String marca = JOptionPane.showInputDialog("Por Favor ingrese la marca del vehiculo de la persona " + nombre);

        IVehiculo iVehiculo;
        if ("Moto".equals(tipoVehiculo)) {
            iVehiculo = new Motocicleta(placa, modelo, marca);
        } else {
            iVehiculo = new Automovil(placa, modelo, marca);
        }

        Personal personal;
        int tipoPersona2 = 0;
        if (tipoPersona == 1) {
            tipoPersona2 = this.inputNumber("Por favor ingrese el tipo de personal: \n1.Domiciliario Tiempo Completo\n2.Domiciliario Medio Tiempo");

            if (tipoPersona2 == 1) {
                personal = new DomiciliarioTiempoCompleto(id, nombre, edad, iVehiculo);
            } else {
                personal = new DomiciliarioMedioTiempo(id, nombre, edad, iVehiculo);
            }
        } else {

            tipoPersona2 = this.inputNumber("Por favor ingrese el tipo de personal: \n1.Mensajero Tiempo Completo\n2.Mensajero Medio Tiempo");
            if (tipoPersona2 == 1) {
                personal = new MensajeroTiempoCompleto(id, nombre, edad, iVehiculo);
            } else {
                personal = new MensajeroMedioTiempo(id, nombre, edad, iVehiculo);
            }
        }
        return personal;
    }

    public Personal createPersonaValidate(ArrayList<Personal> listPersonal) {
        int id = 0;
        boolean exitePersonal = false;
        do {
            // Solicitamos los datos de la persona
            id = this.inputNumber("Por Favor ingrese el id del colaborador:");

            // Validamos si la personal existe en la lista ingresada
            for (Personal personal :
                    listPersonal) {
                if (personal.getId() == id) {
                    exitePersonal = true;
                    break;
                }
            }
        } while (exitePersonal);
        return this.createPersonaById(id);
    }


    public int inputNumber(String ivaAux) {
        int resultado = Integer.parseInt(JOptionPane.showInputDialog(ivaAux));
        return resultado;
    }

    public String inputSelect(String message, String[] listOption) {

        // Armamos el mensaje de acuerdo a la lista de opciones
        for (int i = 0; i < listOption.length; i++) {
            message += "\n" + (i + 1) + "-" + listOption[i];
        }

        // Solicitamos al usuario que ingrese el valor
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(message));

        // Retornamos la opcion seleccionada
        return listOption[(opcion - 1)];
    }

    public void procesarHorasTrabajadas(ArrayList<Personal> listPersonal, ArrayList<Turno> listTurno) {
        int horasDia = 8;

        // Recorremos la lista de turnos
        for (Turno turno :
                listTurno) {
            // Buscamos cada uno del personal para llenarle las horas trabajadas
            for (Personal personalTurno :
                    turno.getListPersonal()) {
                for (int i = 0; i < listPersonal.size(); i++) {
//                    System.out.println("listPersonal.get(i).getId() -" + listPersonal.get(i).getId());
                    // Validamos que la persona y sumamos las horas del dia
                    if (personalTurno.getId() == listPersonal.get(i).getId()) {
                        // validamos si el arraylist de horas tiene datos
                        listPersonal.get(i).getListHora().add(horasDia);
//                        System.out.println("Encontrado. " + personalTurno.getId());
                    }

                }

            }
        }
    }


    public static void bannerPago(){
        System.out.println("\n" +
                " _   _                 _             \n" +
                "| \\ | |               (_)            \n" +
                "|  \\| | ___  _ __ ___  _ _ __   __ _ \n" +
                "| . ` |/ _ \\| '_ ` _ \\| | '_ \\ / _` |\n" +
                "| |\\  | (_) | | | | | | | | | | (_| |\n" +
                "\\_| \\_/\\___/|_| |_| |_|_|_| |_|\\__,_|\n" +
                "                                     \n" +
                "                                     \n");
    }

    public  static void bannerTurnos(){
        System.out.println("______                                               _             \n" +
                "| ___ \\                                             (_)            \n" +
                "| |_/ / __ ___   __ _ _ __ __ _ _ __ ___   __ _  ___ _  ___  _ __  \n" +
                "|  __/ '__/ _ \\ / _` | '__/ _` | '_ ` _ \\ / _` |/ __| |/ _ \\| '_ \\ \n" +
                "| |  | | | (_) | (_| | | | (_| | | | | | | (_| | (__| | (_) | | | |\n" +
                "\\_|  |_|  \\___/ \\__, |_|  \\__,_|_| |_| |_|\\__,_|\\___|_|\\___/|_| |_|\n" +
                "                 __/ |                                             \n" +
                "                |___/                                              ");
    }

}
