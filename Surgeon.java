
public class Surgeon extends Doctor{

	private Boolean operating;
	
	public Surgeon() {
		super();
	}

	public Surgeon(String name, int number,String specialty,Boolean operating) {
		setName(name);
		setNumber(number);
		setSpecialty(specialty);
		this.operating = operating;
	}



	public Boolean getOperating() {
		return operating;
	}

	public void setOperating(Boolean operating) {
		this.operating = operating;
	}

	@Override
	public String toString() {
		return getName() +" " + getNumber()+" "+ getSpecialty()+"Operating: "+ getOperating() ;
	}

	
	public void work() {
		System.out.println(getName()+ " works for the hospital."+getName()+" is operating now.");
	}
	
	
	
}
