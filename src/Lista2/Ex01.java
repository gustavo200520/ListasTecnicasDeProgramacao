package Lista2;
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt(), m = teclado.nextInt(), x,y;
		
		if(n<m) {
			x = n;
			y = m;
		}
		else {
			x = m;
			y = n;
		}
		
		for(int cont=x;cont<=y;cont++) {
			if(cont%2!=0) {
				System.out.printf("%d ",cont);
			}
		}
	}
}
