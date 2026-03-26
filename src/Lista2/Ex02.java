package Lista2;
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt(), m = teclado.nextInt();
		
		if(n<m) {
			for(int cont=n;cont<=m;cont++) {
				if(cont%2!=0) {
					System.out.printf("%d ",cont);
				}
			}
		}
		
		else {
			for(int cont=n;cont>=m;cont--) {
					if(cont%2!=0) {
					System.out.printf("%d ",cont);
					}
			}
		}
	}
}

	
