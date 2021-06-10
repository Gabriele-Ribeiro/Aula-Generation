package Heranças;

public class Pessoa_teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nEmpregado(a): ");
		Empregado felipe = new Empregado ("Felipe Santos","Rua Que Sobe e Desce, 1222","23344455566",976654433, 20, 111, 4500, 15);
		
		felipe.imprimirInfo();
		felipe.calcularSalario();
		
		System.out.println("\n-----------------------");
		System.out.println("\nOperário(a): ");
		
		Operario Marcela = new Operario ("Marcela Reis","Rua dos Lagos, 717","5368965230", 945766898, 25, 2500, 30);
		
		Marcela.imprimirInfo();
		Marcela.calcularValorArtigo();
		
		System.out.println("\n-----------------------");
		System.out.println("\nFornecedor(a): ");
		
		Fornecedor Rosana = new Fornecedor ("Rosana da Silva","Rua do Banco, 36","47589623550", 968984512, 50, 20000, 6500);
		
		Rosana.imprimirInfo();
		Rosana.obterSaldo();
		
		
		
	}
}


