package entities;

import java.util.Date;

public class Prestacao {
	private Date dataPrestacao;
	private Double valor;
	private int numeroPrestao;

	public Prestacao(Date dataPrestacao, Double valor, int numeroPrestacao) {
		this.dataPrestacao = dataPrestacao;
		this.valor = valor;
		this.numeroPrestao = numeroPrestacao;
	}

	public Date getDataPrestacao() {
		return dataPrestacao;
	}

	public void setDataPrestacao(Date dataPrestacao) {
		this.dataPrestacao = dataPrestacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getNumeroPrestao() {
		return numeroPrestao;
	}

	public void setNumeroPrestao(int numeroPrestao) {
		this.numeroPrestao = numeroPrestao;
	}

	
	
}
