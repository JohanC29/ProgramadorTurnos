public class DomiciliarioMedioTiempo extends Domiciliario{
    public DomiciliarioMedioTiempo(int id, String nombre, int edad, IVehiculo iVehiculo) {
        super(id, nombre, edad, iVehiculo);
    }
    @Override
    public String getTipo() {
        return "Domiciliario Medio Tiempo";
    }

    @Override
    Double accept(Visitor visitor) {
        return visitor.visitPagoDomiciliarioMedio(this);
    }
}
