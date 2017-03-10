package colin.models.test;

public class TestCase {
	private String name;
	private String box;
	private double cost;
	
	public TestCase(String name,String box,double cost){
		this.name = name;
		this.box = box;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBox() {
		return box;
	}

	public void setBox(String box) {
		this.box = box;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
}
