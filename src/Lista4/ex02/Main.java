package Lista4.ex02;
import java.util.Scanner;
import java.util.ArrayList;

//ver oq falta como na parte de vender o produto, calcular o total e etc
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o nome da loja:");
		Loja loja = new Loja();
		loja.setNomeLoja(teclado.nextLine());
		
		
		System.out.println("\nBem vindo a loja "+loja.getNomeLoja()+", oque deseja?\n");
		menu();
		int opcoes=teclado.nextInt();
		do {
			switch(opcoes) {
			case 1:
				Produto novoProduto = new Produto();
				teclado.nextLine();
				System.out.println("Insira o nome do produto: ");
				novoProduto.setNome(teclado.nextLine());
				System.out.println("Insira o preco do produto: ");
				novoProduto.setPreco(teclado.nextDouble());
				System.out.println("Insira a quantidade do produto: ");
				novoProduto.setQuantidade(teclado.nextInt());
				loja.cadastrarProduto(novoProduto);
			
				menu();
				opcoes=teclado.nextInt();
				break;
			
			case 2:
				loja.listarProdutos();
				menu();
				opcoes=teclado.nextInt();
				break;
				
			case 3:
				System.out.println("Insira o nome do produto que deseja vender: ");
				teclado.nextLine();
				String procurarProduto=teclado.nextLine();
				for(Produto produtoNovo : loja.getListaProduto()) {
					if(procurarProduto.equals(produtoNovo.getNome())) {
						System.out.println("Insira a quantidade que deseja vender: ");
						int qtd = teclado.nextInt();
						loja.venderProduto(procurarProduto, qtd); 
						produtoNovo.diminuirEstoque(qtd);
						System.out.println("");
					}
				}
				menu();
				opcoes=teclado.nextInt();
				break;
			case 5:
				System.out.println("Saindo....");
				break;
			default:
				System.out.println("opcao invalida\n");
				menu();
				opcoes=teclado.nextInt();
				break;
			}
		}while(opcoes!=5);
	
	}
	public static void menu() {
		System.out.println("1-cadastrar produtos no estoque\n2-listar os produtos cadastrados;"
				+ "\n3-realizar a venda de um produto\n4-atualizar a quantidade em estoque após a venda"
				+ "\n4-informar o valor total da venda.\n5-sair");
	}
}
