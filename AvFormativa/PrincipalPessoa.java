package AvFormativa;

public class PrincipalPessoa {

	public static void main(String[] args) {
		
		Fisica pessoa = new Fisica("David Kauan", "45699786578", "1234567-8");
		
		System.out.println("+++++Pessoa Física+++++");
		System.out.println("NOME: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("RG: " + pessoa.getRg());
		System.out.println("+++++++++++++++++++++++");
		

	}

}
