package Polimorfismo;

public class Principal {


	public static void main(String[] args) {

		Lobo lobo = new Lobo("Lobo", "M", "Silvestre");
		lobo.emitirSom();

		Leão leão = new Leão("Leão", "M", "Qualquer");
		leão.emitirSom();

		Gato gato = new Gato("Gato", "F", "Siames");
		gato.emitirSom();

		Cachorro cachorro = new Cachorro("Cachorro", "M", "Vira-lata");
		cachorro.emitirSom();

		Tigre tigre = new Tigre("Tigre", "M", "Bengala");
		tigre.emitirSom();

	}
}
