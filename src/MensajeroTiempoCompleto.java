public class MensajeroTiempoCompleto extends Mensajero{
    public MensajeroTiempoCompleto(int id, String nombre, int edad, IVehiculo iVehiculo) {
        super(id, nombre, edad, iVehiculo);
    }
    @Override
    public String getTipo() {
        return "Mensajero Tiempo Completo";
    }

    @Override
    Double accept(Visitor visitor) {
        return visitor.visitPagoMensajeroCompleto(this);
    }
}
