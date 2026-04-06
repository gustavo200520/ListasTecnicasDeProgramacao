package Lista3.ex08;

public class ProdutoEstoque {
	private String nome;
	private int quantidade;
	private double preco;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
}