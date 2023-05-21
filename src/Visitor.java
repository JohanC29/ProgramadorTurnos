public interface Visitor {
    Double visitPagoDomiciliarioCompleto(DomiciliarioTiempoCompleto domiciliarioTiempoCompleto);
    Double visitPagoMensajeroCompleto(MensajeroTiempoCompleto mensajeroTiempoCompleto);
    Double visitPagoMensajeroMedio(MensajeroMedioTiempo mensajeroMedioTiempo);
    Double visitPagoDomiciliarioMedio(DomiciliarioMedioTiempo domiciliarioMedioTiempo);
}
