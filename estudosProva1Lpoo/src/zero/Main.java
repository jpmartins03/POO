package zero;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Orc Heavy
		String name = sc.nextLine();
		String raca = sc.nextLine();
	    String patente = sc.nextLine();
	    String district = sc.nextLine();
	    String weapon = sc.nextLine();
	    
		HeavyKnight warrior = new HeavyKnight(name, raca, patente, district, weapon);
		
		System.out.printf("%s\n", warrior);
		
		warrior.Atack();
		
		System.out.printf("\n");
		
		//Goblin Archer
		name = sc.nextLine();
		raca = sc.nextLine();
	    patente = sc.nextLine();
	    district = sc.nextLine();
	    weapon = sc.nextLine();
	    
		Archer archer = new Archer(name, raca, patente, district, weapon);
		
		archer.Shoot();
		
		System.out.printf("%s\n", archer);
		
		sc.close();
	}

}
