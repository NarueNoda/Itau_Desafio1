package br.com.itau.service;

import java.util.ArrayList;
import java.util.List;

import br.com.itau.modelo.Lancamento;

public class LancamentoService {

	public List<Lancamento> listarLancamentos(){
		List<Lancamento> lancamentos = new ArrayList<>();
		
		lancamentos.add(new Lancamento(1L, 13.3, "Uber", 1, 1));
		lancamentos.add(new Lancamento(2L, 130.5, "PS Store", 2, 2));
		lancamentos.add(new Lancamento(3L, 1023.66, "Carrefour", 6, 5));
		lancamentos.add(new Lancamento(4L, 132.44, "Mercado Três Irmãos", 6, 6));
		lancamentos.add(new Lancamento(5L, 65.3, "Drogasil", 6, 7));
		lancamentos.add(new Lancamento(6L, 12.5, "Uber", 1, 3));
		lancamentos.add(new Lancamento(7L, 87.3, "Uber", 3, 7));
		lancamentos.add(new Lancamento(8L, 234.45, "Oficina Bom Sucesso", 4, 1));
		
		
		return lancamentos;
	}
}
