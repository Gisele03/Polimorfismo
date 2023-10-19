package Funcionario;

public class Principal {

	public static void main(String[] args) {
		Jornada jornada = new Jornada(1, "João", "1599999999", 4, "Rua das Flores");
		System.out.println("--SALARIO JORNADA--");
		System.out.println(jornada.calcularSalario(10, 8));
		
		Horista horista = new Horista(1, "João", "159999999", 4, "Rua das Flores");
		System.out.println("--SALARIO HORISTA--");
		System.out.println(horista.calcularSalario(15, 8));
		
		PessoaJuridica pessoa = new PessoaJuridica(1, "João", "159999999", 4, "Rua das Flores");
		System.out.println("--SALARIO PESSOA JURIDICA--");
		System.out.println(pessoa.calcularSalario(3000, 60));
	}	
}