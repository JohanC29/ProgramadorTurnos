public class Empresa {
    private String nombre;
    private int cantidadPersonalRequerida;

    public Empresa() {
    }

    public Empresa(String nombre, int cantidadPersonalRequerida) {
        this.nombre = nombre;
        this.cantidadPersonalRequerida = cantidadPersonalRequerida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPersonalRequerida() {
        return cantidadPersonalRequerida;
    }

    public void setCantidadPersonalRequerida(int cantidadPersonalRequerida) {
        this.cantidadPersonalRequerida = cantidadPersonalRequerida;
    }
}
