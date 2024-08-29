package atividadeAvaVeiculos;
import java.util.Scanner;

public class app {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Carro
		String marcaCarro = sc.next();
		String modeloCarro = sc.next();
		String corCarro = sc.next();
		int numPortas = sc.nextInt();
		Carro car = new Carro(marcaCarro, modeloCarro, corCarro, numPortas);
		
		//Moto
		String marcaMoto = sc.next();
		String modeloMoto = sc.next();
		String corMoto = sc.next();
		double tamCorrente = sc.nextDouble();
		
		Moto moto = new Moto(marcaMoto, modeloMoto, corMoto, tamCorrente);
				
		//prints
		System.out.printf("%s\n", car);
		car.acelerar();
		car.frear();
		System.out.printf("%s\n", moto);
		
		String corMoto2 = sc.next();
		moto.setCor(corMoto2);
		System.out.printf("%s\n", moto);
		sc.close();
	}
}
