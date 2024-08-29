package atividades_aula_4;
import java.util.Scanner;
import java.util.Locale;

public class ex5 {
	
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] array;
		array = new double[10];
		
		int i, maiorposi;
		double maior; 
		
		for(i = 0; i < 10; i++)
		{
			System.out.printf("Digite um numero: ");
			array[i] = sc.nextDouble();
		}
		maior = array[0];
		maiorposi = 0;
		
		for(i = 0; i < 10; i ++)
		{
			if(maior < array[i])
			{
				maior = array[i];
				maiorposi = i;
			}
			
		}
		
		System.out.printf("O maior elemento é: %.2f e sua posicao no vetor é: %d", maior, maiorposi);
	}

}