package Lista4.ex02;

import java.util.ArrayList;
public class Loja {
	private String nomeLoja;
	private ArrayList<Produto> listaProduto = new ArrayList<>();
	
	
	public ArrayList<Produto> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(ArrayList<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	
	public void cadastrarProduto(Produto produto) {
		listaProduto.add(produto);
		System.out.println("Produto cadastrado com sucesso\n");
		
	}
	
	
	public void listarProdutos() {
		for(Produto produto : listaProduto) {
			produto.exibirDados();
			System.out.println("-------------------------");
		}
	}
	
	public Produto buscarProduto(String nome) {
		for(Produto produto : listaProduto) {
			if(nome.equalsIgnoreCase(produto.getNome())) {
				return produto;
			}
		}
		
		return null;
	}
	
	
	public boolean venderProduto(String nome, int qtd, Venda venda) {
	    Produto produto = buscarProduto(nome);

	    if(produto == null) {
	        System.out.println("Produto não encontrado.");
	        return false;
	    }

	    if(produto.getQuantidade() < qtd) {
	        System.out.println("Estoque insuficiente.");
	        return false;
	    }

	    produto.diminuirEstoque(qtd);

	    venda.setQuantidadeVendida(qtd);
	    venda.exibirVenda(produto, qtd);

	    return true;
	}
}
