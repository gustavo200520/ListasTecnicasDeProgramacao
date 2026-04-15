package Lista4.ex02;

public class Venda {
	private int qtdVendida;
	private double valorTotal;
	private Produto produto;
	
	
	public int getQtdVendida() {
		return qtdVendida;
	}
	public void setQtdVendida(int qtdVendida) {
		this.qtdVendida = qtdVendida;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public double calcularTotal() {
		return qtdVendida * produto.getPreco();
	}
	
	public void exibirVenda() {
		System.out.println("-----------------------");
		System.out.printf("Nome: %s\n",produto.getNome());
		System.out.printf("quantidade vendida: %d\n",qtdVendida);
		System.out.printf("Valor total da venda: %.2f\n",valorTotal);
		System.out.printf("Quantidade restante: %d\n",produto.getQuantidade());//usar o diminuir estoque
		System.out.println("-----------------------");
	}
}
