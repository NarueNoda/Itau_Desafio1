package br.com.itau.modelo;

public class Lancamento {

	private Long id;
	private Double valor;
	private String origem;
	private Integer categoria;
	private Integer mes;
	
	public Lancamento(Long id, Double valor, String origem, Integer categoria, Integer mes) {
		super();
		this.id = id;
		this.valor = valor;
		this.origem = origem;
		this.categoria = categoria;
		this.mes = mes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public Integer getCategoria() {
		return categoria;
	}
	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", valor=" + valor + ", origem=" + origem + ", categoria=" + categoria
				+ ", mes=" + mes + "]";
	}
	
	
}

