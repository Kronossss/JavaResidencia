import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a temperatura
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        // Solicitar ao usuário que escolha a unidade de origem
        System.out.print("Escolha a unidade de origem (C para Celsius, F para Fahrenheit): ");
        char unidadeOrigem = scanner.next().charAt(0);

        // Realizar a conversão com base na escolha do usuário
        double resultado;
        if (unidadeOrigem == 'C' || unidadeOrigem == 'c') {
            resultado = celsiusParaFahrenheit(temperatura);
            System.out.println("A temperatura em Fahrenheit é: " + resultado + " °F");
        } else if (unidadeOrigem == 'F' || unidadeOrigem == 'f') {
            resultado = fahrenheitParaCelsius(temperatura);
            System.out.println("A temperatura em Celsius é: " + resultado + " °C");
        } else {
            System.out.println("Opção inválida. Por favor, escolha C ou F para a unidade de origem.");
        }
    }

    // Função para converter Celsius para Fahrenheit
    private static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Função para converter Fahrenheit para Celsius
    private static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}