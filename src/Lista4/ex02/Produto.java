package Lista4.ex02;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
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
	
	public void exibirDados() {
		System.out.println("-----------------------");
		System.out.printf("Nome: %s\n",nome);
		System.out.printf("Preco: %.2f\n",preco);
		System.out.printf("Quantidade: %d\n",quantidade);
		System.out.println("-----------------------");
	}
	
	public int diminuirEstoque(int qtd) {
		quantidade = quantidade - qtd;
		return quantidade;
	}
	
}
