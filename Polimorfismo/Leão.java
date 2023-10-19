package Polimorfismo;

public class Leão extends Animal {
	
	public Leão(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O leão está rugindo.");
	}

}