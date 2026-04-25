package Lista4.ex02;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int qtd;
		Loja novaLoja = new Loja();
		Venda novaVenda = new Venda();
		System.out.println("Insira o nome da loja: ");
		novaLoja.setNomeLoja(teclado.nextLine());
		System.out.println("Insira a quantidade de produtos que deseja adicionar: ");
		qtd= teclado.nextInt();
		
		for(int cont=1;cont<=qtd;cont++) {
			Produto produto = new Produto();
			System.out.println("Insira o nome do produto "+cont+" :");
			teclado.nextLine();
			produto.setNome(teclado.nextLine());
			System.out.println("Insira o preco: ");
			produto.setPreco(teclado.nextDouble());
			System.out.println("Insira a quantidade em estoque");
			produto.setQuantidade(teclado.nextInt());
			novaLoja.cadastrarProduto(produto);
		}
		
		novaLoja.listarProdutos();
		teclado.nextLine();
		System.out.println("Insira o nome produto que deseja vender e a quantidade: ");
		String nome=teclado.nextLine();
		int quantidade = teclado.nextInt();
		
		boolean vendaRealizada = novaLoja.venderProduto(nome, quantidade, novaVenda);
		if(!vendaRealizada) {
		    System.out.println("Venda não realizada.");
		}
		
	}	
}
