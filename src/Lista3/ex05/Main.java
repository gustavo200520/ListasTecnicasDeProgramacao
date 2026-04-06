package Lista3.ex05;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Aluno> listaAluno = new ArrayList<>();
		int continuar;
		
		System.out.println("Digite 1 para adicionar um aluno\nDigite 2 para terminar e ver lista de alunos");
		continuar = teclado.nextInt();
		while(continuar!=2) {
			if(continuar ==1) {
				Aluno novoAluno = new Aluno();
				teclado.nextLine();
				System.out.println("Insira o nome: ");
				novoAluno.setNome(teclado.nextLine());
				System.out.println("Insira nota 1: ");
				novoAluno.setNota1(teclado.nextDouble());
				System.out.println("Insira nota 2: ");
				novoAluno.setNota2(teclado.nextDouble());
				listaAluno.add(novoAluno);
				System.out.println("Digite 1 para adicionar um aluno\nDigite 2 para terminar e ver lista de alunos");
				continuar = teclado.nextInt();
			}
		}
		double mediaAluno=0, mediaGeral=0;
		
		for(Aluno alunoNovo : listaAluno) {
			mediaAluno = (alunoNovo.getNota1()+alunoNovo.getNota2())/2;
			mediaGeral = mediaAluno + mediaGeral;
		}
		
		mediaGeral = mediaGeral/listaAluno.size();
		
		for(Aluno alunoNovo : listaAluno) {
			double mediaAluno2 = (alunoNovo.getNota1()+alunoNovo.getNota2())/2;
			System.out.printf("Nome: %s\n",alunoNovo.getNome());
			System.out.printf("Nota1: %.2f\n",alunoNovo.getNota1());
			System.out.printf("Nota2: %.2f\n",alunoNovo.getNota2());
			System.out.printf("Media individual: %.2f\n",mediaAluno2);
			System.out.printf("Media geral: %.2f\n",mediaGeral);
			System.out.println("---------------------");
			
		}
		
	}
}
