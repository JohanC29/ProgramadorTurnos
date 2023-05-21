public class CalcularPagoVisitor implements Visitor{

    @Override
    public Double visitPagoDomiciliarioCompleto(DomiciliarioTiempoCompleto domiciliarioTiempoCompleto) {
        return null;
    }

    @Override
    public Double visitPagoMensajeroCompleto(MensajeroTiempoCompleto mensajeroTiempoCompleto) {
        return null;
    }

    @Override
    public Double visitPagoMensajeroMedio(MensajeroMedioTiempo mensajeroMedioTiempo) {
        return null;
    }

    @Override
    public Double visitPagoDomiciliarioMedio(DomiciliarioMedioTiempo domiciliarioMedioTiempo) {
        return null;
    }
}
