package cliente;

import java.util.Scanner;

public class MainCliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome : ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o cpf : ");
		String cpf = sc.nextLine();
		
		Cliente clienteum = new Cliente(nome, cpf);
		System.out.println("Nome do cliente " + clienteum.getNome());
		System.out.println("Cpf do " + clienteum.getNome()+"igual a : "+clienteum.getCpf());
		System.out.println("Idade de "+ clienteum.getNome()+ "igual a : "+ clienteum.getIdade());
		
		
		System.out.println("Altere o nome : ");
		nome = sc.nextLine();
		clienteum.setNome(nome);
		
		System.out.println("Altere o cpf : ");
		cpf = sc.nextLine();
		clienteum.setCpf(cpf);
		
		
		System.out.println("Altere a idade : ");
	    int idade = sc.nextInt();
		clienteum.setIdade(idade);
		
		System.out.println("DADOS ALTERADOS : ");
		
		
		System.out.println("Nome do cliente " + clienteum.getNome());
		System.out.println("Cpf do " + clienteum.getNome()+"igual a : "+clienteum.getCpf());
		System.out.println("Idade de "+ clienteum.getNome()+ "igual a : "+ clienteum.getIdade());
	
		
		
		
		
	}
}
