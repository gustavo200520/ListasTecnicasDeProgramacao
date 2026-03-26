package Lista2;
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,soma=0,perfeito=0;
		n = teclado.nextInt();
		for(int cont=1;cont<n;cont++) {
			for(int cont2=1;cont2<cont;cont2++) {
				if(cont%cont2==0) {
					soma= soma+cont2;
				}
			}
			if(soma==cont) {
				perfeito=cont;
				System.out.printf("%d ",perfeito);
			}
			soma=0;
		}
	}
}
