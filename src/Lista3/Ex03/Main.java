package Lista3.ex03;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Contato> listaContato = new ArrayList<>();
		int contador=0;
		
		while(contador<5) {
			Contato novoContato = new Contato();
			System.out.println("Insira o nome: ");
			novoContato.setNome(teclado.nextLine());
			System.out.println("Insira o numero de telefone: ");
			novoContato.setTelefone(teclado.nextLine());
			listaContato.add(novoContato);
			contador++;
		}
		
		System.out.println("Verifique um nome: ");
		String nomeAleatorio = teclado.nextLine();
		boolean verificar=false;
		for(Contato contatoNovo : listaContato) {
			if(nomeAleatorio.equals(contatoNovo.getNome())) {
				System.out.printf("Esta na lista\n");
				System.out.printf("Nome: %s\n",contatoNovo.getNome());
				System.out.printf("Numero: %s\n",contatoNovo.getTelefone());
				verificar=true;
				break;
			}
		}
		if(verificar==false) {
			System.out.println("Nao esta na lista");
		}
		
	}
}
//teste