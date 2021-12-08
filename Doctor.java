
public class Doctor extends HospitalEmployee{

	private String specialty;
	
	public Doctor() {
		super();	
	}

	public Doctor(String name, int number,String specialty) {
		setName(name);
		setNumber(number);
		this.specialty = specialty;
	}

	
	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return getName() +" " + getNumber()+" "+ getSpecialty();
	}
	
	public void work() {
		System.out.println(getName()+ " works for the hospital."+getName()+" is a(n) Heart doctor.");
	}	
	
	
}
