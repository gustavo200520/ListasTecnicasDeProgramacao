package Lista4.ex02;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void exibirDados() {
		System.out.println("nome: "+nome);
		System.out.println("preco: "+preco);
		System.out.println("quantidade: "+quantidade);
	}
	
	public void diminuirEstoque(int qtd) {
		if(quantidade>=qtd) {
			quantidade = quantidade - qtd;
			
		}
		else System.out.println("Quantidade maior que o estoque");
	}
}
