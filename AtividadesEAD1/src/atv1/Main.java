package atv1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vet = {500, 1000, 1500, 3000, 5000};
		
		try {
			int entrada = sc.nextInt();
			for(int i = 0; i < 5; i++) {
				vet[i] = vet[i]/entrada;
			}
			
			for(int i = 0; i < 5; i++) {
				System.out.printf("%d ", vet[i]);

			}
			
		}catch (ArithmeticException erro) {
			System.out.println("Erro de divisão por zero");
		}catch (Exception erro) {
			System.out.println("Caractere inválido");
		}
		
	}
}
