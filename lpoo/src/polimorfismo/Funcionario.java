package polimorfismo;

public class Funcionario extends Pessoa{
	private Double salario;
	
	public Funcionario(String nome, String telefone, Double salario) {
		super(nome, telefone);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionário:"+ getNome() + ", celular=" + getTelefone()
				+ ",salario=" + getSalario();
	}


}
