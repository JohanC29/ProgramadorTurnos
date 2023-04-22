import java.util.ArrayList;

public class Domiciliario extends Personal {

    private ArrayList<Pedido> listPedido;

    public Domiciliario(int id, String nombre, int edad, IVehiculo iVehiculo) {
        super(id, nombre,edad,iVehiculo);
    }

    @Override
    public String getTipo(){return "Domiciliario";}

    @Override
    void imprimirTipoVehiculo() {
        System.out.println(super.getiVehiculo().getTipoVehiculo());
    }

    public ArrayList<Pedido> getListPedido() {
        return listPedido;
    }

    public void setListPedido(ArrayList<Pedido> listPedido) {
        this.listPedido = listPedido;
    }

}
