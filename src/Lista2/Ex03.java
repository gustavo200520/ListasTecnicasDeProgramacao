package Lista2;
import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, m, k,x,y;
		n=teclado.nextInt();
		m=teclado.nextInt();
		k=teclado.nextInt();
		if(n<m) {
			x = n;
			y = m;
		}
		else {
			x = m;
			y = n;
		}
		
		for(int cont=x;cont<=y;cont++) {
			if(cont%k==0) {
				System.out.printf("%d ",cont);
			}
		}
	}
}
