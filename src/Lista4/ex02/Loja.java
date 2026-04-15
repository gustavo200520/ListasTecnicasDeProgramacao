package Lista4.ex02;

import java.util.ArrayList;
public class Loja {
	private String nomeLoja;
	private ArrayList<Produto> listaProduto = new ArrayList<>();
	private Produto produto;
	private Venda venda;
	
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	public String getNomeLoja() {
		return nomeLoja;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Produto getProduto() {
		return produto;
	}
	public ArrayList<Produto> getListaProduto(){
		return listaProduto;
	}
	
	
	public void cadastrarProduto(Produto produto) {
		listaProduto.add(produto);
		System.out.println("Produto cadastrado com sucesso!\n");
	}
	
	public void listarProdutos() {
		for(Produto produtoNovo : listaProduto) {
			System.out.println("-----------------------");
			System.out.printf("Nome: %s\n",produtoNovo.getNome());
			System.out.printf("Preco: %.2f\n",produtoNovo.getPreco());
			System.out.printf("Quantidade: %d\n",produtoNovo.getQuantidade());
			System.out.println("-----------------------");
		}
	}
	
	public Produto buscarProduto(String novoProduto) {
		boolean possuiProduto=false;
		for(Produto p : listaProduto) {
			if(p.getNome().equals(novoProduto)) {
				possuiProduto=true;
				return p;
			}
		}
		return null;
	}
	
	public double venderProduto(String nome, int qtd) {
		Produto p = buscarProduto(nome);
	    
	    if (p != null && p.getQuantidade() >= qtd) {
	        p.diminuirEstoque(qtd);
	        return p.getPreco() * qtd;
	    }
	    
	    return 0;
	}
	
}
