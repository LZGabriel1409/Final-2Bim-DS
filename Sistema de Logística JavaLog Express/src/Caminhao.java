public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, String modelo, double capacidadeCargaKg, int eixos) {
        super(placa, modelo, capacidadeCargaKg);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public double calcularCustoFrete(double distanciaKm) {
        return distanciaKm * 4.50 * eixos;
    }

    @Override
    public String toString() {
        return "Veículo: Caminhão | " +
                "Placa: " + getPlaca() +
                " | Modelo: " + getModelo() +
                " | Capacidade: " + getCapacidadeCargaKg() + " kg" +
                " | Eixos: " + eixos;
    }
}