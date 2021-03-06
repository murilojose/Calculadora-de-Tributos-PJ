package br.com.suelengc.calctributospj.model;


public class NotaFiscal {

	private double valorBruto;
	private double valorLiquido;
	private Tributo tributo;  
	
	public NotaFiscal(double valorTotalNotaFiscal) {
		this.valorBruto = valorTotalNotaFiscal;
	}
	
	public NotaFiscal(double valorHora, double qtdeHora) {
		this(valorHora * qtdeHora);
	}

	public NotaFiscal(double valorTotalNotaFiscal, Tributo tributo) {
		this.valorBruto = valorTotalNotaFiscal;
		this.setTributos(tributo);
	}

	public void setTributos(Tributo tributo) {
		this.tributo = tributo;
	}
	
	public Tributo getTributo() {
		return tributo;
	}
	
	public double getValorBruto() {
		return valorBruto;
	}
	
	public double getValorLiquido() {
		return valorLiquido;
	}
	
	public void CalcularTributos() {
		tributo.Calcular(valorBruto);
		valorLiquido = valorBruto - tributo.valorTotalTributos();
	}
}
