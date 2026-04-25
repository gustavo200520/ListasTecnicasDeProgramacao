package Lista4.ex02;

public class Venda {
	private int quantidadeVendida;
	private double total;
	private Produto produto;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidadeVendida() {
		return quantidadeVendida;
	}
	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public double calcularTotal(Produto produto) {
		total = quantidadeVendida * produto.getPreco();
		return total;
	}
	
	public void exibirVenda(Produto produto, int qtd) {
		System.out.println("-------------------------------------");
		System.out.println("Nome do produto vendido: "+produto.getNome());
		System.out.println("Preco do produto: R$ "+produto.getPreco());
		System.out.println("Quantidade vendida: "+qtd);
		System.out.println("Valor total da venda: "+calcularTotal(produto));
		System.out.println("Quantidade restante no estoque: "+produto.getQuantidade());
		System.out.println("-------------------------------------");
		System.out.println("Saindo...");
	}
}
