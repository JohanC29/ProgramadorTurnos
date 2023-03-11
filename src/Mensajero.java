public class Mensajero extends Personal{

    public Mensajero(int id, String nombre, int edad, Vehiculo vehiculo) {
        super(id,nombre,edad,vehiculo);
    }

    @Override
    public String getTipo(){return "Mensajero";}
}
