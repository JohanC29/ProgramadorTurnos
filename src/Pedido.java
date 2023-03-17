import java.util.ArrayList;

public class Pedido {
    private int id;
    private String direccion;
    private ArrayList<Producto> listProducto;

    public Pedido() {
    }

    public Pedido(int id, String direccion, ArrayList<Producto> listProducto) {
        this.id = id;
        this.direccion = direccion;
        this.listProducto = listProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }
}
