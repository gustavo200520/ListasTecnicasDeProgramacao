package Lista3.ex06;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Produto> listaProduto = new ArrayList<>();
		int quantidade;
		System.out.println("Insira o numero de produtos que deseja cadastrar");
		quantidade = teclado.nextInt();
		
		for(int cont=0; cont<quantidade; cont++) {
			Produto novoProduto = new Produto();
			System.out.println("Insira o codigo: ");
			novoProduto.setCodigo(teclado.nextInt());
			teclado.nextLine();
			System.out.println("Insira o  nome: ");
			novoProduto.setNome(teclado.nextLine());
			System.out.println("Insira o preco: ");
			novoProduto.setPreco(teclado.nextDouble());
			listaProduto.add(novoProduto);
		}
		
		System.out.println("Digite 1 para remover um produto\nDigite 2 para finalizar e ver a lista");
		int continuar=teclado.nextInt(), codigo;
		boolean produtoEncontrado;
		
		while(continuar==1) {
			produtoEncontrado = false;
			System.out.println("Insira o  codigo: ");
			codigo = teclado.nextInt();
			for(int cont = 0; cont < listaProduto.size(); cont++) {
			    if(codigo == listaProduto.get(cont).getCodigo()) {//get(cont) pega o produto na posicao cont, +
			    	// se fosse String usaria equals() ao inves de ==
			        System.out.println("Produto removido com sucesso\n");
			        listaProduto.remove(cont);
			        produtoEncontrado = true;
			        break; 
			    }
			}
			if(produtoEncontrado==false) {
				System.out.println("Produto nao encontrado\n");
			}
			System.out.println("Digite 1 para remover um produto\nDigite 2 para finalizar e ver a lista");
			continuar=teclado.nextInt();
		}
		
		for(Produto produtoNovo : listaProduto) {
			System.out.printf("Codigo: %d\n",produtoNovo.getCodigo());
			System.out.printf("Nome: %s\n",produtoNovo.getNome());
			System.out.printf("Preco: %.2f\n",produtoNovo.getPreco());
			System.out.println("-----------------------");
		}
	}
}
