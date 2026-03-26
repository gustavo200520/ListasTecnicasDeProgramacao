package Lista2;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, m, k,x,y, soma=0,contador=0;
		float media;
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
				soma = soma+cont;
				contador++;
			}
		}
		if(k!=0) {
			media = soma/contador;
			System.out.println("soma= "+soma+" media= "+media);
		}
	}
}
