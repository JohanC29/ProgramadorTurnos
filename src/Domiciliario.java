import java.util.ArrayList;

public class Domiciliario extends Personal {

    private ArrayList<Pedido> listPedido;

    public Domiciliario(int id, String nombre, int edad, Vehiculo vehiculo) {
        super(id, nombre,edad,vehiculo);
    }

    @Override
    public String getTipo(){return "Domiciliario";}

    public ArrayList<Pedido> getListPedido() {
        return listPedido;
    }

    public void setListPedido(ArrayList<Pedido> listPedido) {
        this.listPedido = listPedido;
    }
}
