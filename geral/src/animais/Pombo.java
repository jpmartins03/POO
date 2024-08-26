package animais;

public class Pombo extends Ave{ //voce NAO pode ter heranças multiplas, herde ave que por sua vez herda animal.
	//atributos
	private int cartasEnviadas;
	
	//cosntrutor
	public Pombo (String novoNome) {
		super(novoNome);
		cartasEnviadas = 0;
		
	}
	//metodos
	public void fazerPruPru() {
		System.out.printf("PRU PRU PRUU!!\n");
	}
	public void enviarCarta() {
		cartasEnviadas ++;
		System.out.printf("%s enviou sua carta!\n", getNome());
	}
	
	//getters
	public int getCards() {
		return this.cartasEnviadas;
	}
	


}
