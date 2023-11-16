package AvFormativa;

public class Principal {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario(7, "David Kauan", 123321, "Permitido", "DavidKDEZ");
		
		System.out.println("+++++Usuário+++++");
		System.out.println("ID: " + usuario.getId());
		System.out.println("NOME: " + usuario.getNome());
		System.out.println("PASSWORD: " + usuario.getPassword());
		System.out.println("PERMISSÃO: " + usuario.getPermissao());
		System.out.println("USUÁRIO: "+ usuario.getUsuario());
		System.out.println("+++++++++++++++++");

	}

}
