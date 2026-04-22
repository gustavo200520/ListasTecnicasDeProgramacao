package Lista4.ex02;
import java.util.Scanner;
import java.util.ArrayList;

//ver oq falta como na parte de vender o produto, calcular o total e etc
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int qtd;
		Loja novaLoja = new Loja();
		System.out.println("Insira o nome da loja: ");
		novaLoja.setNomeLoja(teclado.nextLine());
		System.out.println("Insira a quantidade de produtos que deseja adicionar: ");
		qtd= teclado.nextInt();
		
		for(int cont=0;cont<qtd;cont++) {
			Produto produto = new Produto();
			System.out.println("Insira o nome do produto: ");
			teclado.nextLine();
			produto.setNome(teclado.nextLine());
			System.out.println("Insira o preco: ");
			produto.setPreco(teclado.nextDouble());
			System.out.println("Insira a quantidade em estoque");
			produto.setQuantidade(teclado.nextInt());
			novaLoja.cadastrarProduto(produto);
		}
		
		novaLoja.listarProdutos();
	}	
}
