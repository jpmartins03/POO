package atividades_aula_4;
import java.util.Scanner;
import java.util.Locale;

public class ex10 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float[][] matriz;
		matriz = new float[10][2];
		int i, j;
		float media = 0;
		
		for(i = 0; i < 10; i++)
		{
			for(j = 0; j < 2; j++)
			{
				System.out.printf("Digite a nota da disciplina %d do aluno %d: ", j + 1, i + 1);
				matriz[i][j] = sc.nextFloat();
			}
		}
		System.out.printf("\n");
		for(i = 0; i < 10; i++)
		{
			for(j = 0; j < 2; j++)
			{
				media += matriz[i][j];
			}
			
			media = media/2;
			
			if(media >= 6)
			{
				System.out.printf("Aluno %d aprovado com media %.1f\n", i+1, media);
			}
			else
			{
				System.out.printf("Aluno %d nao aprovado com nota %.2f\n", i, media);
			}
			
			media = 0;
		}
	}

}
