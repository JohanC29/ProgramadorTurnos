abstract class Personal {

    private int id;
    private String nombre;
    private int edad;
    private IVehiculo iVehiculo;

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

    abstract String getTipo();

    abstract void imprimirTipoVehiculo();

}
