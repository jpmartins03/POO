package ListasMaps;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Pessoa> list = new ArrayList<>();
		
		try {
			for(int i = 0; i<3; i++) {
				String nome1 = sc.next();
				int idade1 = sc.nextInt();
				list.add(new Pessoa(nome1, idade1));
				
			}
			System.out.printf("[");
			for (int i = 0; i < list.size(); i++) {
				Pessoa x = list.get(i);
				if(i != 2) {
					System.out.printf(x.toStirng()+", ");
				}
				else {
					System.out.printf(x.toStirng()+"]\n");
				}
			}

			int novaIdade = sc.nextInt();
			Pessoa segundaPessoa = list.get(1);
			segundaPessoa.setIdade(novaIdade);
				 
			int total = list.size();
			System.out.printf("Total="+total);
				 
			System.out.printf(" [");
			for (int i = 0; i < list.size(); i++) {
				Pessoa x = list.get(i);
				if(i != 2) {
					System.out.printf(x.toStirng()+", ");
				}
				else {
					System.out.printf(x.toStirng()+"]\n");
				}
			}
			
		}catch(Exception erro) {
			System.out.println("Entrada Inválida!");
		}
			
	}
}
