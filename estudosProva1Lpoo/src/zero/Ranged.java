package zero;

public class Ranged extends Soldier{
	//atributes
	private int maxLife = 60;
	private int baseDamage = 20;
	
	//builder
	public Ranged(String name, String raca, String patente, String district) {
		super(name, raca, patente, district);
	}


	
	//methods
	
	//getters and setters
	public int getMaxLife() {
		return maxLife;
	}

	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}

	public int getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	
	//toString
	public String toString() {
		return super.toString()+"\n"+"Max Life = "+this.maxLife+"\nBase damage = "+this.baseDamage;
	}

}
