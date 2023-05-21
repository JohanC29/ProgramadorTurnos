import java.util.ArrayList;

public abstract class Mensajero extends Personal {
    private ArrayList<Paquete> listPaquete;

    public Mensajero(int id, String nombre, int edad, IVehiculo iVehiculo) {
        super(id, nombre, edad, iVehiculo);
    }

    @Override
    public String getTipo() {
        return "Mensajero";
    }

    public ArrayList<Paquete> getListPaquete() {
        return listPaquete;
    }

    public void setListPaquete(ArrayList<Paquete> listPaquete) {
        this.listPaquete = listPaquete;
    }

    @Override
    void imprimirTipoVehiculo() {
        System.out.println(super.getiVehiculo().getTipoVehiculo());
    }




}
