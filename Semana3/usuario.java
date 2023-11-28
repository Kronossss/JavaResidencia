package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	private ArrayList<String> postagens;
	
	
	
	
	public Usuario(String nome, String email, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.postagens =  new ArrayList<String>();
			
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public ArrayList<String> getPostagens() {
		return postagens;
	}

	public void setPostagens(ArrayList<String> postagens) {
		this.postagens = postagens;
	}
	public void adcionaPostagem(String post) {
		postagens.add(post);
		
	}

	public void remove(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	
	


}
