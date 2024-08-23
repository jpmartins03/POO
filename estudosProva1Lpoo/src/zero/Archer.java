package zero;

public class Archer extends Ranged{
	//atributes
	private String weapon;

	//constructor
	public Archer(String name, String raca, String patente, String district, String weapon) {
		super(name, raca, patente, district);
		this.weapon = weapon;
	}

	//methods
	
	public void Shoot() {
		System.out.printf("The %s shoots with his %s dealing %d damage!\n", super.getName(), this.weapon, super.getBaseDamage());
	}
	
	//getters and setters
	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	//toString
	public String toString() {
		return super.toString()+"\nWeapon = "+this.weapon;
	}
	
	
	
}
