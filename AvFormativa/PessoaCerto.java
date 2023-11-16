package AvFormativa;

public class PessoaCerto {
	
	private String nome; //Mudei o modificador de acesso, de public para private, por segurança
	private int idade; //Mudei o modificador de acesso, de public para private, por segurança
	
	public PessoaCerto() { 
		super(); //Adicionei um método construtor vazio (sobrecarga de métodos)
	}

	public PessoaCerto(String nome, int idade) { 
		super(); //Adicionei um método construtor com todos os argumentos para o encapsulamento
		this.nome = nome;
		this.idade = idade;//O this serve para indicar que a variável é o atributo declarado 
		                     //no começo do código e a outra, depois do sinal de igual, são os 
		                       // argumentos do método construtor 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
