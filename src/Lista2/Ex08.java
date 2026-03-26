package Lista2;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero,contadorPar=0,contadorImpar=0;
		float media_pares=0,media_impares=0;
		numero=teclado.nextInt();
		
		if(numero>=0) {
		
		do {
			if(numero%2==0) {
				media_pares=media_pares+numero;
				contadorPar++;
			}
			else {
				media_impares=media_impares+numero;
				contadorImpar++;
			}
			numero=teclado.nextInt();
		}while(numero>=0);
		
		if(contadorPar!=0) {
			media_pares = media_pares /contadorPar;
        } else {
            media_pares = 0;
        }

        if(contadorImpar!=0) {
            media_impares = media_impares /contadorImpar;
        } else {
            media_impares = 0;
        }
		System.out.printf("media dos pares= %.1f media dos impares=%.1f",media_pares,media_impares);
		}
		else System.out.println("incie com um numero valido");
	}
}
