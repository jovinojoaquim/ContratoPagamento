package services;

import entities.Contrato;
import entities.Prestacao;

public interface Pagamento {

	public Double[] jurosMensal(Contrato contrato);
	public String taxaPorPagamento(Prestacao p);
}
