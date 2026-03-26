package Lista2;
import java.util.Scanner;
public class Ex14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		float H=0;
		n = teclado.nextInt();
		if(n<=0) {
			System.out.println("Erro");
		}
		else {
			for(int cont=1;cont<=n;cont++) {
				H = H + 1.0f/cont;
			}
			System.out.printf("H = %.2f\n",H);
		}
	}
}
