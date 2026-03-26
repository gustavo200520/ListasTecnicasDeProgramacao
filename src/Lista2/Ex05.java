package Lista2;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, primeiro, segundo, novo ;
		
		for(int cont=1000;cont<=9999;cont++) {
			primeiro = cont/100;
			segundo = cont - (primeiro*100);
			novo = (primeiro+segundo) * (primeiro+segundo);
			
			if(cont==novo) {
				System.out.printf("%d ",cont);
			}	
		}
		
	}
}
