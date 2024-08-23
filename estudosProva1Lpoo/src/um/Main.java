package um;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, j;
		int[][]matriz = new int[4][4];
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				System.out.printf("    %d", matriz[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		
		//diagonal principal
		
		//acima
		Soma sum = new Soma(matriz);
		
		int x = sum.SomaAcimaPrincipal(matriz);
		System.out.printf("\n");
		System.out.printf("Soma acima principal = %d\n", x);
		System.out.printf("\n");
		
		//abaixo
		x = sum.SomaAbaixoPrincipal(matriz);
		System.out.printf("\n");
		System.out.printf("Soma abaixo principal = %d\n", x);
		System.out.printf("\n");
		
		//diagonal secundaria
		
		//acima
		x = sum.SomaAcimaSecundaria(matriz);
		System.out.printf("\n");
		System.out.printf("Soma acima secundaria = %d\n", x);
		System.out.printf("\n");
		
		//abaixo
		
		x = sum.SomaAbaixoSecundaria(matriz);
		System.out.printf("\n");
		System.out.printf("Soma abaixo seundaria = %d\n", x);
		System.out.printf("\n");
		
		
		
	}

}
