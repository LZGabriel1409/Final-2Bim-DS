public abstract class Veiculo {
    private String placa;
    private String modelo;
    private double capacidadeCargaKg;

    public Veiculo(String placa, String modelo, double capacidadeCargaKg) {
        this.placa = placa;
        this.modelo = modelo;
        setCapacidadeCargaKg(capacidadeCargaKg);
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadeCargaKg() {
        return capacidadeCargaKg;
    }

    public void setCapacidadeCargaKg(double capacidadeCargaKg) {

        if (capacidadeCargaKg <= 0) {
            this.capacidadeCargaKg = 100;
        } else {
            this.capacidadeCargaKg = capacidadeCargaKg;
        }
    }

    public abstract double calcularCustoFrete(double distanciaKm);

    @Override
    public String toString() {
        return "Placa: " + placa +
                " | Modelo: " + modelo +
                " | Capacidade: " + capacidadeCargaKg + " kg";
    }
}