import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gerar um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        int tentativa;
        int tentativas = 0;

        do {
            // Solicitar ao usuário uma tentativa
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();
            tentativas++;

            // Verificar se a tentativa está correta e fornecer dicas
            if (tentativa < numeroAleatorio) {
                System.out.println("Muito baixo. Tente novamente.");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("Muito alto. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (tentativa != numeroAleatorio);

        scanner.close();
    }
}