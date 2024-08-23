package zero;

public class HeavyKnight extends Melee{
	//atributes
	private String weapon;
	
	//builder
	public HeavyKnight(String name, String raca, String patente, String district, String weapon) {
		super(name, raca, patente, district);
		this.weapon = weapon;
	}
	//methods
	public void Atack() {
		System.out.printf("%s attacks with his %s dealing %s damage!\n", super.getName(), this.weapon, super.getBaseDamage());
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
		return super.toString()+"\nWeapon =  "+this.weapon;
	}
}
	
