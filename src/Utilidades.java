import javax.swing.JOptionPane;

public class Utilidades {
    public Personal createPersona(){

        // Solicitamos los datos de la persona
        int id = this.inputNumber("Por Favor ingrese el id del colaborador:");
        String nombre = JOptionPane.showInputDialog("Por Favor ingrese el nombre de la persona");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la edad de la persona"));
        int tipoPersona = this.inputNumber("Por favor ingrese el tipo de personal: \n1.Domiciliario\n2.Mensajero");
        
        // Solicitamos los datos del vehiculo
        String placa = JOptionPane.showInputDialog("Por Favor ingrese la placa de la persona "+nombre);
        String tipoVehiculo = this.inputSelect("Por Favor ingrese el tipo de vehiculo de la persona "+nombre+":", new String[] {"Moto","Carro"});

        Personal personal;
        if(tipoPersona==1){
            personal = new Domiciliario(id,nombre,edad,new Vehiculo(placa,tipoVehiculo));
        }else{
            personal = new Mensajero(id, nombre,edad,new Vehiculo(placa,tipoVehiculo));
        }
        
        return personal;
    }


    public int inputNumber(String ivaAux){
        int resultado;    
        resultado = Integer.parseInt(JOptionPane.showInputDialog(ivaAux));
        return resultado;
    }

    public String inputSelect(String message, String[] listOption){

        // Armamos el mensaje de acuerdo a la lista de opciones
        for (int i = 0; i < listOption.length; i++) {
            message += "\n"+(i+1)+"-"+listOption[i];   
        }

        // Solicitamos al usuario que ingrese el valor
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(message));
        
        // Retornamos la opcion seleccionada
        return listOption[(opcion-1)];
    }
}
