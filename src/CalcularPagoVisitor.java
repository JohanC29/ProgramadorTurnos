public class CalcularPagoVisitor implements Visitor{
    Double vlrHoraDomi = Double.valueOf(5000);
    Double vlrHoraExtraDomi= Double.valueOf(6000);
    Double vlrHoraMens = Double.valueOf(5000);
    Double vlrHoraExtraMens= Double.valueOf(6000);
    Double cantHoraMedioTiempo = Double.valueOf(4);
    Double cantHoraTiempoCompleto = Double.valueOf(8);

    @Override
    public Double visitPagoDomiciliarioCompleto(DomiciliarioTiempoCompleto domiciliarioTiempoCompleto) {
        // Parametros
        int cantHoras = 0;
        int cantHorasExtra = 0;

        // Obtencion de las horas
        for (Integer hora: domiciliarioTiempoCompleto.getListHora()) {
            if (hora < this.cantHoraTiempoCompleto){
                cantHoras += hora;
            }else {
                cantHoras += this.cantHoraTiempoCompleto;
                cantHorasExtra += hora - this.cantHoraTiempoCompleto;
            }
        }
        // Calculo de las horas
        Double resultado = (cantHoras*this.vlrHoraDomi)+(cantHorasExtra*this.vlrHoraExtraDomi);
        return resultado;
    }

    @Override
    public Double visitPagoMensajeroCompleto(MensajeroTiempoCompleto mensajeroTiempoCompleto) {
        // Parametros
        int cantHoras = 0;
        int cantHorasExtra = 0;

        // Obtencion de las horas
        for (Integer hora: mensajeroTiempoCompleto.getListHora()) {
            if (hora < this.cantHoraTiempoCompleto){
                cantHoras += hora;
            }else {
                cantHoras += this.cantHoraTiempoCompleto;
                cantHorasExtra += hora - this.cantHoraTiempoCompleto;
            }
        }
        // Calculo de las horas
        Double resultado = (cantHoras*this.vlrHoraMens)+(cantHorasExtra*this.vlrHoraExtraMens);
        return resultado;
    }

    @Override
    public Double visitPagoMensajeroMedio(MensajeroMedioTiempo mensajeroMedioTiempo) {
        // Parametros
        int cantHoras = 0;
        int cantHorasExtra = 0;

        // Obtencion de las horas
        for (Integer hora: mensajeroMedioTiempo.getListHora()) {
            if (hora < this.cantHoraMedioTiempo){
                cantHoras += hora;
            }else {
                cantHoras += this.cantHoraMedioTiempo;
                cantHorasExtra += hora - this.cantHoraMedioTiempo;
            }
        }
        // Calculo de las horas
        Double resultado = (cantHoras*this.vlrHoraMens)+(cantHorasExtra*this.vlrHoraExtraMens);
        return resultado;
    }

    @Override
    public Double visitPagoDomiciliarioMedio(DomiciliarioMedioTiempo domiciliarioMedioTiempo) {
        // Parametros
        int cantHoras = 0;
        int cantHorasExtra = 0;

        // Obtencion de las horas
        for (Integer hora: domiciliarioMedioTiempo.getListHora()) {
            if (hora < this.cantHoraMedioTiempo){
                cantHoras += hora;
            }else {
                cantHoras += this.cantHoraMedioTiempo;
                cantHorasExtra += hora - this.cantHoraMedioTiempo;
            }
        }
        // Calculo de las horas
        Double resultado = (cantHoras*this.vlrHoraDomi)+(cantHorasExtra*this.vlrHoraExtraDomi);
        return resultado;
    }
}
