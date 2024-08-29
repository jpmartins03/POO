package beecrowd;
import java.util.Scanner;

public class areaSuperior {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int i, j;
	        Double soma = 0.0;
	        Double matriz[][];
	        matriz = new Double[12][12];
	        String operacao;
	        operacao = sc.next();
	        
	        for(i=0; i<12; i++)
	        {
	            for(j=0; j<12; j++)
	            {
	                matriz[i][j] = sc.nextDouble();
	            }
	        }
	        
	        for(i = 0; i < 5; i++)
	        {
	            for(j = i+1; j<6; j++)
	            {
	                soma += matriz[i][j];
	                matriz[i][j] = 0.0;
	            }
	        }
	        
	        for(i = 0; i < 5; i++)
	        {
	            for(j=6; j<11-i; j++)
	            {
	                soma += matriz[i][j];
	                matriz[i][j] = 0.0;
	            }
	        }
	        
	         for(i=0; i<12; i++)
	        {
	            for(j=0; j<12; j++)
	            {
	                System.out.printf("  %.1f  ", matriz[i][j]);
	            }
	            System.out.printf("\n");
	        }
	        
	        if(operacao.equals("M"))
	        {
	            System.out.printf("%.1f\n", soma);
	        }
	        else
	        {
	            System.out.printf("%.1f\n", soma/30);
	        }
	        
	        

	    }
}
