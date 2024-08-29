package atividadeAvaVeiculos;

public class Carro extends Veiculo{
	//atributos
	private int numPortas;
	
	//construtor
	
	public Carro(String marca, String modelo, String cor, int numPortas) {
		super(marca, modelo, cor);
		this.numPortas = numPortas;
	}
	
	//metodos
	public void acelerar() {
		System.out.printf("O " + super.toString()+ " acelerou\n");
	}
	
	public void frear() {
		System.out.printf("O " + super.toString()+ " freou\n");
	}
	
	//getters
	public int getNumPortas() {
		return this.numPortas;
	}
	
	
	//setters
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	//toString
	
	public String toString() {
		return "Carro "+ super.getMarca()+": "+super.getModelo()+" "+super.getCor()+" numPortas="+getNumPortas();
	}
	
}
