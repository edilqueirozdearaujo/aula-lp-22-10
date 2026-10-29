package aula_22_10;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		Pessoa jogador1 = new Pessoa();
		Pessoa jogador2 = new Pessoa("Messi",36);
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		
		jogador1.setIdade(50);
		jogador1.setNome("Ronaldo");
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());
	}

}
