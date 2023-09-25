package in.mindcraft.SpringApp1;

public class Student {
	private int rollno;
	private String name;
	
	private Address resd;
	
	private Laptop lap;

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getResd() {
		return resd;
	}

	public void setResd(Address resd) {
		this.resd = resd;
	}
	
	public   void display() {
		System.out.println(rollno);
		System.out.println(name);
		resd.display();
		lap.display();
	}


}
