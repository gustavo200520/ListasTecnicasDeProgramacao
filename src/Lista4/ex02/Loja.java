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
		boolean achou=false;
		for(Produto produto : listaProduto) {
			if(nome.equals(produto.getNome())) {
				achou=true;
				return produto;
			}
		}
		if(achou) {
			System.out.println("Produto encontrado");
		}
		else {
			System.out.println("Produto nao encontrado");
		}
		return null;
	}
	
	public void venderProduto(String nome, int qtd) {
		if(buscarProduto(nome)!=null) {
			for(Produto produto : listaProduto) {
				if(nome.equals(produto.getNome())) {
					produto.diminuirEstoque(qtd);
					
				}
			}
		}
	}
}
