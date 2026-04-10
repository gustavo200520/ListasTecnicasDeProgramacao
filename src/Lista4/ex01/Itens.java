package Lista4.ex01;

public class Itens {
	private String nome;
	private String codigo;
	private double valor;
	
	public Itens(String nome, String codigo, double valor) {
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;	
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public double getValor() {
		return valor;
	}
}
