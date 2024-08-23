package zero;

public class Soldier {
	//atributes
	private String name;
	private String raca;
	private String patente;
	private String district;
	
	//builder
	public Soldier (String name, String raca, String patente, String district) {
		this.raca = raca;
		this.patente = patente;
		this.district = district;
		this.name = name;
	}
	//methods
	
	
	//getters and setters
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	//toString
	public String toString() {
		return  this.patente+" "+this.name+" the "+this.raca+" from district "+this.district+" ";
	}
	

}
