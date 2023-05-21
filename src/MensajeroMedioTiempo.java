public class MensajeroMedioTiempo extends Mensajero{
    public MensajeroMedioTiempo(int id, String nombre, int edad, IVehiculo iVehiculo) {
        super(id, nombre, edad, iVehiculo);
    }

    @Override
    public String getTipo() {
        return "Mensajero Medio Tiempo";
    }

    @Override
    Double accept(Visitor visitor) {
        return visitor.visitPagoMensajeroMedio(this);
    }
}
