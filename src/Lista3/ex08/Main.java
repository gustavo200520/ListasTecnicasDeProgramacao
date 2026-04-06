package Lista3.ex08;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		 do {
		        System.out.println("===== MENU PRINCIPAL =====");
		        System.out.println("1 - Cadastro de alunos");
		        System.out.println("2 - Controle de estoque");
		        System.out.println("3 - Agenda de contatos");
		        System.out.println("4 - Sistema de carros");
		        System.out.println("5 - Turma com média geral");
		        System.out.println("6 - Cadastro e remoção de produtos");
		        System.out.println("7 - Sistema de biblioteca");
		        System.out.println("8 - Sair");

		        opcao = teclado.nextInt();

		        switch(opcao) {
		            case 1:
		                sistemaAlunoSimples(teclado);
		                break;
		            case 2:
		                sistemaProdutoEstoque(teclado);
		                break;
		            case 3:
		                sistemaContato(teclado);
		                break;
		            case 4:
		                sistemaCarro(teclado);
		                break;
		            case 5:
		                sistemaAlunoMedia(teclado);
		                break;
		            case 6:
		                sistemaProdutoRemocao(teclado);
		                break;
		            case 7:
		                sistemaLivor(teclado);
		                break;
		            case 8:
		                break;
		            default:
		                System.out.println("Opcao invalida");
		        }

		    } while(opcao != 8);
	}	
	
	//-----------------------------------------------
	public static void sistemaAlunoSimples(Scanner teclado) {
		ArrayList<AlunoSimples> listaAlunoSimples = new ArrayList<>();
		int quantidade, contador=0;
	
		System.out.println("Insira a quantidade de alunos: ");
		quantidade = teclado.nextInt();
	
		while(contador<quantidade) {
			AlunoSimples novoAluno = new AlunoSimples();
			teclado.nextLine();
			System.out.println("Insira o nome: ");
			novoAluno.setNome(teclado.nextLine());
			System.out.println("Insira a nota: ");
			novoAluno.setNota(teclado.nextDouble());
			listaAlunoSimples.add(novoAluno);
			contador++;
		}
	
		for(AlunoSimples alunoNovo : listaAlunoSimples) {
			System.out.printf("Nome: %s\n",alunoNovo.getNome());
			System.out.printf("Nota: %.2f\n",alunoNovo.getNota());
			System.out.println("-----------------------");
		}
	}
	//-----------------------------------------------------
	public static void sistemaProdutoEstoque(Scanner teclado) {
		ArrayList<ProdutoEstoque> listaProduto = new ArrayList<>();
		int continuar;
		double valorTotal;
		System.out.println("Digite 1 para adicionar um produto\nDigite 2 para ver lista de produtos"
				+ "\nDigite 3 para sair");
		continuar =teclado.nextInt();
		while(continuar!=3){
			if(continuar==1) {
				ProdutoEstoque novoProduto = new ProdutoEstoque();
				System.out.println("Insira o nome do produto: ");
				teclado.nextLine();
				novoProduto.setNome(teclado.nextLine());
				System.out.println("Insira a quantidade: ");
				novoProduto.setQuantidade(teclado.nextInt());
				System.out.println("Insira o preco: ");
				novoProduto.setPreco(teclado.nextDouble());
				listaProduto.add(novoProduto);
			}
			
			if(continuar==2) {
				for(ProdutoEstoque produtoNovo : listaProduto) {
					System.out.printf("Nome: %s\n",produtoNovo.getNome());
					System.out.printf("quantidade: %d\n",produtoNovo.getQuantidade());
					System.out.printf("Preco: %.2f\n",produtoNovo.getPreco());
					valorTotal = produtoNovo.getQuantidade() * produtoNovo.getPreco();
					System.out.printf("Valor total em estoque: %.2f\n",valorTotal);
					System.out.println("-----------------------");
				}
			}
			
			System.out.println("Digite 1 para adicionar um produto\nDigite 2 para ver lista de produtos"
					+ "\nDigite 3 para sair");
			continuar =teclado.nextInt();
		}
	}
	//-----------------------------------------------------
	public static void sistemaContato(Scanner teclado) {
		ArrayList<Contato> listaContato = new ArrayList<>();
		int contador=0;
		teclado.nextLine();
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
	//-------------------------------------------------
	public static void sistemaCarro(Scanner teclado) {
		ArrayList<Carro> listaCarro = new ArrayList<>();
		teclado.nextLine();
		for(int cont=0;cont<4;cont++) {
			Carro novoCarro = new Carro();

			System.out.println("Insira o modelo: ");
			novoCarro.setModelo(teclado.nextLine());
			System.out.println("Insira o ano: ");
			novoCarro.setAno(teclado.nextInt());
			System.out.println("Insira o valor: ");
			novoCarro.setValor(teclado.nextDouble());
			teclado.nextLine();
			listaCarro.add(novoCarro);
		}
		
		for(Carro carroNovo : listaCarro) {
			if(carroNovo.getAno() >=2020) {
				System.out.printf("Modelo: %s\n",carroNovo.getModelo());
				System.out.printf("Ano: %d\n",carroNovo.getAno());
				System.out.printf("Valor: %.2f\n",carroNovo.getValor());
				System.out.println("-----------------");
			}
		}
	}
	//--------------------------------------------------
	public static void sistemaAlunoMedia(Scanner teclado) {
		ArrayList<AlunoMedia> listaAluno = new ArrayList<>();
		int continuar;
		System.out.println("Digite 1 para adicionar um aluno\nDigite 2 para terminar e ver lista de alunos");
		continuar = teclado.nextInt();
		while(continuar!=2) {
			if(continuar ==1) {
				AlunoMedia novoAluno = new AlunoMedia();
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
		
		for(AlunoMedia alunoNovo : listaAluno) {
			mediaAluno = (alunoNovo.getNota1()+alunoNovo.getNota2())/2;
			mediaGeral = mediaAluno + mediaGeral;
		}
		
		mediaGeral = mediaGeral/listaAluno.size();
		
		for(AlunoMedia alunoNovo : listaAluno) {
			double mediaAluno2 = (alunoNovo.getNota1()+alunoNovo.getNota2())/2;
			System.out.printf("Nome: %s\n",alunoNovo.getNome());
			System.out.printf("Nota1: %.2f\n",alunoNovo.getNota1());
			System.out.printf("Nota2: %.2f\n",alunoNovo.getNota2());
			System.out.printf("Media individual: %.2f\n",mediaAluno2);
			System.out.printf("Media geral: %.2f\n",mediaGeral);
			System.out.println("---------------------");
		}
	}
	//------------------------------------------------------
	public static void sistemaProdutoRemocao(Scanner teclado) {
		ArrayList<ProdutoRemocao> listaProduto = new ArrayList<>();
		int quantidade;
		System.out.println("Insira o numero de produtos que deseja cadastrar");
		quantidade = teclado.nextInt();
		
		for(int cont=0; cont<quantidade; cont++) {
			ProdutoRemocao novoProduto = new ProdutoRemocao();
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
		
		for(ProdutoRemocao produtoNovo : listaProduto) {
			System.out.printf("Codigo: %d\n",produtoNovo.getCodigo());
			System.out.printf("Nome: %s\n",produtoNovo.getNome());
			System.out.printf("Preco: %.2f\n",produtoNovo.getPreco());
			System.out.println("-----------------------");
		}
	}
	//------------------------------------------
	public static void sistemaLivor(Scanner teclado) {
		ArrayList<Livro> listaLivro = new ArrayList<>();
		int opcoes;
		System.out.println("1. Cadastrar livro\n2. Listar livros\n3. Pegar emprestado o livro\n4. Devolver livro\n5. Sair");
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
			System.out.println("1. Cadastrar livro\n2. Listar livros\n3. Pegar emprestado o livro\n4. Devolver livro\n5. Sair");
			opcoes = teclado.nextInt();
		}
	}
}
