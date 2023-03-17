import java.util.ArrayList;

public class Mensajero extends Personal{
    private ArrayList<Paquete> listPaquete;
    public Mensajero(int id, String nombre, int edad, Vehiculo vehiculo) {
        super(id,nombre,edad,vehiculo);
    }

    @Override
    public String getTipo(){return "Mensajero";}

    public ArrayList<Paquete> getListPaquete() {
        return listPaquete;
    }

    public void setListPaquete(ArrayList<Paquete> listPaquete) {
        this.listPaquete = listPaquete;
    }
}
