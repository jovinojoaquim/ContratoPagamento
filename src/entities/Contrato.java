package entities;

import java.util.Date;

public class Contrato {
	private Integer numeroContrato;
	private Date data;
	private Double valorTotal;
	private Integer parcelas;

	public Contrato(Integer numeroContrato, Date data, Double valorTotal, Integer parcelas) {
		this.numeroContrato = numeroContrato;
		this.data = data;
		this.valorTotal = valorTotal;
		this.parcelas = parcelas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	
	

}
