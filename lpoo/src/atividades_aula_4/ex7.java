package atividades_aula_4;
import java.util.Scanner;

public class ex7 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] matriz;
		int i, j;
		matriz = new int[3][4];
		
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 4; j++)
			{
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < 3; i ++)
		{
			for(j = 0; j < 4; j++)
			{
				System.out.printf("  %d  ", matriz[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		
		for(i = 0; i < 3; i ++)
		{
			for(j = 0; j < 4; j++)
			{
				if(matriz[i][j] > 0)
				{
					System.out.printf("  %d  ", matriz[i][j]);
				}
				else
				{
					System.out.printf("  0  ");
				}
			}
			System.out.printf("\n");
		}
		
	}

}
