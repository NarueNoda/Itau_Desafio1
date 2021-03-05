package br.com.itau;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

import br.com.itau.modelo.Lancamento;
import br.com.itau.service.LancamentoService;

public class Faturas {
	
	private List<Lancamento> lancamentos;
	
	public Faturas(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	};
	
	//Gastos ordenados por mes
	public Map<Integer, Double> getTotalMeses() {
		Map<Integer, Double> sortedMes = this.lancamentos.stream()
				.collect(
						Collectors.groupingBy(
								Lancamento::getMes,
								Collectors.summingDouble(Lancamento::getValor)
						)
				);
		return sortedMes;
	}
	
	//Todos os lancamentos de uma mesma categoria de sua escolha
	public List<Lancamento> getCategoria(Integer categoria) {
		List<Lancamento> lancamentoCategoria = this.lancamentos.stream()
			.filter(c -> c.getCategoria().equals(categoria))
			.sorted(Comparator.comparing(Lancamento::getMes))
			.collect(Collectors.toList());
		
		return lancamentoCategoria;
	}
	
	
	//Total da fatura de um mes em especifico
	public Double getTotalMes(Integer mes) {
		Double faturaMes = this.lancamentos.stream()
				.filter(m -> m.getMes().equals(mes))
				.mapToDouble(v -> v.getValor())
				.sum();
		
		return faturaMes;
	}
	
}
