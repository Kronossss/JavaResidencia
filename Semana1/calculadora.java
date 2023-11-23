import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira dois números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicitar ao usuário que escolha uma operação
        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int escolhaOperacao = scanner.nextInt();

        // Calcular o resultado com base na escolha do usuário
        double resultado = 0;
        switch (escolhaOperacao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                // Certificar-se de que não estamos dividindo por zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma operação válida.");
                return;
        }

        // Exibir o resultado
        System.out.println("O resultado da operação é: " + resultado);
    }
}