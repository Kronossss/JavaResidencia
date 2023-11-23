import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {

    public static void main(String[] args) {
        // Testar todas as funcionalidades
        int[] arrayLido = lerArrayDoUsuario();
        exibirArray(arrayLido);
        System.out.println("Soma dos elementos: " + calcularSoma(arrayLido));
        System.out.println("Maior valor: " + encontrarMaiorValor(arrayLido));
        System.out.println("Menor valor: " + encontrarMenorValor(arrayLido));

        System.out.println();

        int tamanhoArray = 5; // Você pode ajustar o tamanho do array conforme necessário
        int[] arrayAleatorio = criarArrayAleatorio(tamanhoArray);
        exibirArray(arrayAleatorio);
        System.out.println("Soma dos elementos: " + calcularSoma(arrayAleatorio));
        System.out.println("Maior valor: " + encontrarMaiorValor(arrayAleatorio));
        System.out.println("Menor valor: " + encontrarMenorValor(arrayAleatorio));
    }

    // Método para ler um array de números inteiros do usuário
    private static int[] lerArrayDoUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    // Método para criar um array de números inteiros aleatórios
    private static int[] criarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100); // Gera números aleatórios entre 0 e 99
        }

        return array;
    }

    // Método para calcular a soma de todos os elementos no array
    private static int calcularSoma(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }

    // Método para encontrar o maior valor no array
    private static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    // Método para encontrar o menor valor no array
    private static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    // Método para exibir os elementos do array
    private static void exibirArray(int[] array) {
        System.out.print("Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}