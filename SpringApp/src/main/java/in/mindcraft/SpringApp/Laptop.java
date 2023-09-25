package in.mindcraft.SpringApp;

public class Laptop {
	private int lid;
	private String make;
	private double cost;
	
	
	public Laptop() {
		lid=1;
		make="abc";
		cost=45000;
	}
	
	
	public Laptop(int lid, String make, double cost) {
		super();
		this.lid = lid;
		this.make = make;
		this.cost = cost;
	}


	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void show() {
		System.out.println(lid+" "+make+" "+cost);
	}
	

}
