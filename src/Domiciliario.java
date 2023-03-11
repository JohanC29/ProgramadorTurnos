public class Domiciliario extends Personal {

    public Domiciliario(int id, String nombre, int edad, Vehiculo vehiculo) {
        super(id, nombre,edad,vehiculo);
    }

    @Override
    public String getTipo(){return "Domiciliario";}

}
