package Lista3.ex04;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Carro> listaCarro = new ArrayList<>();
		
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
}
