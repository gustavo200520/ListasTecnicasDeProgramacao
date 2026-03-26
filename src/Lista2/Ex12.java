package Lista2;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x,n,base;
		x = teclado.nextInt();
		n = teclado.nextInt();
		base = x;
		if(n==0) {
			System.out.println(1);
		}
		else {
		
			for(int cont=1;cont<n;cont++) {
				x = x*base;
			}
			System.out.println(x);
		}
	}
}
