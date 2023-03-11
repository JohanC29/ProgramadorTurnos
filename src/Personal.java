public class Personal {
    private String Nombre;
    private int edad;
    private Vehiculo vehiculo;

    public Personal() {

    }

    public Personal(String nombre, int edad, Vehiculo vehiculo) {
        Nombre = nombre;
        this.edad = edad;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
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

    public String getTipo(){return null;}
}
