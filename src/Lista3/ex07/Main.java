package Lista3.ex07;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Livro> listaLivro = new ArrayList<>();
		int opcoes;
		System.out.println("1. Cadastrar livro\n2. Listar livros\n3. Emprestar livro\n4. Devolver livro\n5. Sair");
		opcoes = teclado.nextInt();
		while(opcoes>0 && opcoes<5) {
			if(opcoes==1) {
				Livro novoLivro = new Livro();
				teclado.nextLine();
				System.out.println("Insira o titulo: ");
				novoLivro.setTitulo(teclado.nextLine());
				System.out.println("Insira o autor: ");
				novoLivro.setAutor(teclado.nextLine());
				novoLivro.setEmprestado(false);
				listaLivro.add(novoLivro);
				
			}
			if(opcoes==2) {
				for(Livro livroNovo : listaLivro) {
					System.out.printf("Titulo: %s\n",livroNovo.getTitulo());
					System.out.printf("Autor: %s\n",livroNovo.getAutor());
					System.out.printf("Emprestado: %b\n",livroNovo.getEmprestado());
					System.out.println("-----------------------");
					
				}
			}
			if(opcoes==3) {
				boolean estaNoCatalogo=false;
				String verificarTitulo;
				teclado.nextLine();
				System.out.println("Insira o titulo do livro");
				verificarTitulo=teclado.nextLine();
				for(Livro livroNovo : listaLivro) {
					if(verificarTitulo.equals(livroNovo.getTitulo())) {
						estaNoCatalogo=true;
						if(livroNovo.getEmprestado()==false) {
							livroNovo.setEmprestado(true);
							System.out.println("Livro emprestado com sucesso");
						}
						else System.out.println("Esse livro ja foi emprestado");
					}
				}
				if(estaNoCatalogo==false) {
					System.out.println("Esse livro nao foi cadastrado");
				}
			}
			if(opcoes==4) {
				boolean estaNoCatalogo=false;
				String verificarTitulo;
				teclado.nextLine();
				System.out.println("Insira o titulo do livro");
				verificarTitulo=teclado.nextLine();
				for(Livro livroNovo : listaLivro) {
					if(verificarTitulo.equals(livroNovo.getTitulo())) {
						estaNoCatalogo=true;
						if(livroNovo.getEmprestado()==true) {
							livroNovo.setEmprestado(false);
							System.out.println("Livro devolvido com sucesso");
						}
						else System.out.println("Esse livro ja foi devolvido");
					}
				}
				if(estaNoCatalogo==false) {
					System.out.println("Esse livro nao foi cadastrado");
				}
			}
			System.out.println("1. Cadastrar livro\n2. Listar livros\n3. Emprestar livro\n4. Devolver livro\n5. Sair");
			opcoes = teclado.nextInt();
		}
	}
}
