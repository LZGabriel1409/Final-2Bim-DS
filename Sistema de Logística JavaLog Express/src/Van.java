public class Van extends Veiculo {
    public Van(String placa, String modelo, double capacidadeCargaKg) {
        super(placa, modelo, capacidadeCargaKg);
    }

    @Override
    public double calcularCustoFrete(double distanciaKm) {
        double valor = distanciaKm * 2.50;

        if (getCapacidadeCargaKg() > 1000) {
            valor += 30.00;
        }
        return valor;
    }

    @Override
    public String toString() {
        return "Veículo: Van | " + super.toString();
    }
}