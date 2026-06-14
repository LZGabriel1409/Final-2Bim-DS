import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        ArrayList<Veiculo> frota = new ArrayList<>();
        int opcao;

        do {
            String menu =
                    "--- JAVALOG EXPRESS ---\n\n" +
                    "1 - Cadastrar Van\n" +
                    "2 - Cadastrar Caminhão\n" +
                    "3 - Listar Frota\n" +
                    "0 - Encerrar\n\n" +
                    "Escolha uma opção:";

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    cadastrarVan(frota);
                    break;
                case 2:
                    cadastrarCaminhao(frota);
                    break;
                case 3:
                    listarFrota(frota);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao != 0);
    }

    private static void cadastrarVan(ArrayList<Veiculo> frota) {
        String placa = JOptionPane.showInputDialog("Digite a placa da Van:");

        String modelo = JOptionPane.showInputDialog("Digite o modelo:");

        double carga = Double.parseDouble(JOptionPane.showInputDialog("Capacidade de carga (kg):"));

        Van van = new Van(placa, modelo, carga);

        frota.add(van);

        JOptionPane.showMessageDialog(null, "Van cadastrada com sucesso!");
    }

    private static void cadastrarCaminhao(ArrayList<Veiculo> frota) {
        String placa = JOptionPane.showInputDialog("Digite a placa do Caminhão:");

        String modelo = JOptionPane.showInputDialog("Digite o modelo:");

        double carga = Double.parseDouble(JOptionPane.showInputDialog("Capacidade de carga (kg):"));

        int eixos = Integer.parseInt(JOptionPane.showInputDialog("Número de eixos:"));

        Caminhao caminhao = new Caminhao(placa, modelo, carga, eixos);

        frota.add(caminhao);

        JOptionPane.showMessageDialog(null, "Caminhão cadastrado com sucesso!");
    }

    private static void listarFrota(ArrayList<Veiculo> frota) {
        if (frota.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado.");
            return;
        }

        String relatorio = "--- RELATÓRIO DA FROTA ---\n\n";

        for (Veiculo v : frota) {
            relatorio += v.toString();
            relatorio += "\nFrete Simulado (100 km): R$ " + String.format("%.2f", v.calcularCustoFrete(100));
            relatorio += "\n---------------------------------------------------\n";
        }

        JOptionPane.showMessageDialog(null, relatorio);
    }
}