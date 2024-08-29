package atividades_aula_4;
import java.util.Scanner;

public class ex4 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] array;
		array = new int[10];
		
		int i, par = 0, impar = 0;
		
		for(i = 0; i < 10; i++)
		{
			System.out.printf("Digite um numero: ");
			array[i] = sc.nextInt();
		}
		
		for(i = 0; i < 10; i ++)
		{
			if(array[i]%2 == 0)
			{
				par ++;
			}
			else
			{
				impar ++;
			}
		}
		
		System.out.printf("pares: %d\nImpares %d\n", par, impar);
	}

}
