package Classe_Objeto;

import java.text.NumberFormat;

public class Conta_Bancaria {
/* 6) Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto 
  conta bancaria, defina as instancias deste objeto e apresente as informações deste objeto no console. */
	
	private String nomeproprietario;
	private float pagamento;
	
	public Conta_Bancaria (String nomeproprietario, float pagamento)
	
	{
		this.nomeproprietario = nomeproprietario;
		this.pagamento = pagamento;	
	}
	
	public void imprimirInfo()
	{
		System.out.println(nomeproprietario + " possui " + this.formatarMoeda() + " em sua Conta Bancária.");
	}
	public String getNomeproprietario() {
		return nomeproprietario;
	}

	public void setNomeproprietario(String nomeproprietario) {
		this.nomeproprietario = nomeproprietario;
	}

	public float getPagamento() {
		return pagamento;
	}

	public void setPagamento(float pagamento) {
		this.pagamento = pagamento;
	}

	public void aumentarPagamento(double percentual)
	{
		pagamento *= 1 - percentual / 100;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(pagamento);
		return formatoMoeda;
	}
}
