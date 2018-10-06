package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contrato;
import entities.Prestacao;
import services.Pagamento;
import services.PayPal;

public class Aplicacao {
	public static void main(String[] args) throws ParseException {
		Double[] parcelasComJuros;
		Pagamento p = new PayPal();
		Scanner s = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Contrato c = new Contrato((Integer)899, sdf.parse("05/10/2018"),(Double) 600.0, (Integer)3);
		
		parcelasComJuros = p.jurosMensal(c);
		for(int i =0; i< parcelasComJuros.length;i++) {
			System.out.println(p.taxaPorPagamento(new Prestacao(sdf.parse("05/10/2018"), parcelasComJuros[i], i)));
		}
		System.out.println("");
	}
}
