import java.util.ArrayList;

abstract class Personal {

    private int id;
    private String nombre;
    private int edad;
    private IVehiculo iVehiculo;

    private ArrayList<Integer> listHora;

    public Personal() {

    }

    public Personal(int id, String nombre, int edad, IVehiculo vehiculo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.iVehiculo = vehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public IVehiculo getiVehiculo() {
        return iVehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.iVehiculo = vehiculo;
    }

    public ArrayList<Integer> getListHora() {
        return listHora;
    }

    public void setListHora(ArrayList<Integer> listHora) {
        this.listHora = listHora;
    }

    abstract String getTipo();

    abstract void imprimirTipoVehiculo();

    abstract Double accept(Visitor visitor);

}
