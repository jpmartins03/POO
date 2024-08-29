package atividades_aula_4;
import java.util.Scanner;

public class ex3 {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] array1, array2;
		array1 = new int[10];
		array2 = new int[10];
		int i;
		for(i = 0; i<10; i++)
		{
			System.out.printf("Digite um numero: ");
			array1[i] = sc.nextInt();
		}
		for(i = 0; i<10; i++)
		{
			if(array1[i] <0)
			{
				array2[i] = 1;
			}
			else
			{
				array2[i] = array1[i];
			}
		}
		for(i = 0; i<10; i++)
		{
			System.out.printf("Numero da posicao %d do vetor1: %d\n", i, array1[i]);
		}
		for(i = 0; i<10; i++)
		{
			System.out.printf("Numero da posicao %d do vetor2: %d\n", i, array2[i]);
		}
		
			
	}

}
