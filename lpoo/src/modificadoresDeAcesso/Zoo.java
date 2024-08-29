package modificadoresDeAcesso;

class Zoo extends Moo {
	
	public void useMyCoolMethod() {
		
		System.out.println("Zoo disse , "+this.coolMethod());
		
		Moo z = new Moo();
		System.out.println("Moo disse, "+z.coolMethod());
	}
}
