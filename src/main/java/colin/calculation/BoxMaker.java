package colin.calculation;
import colin.models.*;

public class BoxMaker {
	private String dimensions;
	
	public BoxMaker(String dimentions){
		this.dimensions = dimentions;
	}
	
	public Box getBox(){
		String[] d = dimensions.split("x");
		int length = Integer.parseInt(d[0]);
		int width =  Integer.parseInt(d[1]);
		int height =  Integer.parseInt(d[2]);
		int weight =  Integer.parseInt(d[3]);
		
		return new Box(length,width,height,weight);
	}
	
}
