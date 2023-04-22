public class Automovil implements IVehiculo {
    private String placa;
    private String modelo;
    private String marca;
    public Automovil(){};
    public Automovil(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void arrancar(){
        System.out.println("arrancando automovil");
    }
    public void getGasolina(){
        System.out.println("Mostrando gasolina del automovil");
    }
    public void getEstado(){
        System.out.println("Mostrando el estado del automovil");
    }

    @Override
    public String getTipoVehiculo() {
        return "Automovil";
    }
}
