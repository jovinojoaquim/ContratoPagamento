package services;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import entities.Contrato;
import entities.Prestacao;

public class PayPal implements Pagamento{

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public Double[] jurosMensal(Contrato contrato) {
		Double[] valorFinal = new Double[contrato.getParcelas()];
		double valorParcela = contrato.getValorTotal()/contrato.getParcelas();
		for(int i = 0; i<contrato.getParcelas(); i++) {
			double novoValorComJuros = valorParcela * 0.01 * i+2;
			valorFinal[i] = valorParcela+novoValorComJuros;
		}
		return valorFinal;
	}

	@Override
	public String taxaPorPagamento(Prestacao p) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(p.getDataPrestacao());
		calendario.set(2, calendario.get(Calendar.MONTH)+p.getNumeroPrestao());
		p.setDataPrestacao(calendario.getTime());
		double valorFinal = p.getValor() * 0.02 + p.getValor();
		return sdf.format(p.getDataPrestacao()) + " " +valorFinal;
	}


	
}
