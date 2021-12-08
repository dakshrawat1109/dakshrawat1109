
public class Nurse extends HospitalEmployee {

	private int numOfPatients;

	public Nurse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nurse(String name, int number,int numOfPatients) {
		setName(name);
		setNumber(number);
		this.numOfPatients = numOfPatients;
	}
	
	

	public int getNumOfPatients() {
		return numOfPatients;
	}

	public void setNumOfPatients(int numOfPatients) {
		this.numOfPatients = numOfPatients;
	}

	
	public String toString() {
		return getName() +" " + getNumber()+" "+ getNumOfPatients()+" patients";
	}


	public void work() {
		System.out.println(getName()+ " works for the hospital."+getName()+" is a nurse with "+getNumOfPatients()+" patients.");
	}	
	
	
}
