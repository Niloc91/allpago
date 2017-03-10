package colin.models;

public class ShortestPathResult {
	private int HARD;
	private double cost;
	private String source;
	private String friendName;
	
	public ShortestPathResult(int HARD,double cost,String source,String friendName){
		this.HARD = HARD;
		this.cost = cost;
		this.source = source;
		this.friendName = friendName;
	}

	public int getHARD() {
		return HARD;
	}

	public void setHARD(int HARD) {
		this.HARD = HARD;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	
	
	
}
