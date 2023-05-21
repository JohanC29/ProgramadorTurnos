public class DomiciliarioTiempoCompleto extends Domiciliario{
    public DomiciliarioTiempoCompleto(int id, String nombre, int edad, IVehiculo iVehiculo) {
        super(id, nombre, edad, iVehiculo);
    }

    @Override
    public String getTipo() {
        return "Domiciliario Tiempo Completo";
    }

    @Override
    Double accept(Visitor visitor) {
        return visitor.visitPagoDomiciliarioCompleto(this);
    }
}
