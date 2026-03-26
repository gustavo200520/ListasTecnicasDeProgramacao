package Lista2;
import java.util.Scanner;
public class Ex09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n=teclado.nextInt();
		for(int cont=1;cont<=n;cont++) {
			if(n%cont==0) {
				System.out.printf("%d ",cont);
			}
		}
	}
}
