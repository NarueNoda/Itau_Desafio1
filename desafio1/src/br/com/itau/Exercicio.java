package br.com.itau;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

import br.com.itau.modelo.Lancamento;
import br.com.itau.service.LancamentoService;
import br.com.itau.Faturas;

//O args[0] representa o numero da categoria
//O args[1] representa o numero do mes

public class Exercicio {

	public static void main(String[] args) {
		List<Lancamento> lancamentos = new LancamentoService().listarLancamentos();
		
		System.out.println("---Gastos ordenados por mes---");
		Faturas gastoMes = new Faturas(lancamentos);
		gastoMes.getTotalMeses().forEach((mes, l) -> System.out.format("Total do mes %s : R$ %s \n", mes, l));
		
		System.out.println("\n---Todos os lancamentos de uma mesma categoria de sua escolha---");
		
		gastoMes.getCategoria(Integer.parseInt(args[0])).stream().forEach((System.out::println));	
		
		System.out.println("\n---Total da fatura de um mes em especifico---");
		
		Double faturaMes = gastoMes.getTotalMes(Integer.parseInt(args[1]));
		System.out.format("Total do mes %s: R$ %s", args[1] ,faturaMes);
		
	}
	
	
	

}
