abstract class Personal {

    private int id;
    private String nombre;
    private int edad;
    private Vehiculo vehiculo;

    public Personal() {

    }

    public Personal(int id, String nombre, int edad, Vehiculo vehiculo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.vehiculo = vehiculo;
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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    abstract String getTipo();

}
