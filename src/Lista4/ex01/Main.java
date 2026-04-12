package Lista4.ex01;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcoes;
		Carrinho meuCarrinho = new Carrinho();
		do {
			System.out.println("1-Adicionar iten\n2-Remover iten\n3-Ver lista\n4-Sair");
			opcoes = teclado.nextInt();
		
			switch(opcoes) {
				case 1:
					meuCarrinho.adicionarIten(teclado);
					break;
				case 2:
					meuCarrinho.removerItens(teclado);
					break;
				case 3:
					meuCarrinho.listarItens(teclado);
					break;
				case 4:
					meuCarrinho.listarItens(teclado);
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opcao invalida");
			}
		}while(opcoes!=4);
	}
	
}
