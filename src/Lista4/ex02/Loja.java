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
			System.out.println("Nome: "+produto.getNome());
			System.out.println("Preco: "+produto.getPreco());
			System.out.println("Quantidade: "+produto.getQuantidade());
			System.out.println("--------------------------------");
		}
	}
	
}
