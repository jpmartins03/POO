package atividadeAvaVeiculos;

public class Moto extends Veiculo{
	//atributos
	private double tamCorrente;
	
	//construtor
	public Moto(String marca, String modelo, String cor, double tamCorrente) {
		super(marca, modelo, cor);
		this.tamCorrente = tamCorrente;
	}
	
	
	//getters
	public double getTamCorrente() {
		return this.tamCorrente;
	}
	//setters
	public void setTamCorrente(int tamCorrente) {
		this.tamCorrente = tamCorrente;
	}
	
	
	//toString
	public String toString() {
		return "Moto "+super.getMarca()+": "+super.getModelo()+" "+super.getCor()+" tamCorrente "+getTamCorrente();
	}

}
