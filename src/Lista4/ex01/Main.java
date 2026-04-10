package Lista4.ex01;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static ArrayList<Itens> listaItens = new ArrayList<>();
	public static double total=0, valor;
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcoes;
		
		do {
			System.out.println("1-Adicionar iten\n2-Remover iten\n3-Ver lista\n4-Sair");
			opcoes = teclado.nextInt();
		
			switch(opcoes) {
				case 1:
					adicionarIten(teclado);
					break;
				case 2:
					removerItens(teclado);
					break;
				case 3:
					listarItens(teclado);
					break;
				case 4:
					listarItens(teclado);
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opcao invalida");
			}
		}while(opcoes!=4);
	}
	//------------------------------------------------
	public static void adicionarIten(Scanner teclado) {
		String nome,codigo;
		teclado.nextLine();
		System.out.println("Insira o nome do produto: ");
		nome=teclado.nextLine();
		System.out.println("Insira o codigo do produto: ");
		codigo=teclado.nextLine();
		System.out.println("Insira o valor do produto: ");
		valor=teclado.nextDouble();
		total=valor+total;
		Itens novoIten = new Itens(nome,codigo,valor);
		System.out.println("Iten adicionado com sucesso\n");
		listaItens.add(novoIten);
	}
	//------------------------------------------------
	public static void removerItens(Scanner teclado) {
		String remover;
		teclado.nextLine();
		System.out.println("Insira o codigo ou nome do produto que voce deseja remover");
		remover = teclado.nextLine();
		for(int cont=0;cont<listaItens.size();cont++) {
			if(remover.equals(listaItens.get(cont).getNome()) || remover.equals(listaItens.get(cont).getCodigo())) {
				total=total-listaItens.get(cont).getValor();
				listaItens.remove(cont);
				System.out.println("Iten removido com sucesso\n");
			}
		}
	}
	//------------------------------------------------
	public static void listarItens(Scanner teclado) {
		for(Itens itenNovo : listaItens) {
			System.out.println("nome: "+itenNovo.getNome());
			System.out.println("codigo: "+itenNovo.getCodigo());
			System.out.println("valor: "+itenNovo.getValor());
			System.out.println("-----------------------");
		}
		System.out.println("Valor total da compra: "+total+"\n");

	}
}
