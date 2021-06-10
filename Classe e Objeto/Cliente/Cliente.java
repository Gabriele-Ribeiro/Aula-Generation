package Classe_Objeto;

import java.text.NumberFormat;

public class Cliente {

	/* 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
	defina as instancias deste objeto e apresente as informações deste objeto no console. */
	
	
		private String nomeCliente;
		private String compra;
		private String pagamento;
		private double preco;
		
		public Cliente(String nomeCliente, String compra, String  pagamento, double preco)
		
		{
			this.nomeCliente = nomeCliente;
			this.compra = compra;
			this.preco = preco;
			this.pagamento = pagamento;
		}
	
		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public String getCompra() {
			return compra;
		}

		public void setCompra(String compra) {
			this.compra = compra;
		}

		public String getPagamento() {
			return pagamento;
		}

		public void setPagamento(String pagamento) {
			this.pagamento = pagamento;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		public void preco1 (double preco1)
		{
			preco1 = preco + preco1;
		}
		
		public void imprimirInfo()
		{
			System.out.println(nomeCliente + "comprou um(a)" + compra 
					+ "de Preço " + this.formatarMoeda() + " e o Pagamento será efetuado com " + pagamento);
		}
		
		public String formatarMoeda()
		{
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(preco);
			return formatoMoeda;
		}
		
		
		

}