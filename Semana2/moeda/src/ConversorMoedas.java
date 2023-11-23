import java.util.Scanner;

public class ConversorMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a quantidade em dólares
        System.out.print("Digite a quantidade em dólares: ");
        double quantidadeDolares = scanner.nextDouble();

        // Solicitar ao usuário que insira a taxa de câmbio
        System.out.print("Digite a taxa de câmbio: ");
        double taxaCambio = scanner.nextDouble();

        // Calcular o valor convertido
        double valorConvertido = converterMoeda(quantidadeDolares, taxaCambio);

        // Exibir o valor convertido
        System.out.println("O valor convertido é: " + valorConvertido);
    }

    // Função para converter dólares para outra moeda
    private static double converterMoeda(double quantidadeDolares, double taxaCambio) {
        return quantidadeDolares * taxaCambio;
    }
}