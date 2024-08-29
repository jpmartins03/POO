package polimorfismo;

public class Gerente extends Funcionario{
	private Double bonusAnual;
	
	public Gerente(String nome, String telefone, Double salario, Double bonusAnual) {
		super(nome, telefone, salario);
		this.bonusAnual = bonusAnual;
	}


	public Double getBonusAnual() {
		return bonusAnual;
	}

	public void setBonusAnual(Double bonusAnual) {
		this.bonusAnual = bonusAnual;
	}
	

	public String toString() {
		//return "Gerente[Funcionário:"super.getNome()+", celular="+super.getTelefone()+",salario="+super.getSalario()+",bonus="+bonusAnual+"]"
		return "Gerente["+super.toString()+",bonus="+bonusAnual+"]";
	}
	
}
