package atividades_aula_4;
import java.util.Scanner;

public class ex8 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] matriz;
		int i, j, xi = 0, xj = 0, menor;
		matriz = new int[3][3];
		
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 3; j++)
			{
				matriz[i][j] = sc.nextInt();
			}
		} 
		
		menor = matriz[0][0];
		
		for(i = 0; i < 3; i ++)
		{
			for(j = 0; j < 3; j++)
			{
				System.out.printf("  %d  ", matriz[i][j]);
			}
			System.out.printf("\n");
		}
		
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 3; j++)
			{
				if(matriz[i][j] < menor)
				{
					menor = matriz[i][j];
					xi = i; xj = j;
				}
			}
		}
		
		System.out.printf("O menor valor é: %d\nLocalizado na posicao %d %d\n", menor, xi, xj);
	}

}
