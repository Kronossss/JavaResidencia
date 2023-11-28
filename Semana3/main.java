package cliente;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		int valor = 1;
		String tira;
		Scanner sc = new Scanner(System.in);
		while(valor != 0) {
		System.out.print("                       MENU \n");
		System.out.print("         Digite o número da opção desejada \n");
		System.out.print("             [1] - Adcionar novo usuário \n");
		System.out.print("             [2] - Remover usuário \n");
		System.out.print("             [3] - Login \n");
		System.out.print("             [0] - Sair \n \n \n");
		
		
		System.out.print("Digite a opção desejada : ");
		valor = sc.nextInt();
		sc.nextLine();
		
		switch (valor) {
		case 1 :
		System.out.print("Escreva o nome : ");
		String nome = sc.nextLine();
		
		System.out.print("Escreva o email : ");
		String email = sc.nextLine();
		
		System.out.print("Escreva a senha : ");
		String senha = sc.nextLine();
		
		Usuario usuario = new Usuario(nome, email, senha);
		
		System.out.println("Escreva a primeira postagem : ");
		String postagem = sc.nextLine();
		usuario.adcionaPostagem(postagem);

		/* System.out.println("Escreva a segunda postagem : ");
	    postagem = sc.nextLine();
		usuario.adcionaPostagem(postagem);
		
		System.out.println("Escreva a terceira postagem : ");
	    postagem = sc.nextLine();
		usuario.adcionaPostagem(postagem); */
				
		System.out.println(usuario.getPostagens());
		System.out.println(usuario.getNome());
		System.out.println(usuario.getEmail());
		System.out.println(usuario.getSenha());
		
		
		break;
		
		case 2:
		    System.out.print("Digite o email do usuário a ser removido: ");
		    String emailRemover = sc.nextLine();

		    // Usando for-each para percorrer a list
		        if (usuario.getEmail().equals(emailRemover)) {
		            usuario.remove();
		            System.out.println("Usuário removido com sucesso.");
		            break;
		        }
		    break;
		}
	}
		sc.close();
	}

}
