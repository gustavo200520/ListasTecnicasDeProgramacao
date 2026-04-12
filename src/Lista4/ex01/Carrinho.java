package Lista4.ex01;
import java.util.Scanner;
import java.util.ArrayList;
public class Carrinho {
	
	public  double total=0, valor;
	public  ArrayList<Itens> listaItens = new ArrayList<>();

	
	public  void adicionarIten(Scanner teclado) {
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
	public  void removerItens(Scanner teclado) {
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
	public  void listarItens(Scanner teclado) {
		for(Itens itenNovo : listaItens) {
			System.out.println("nome: "+itenNovo.getNome());
			System.out.println("codigo: "+itenNovo.getCodigo());
			System.out.println("valor: "+itenNovo.getValor());
			System.out.println("-----------------------");
		}
		System.out.println("Valor total da compra: "+total+"\n");

	}
}
