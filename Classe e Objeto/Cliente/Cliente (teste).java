package Classe_Objeto;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente ("Amelie ", " Ossinho canino ", "cartao de cr�dito.", 5);
		{
			
		System.out.println("\nCliente 1: ");
		cliente1.imprimirInfo();
		System.out.println("\n*****Trocando Produtos*****");
		cliente1.setCompra(" Shampoo com Cheirinho de Morango ");
		cliente1.setPreco(15);
		cliente1.imprimirInfo();
		}
		
		Cliente cliente2 = new Cliente("Aurora "," Brinquedinho de morder ", "cart�o de D�bito.", 10);
		{
		System.out.println("\nCliente 2: ");
		cliente2.imprimirInfo();
		System.out.println("\n*****Mudan�a de Pagamento*****");
		cliente2.setPagamento("Dinheiro.");
		cliente2.imprimirInfo();
		}
		}
	}


