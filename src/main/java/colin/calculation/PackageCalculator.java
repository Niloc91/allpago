package colin.calculation;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import colin.models.Box;

public class PackageCalculator {
	private Box box;
	
	public PackageCalculator(Box box){
		this.box = box;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getVolWeight(){
		return this.box.getHeight()*this.box.getHeight()*this.box.getWidth()/5000;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getWeight(){
		return box.getWeight()/1000;
	}
	
	/**
	 * 
	 * @param weight
	 * @return
	 */
	public double getRndFive(double weight){
		return Math.ceil(weight * 2) / 2.0;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getNormWeight(){
		return getRndFive((getVolWeight()>getWeight())?getVolWeight():getWeight());
	}
	
	/**
	 * 
	 * @param HARD
	 * @return
	 */
	public double getShipCost(int HARD){
		double cost = Math.sqrt(HARD)*getNormWeight();

		cost = Math.round(cost * 100);
		cost = cost/100;
		
		return cost;
	}
	
	
}
