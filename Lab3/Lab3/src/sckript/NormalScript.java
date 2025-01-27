package sckript;
import area.*;
import people.*;

public class NormalScript {
	private double croudForces;
	private int numberPeople;
	double probabilityOfThunderstorm=0.01;
	private boolean thunderstormActive = false; 
	
	public NormalScript(int numberPeople, double  croudForces) {
		this.setNumberPeople(numberPeople); 
        this.setCroudForces(croudForces); 
	}
	
	
	public static void main(String[] args) {
            if (args.length< 2) { 
                System.out.println("Введите два значения"); 
                return; 
            } 
     
            int StartingNumberPeople = Integer.parseInt(args[0]); 
            double croudForces = Integer.parseInt(args[1]); 
            int numberPeople = StartingNumberPeople;
            OneMove oneMoves = new OneMove();
            oneMoves.makeMove(numberPeople,croudForces);
    }
	
	
	public double getCroudForces() {
		return croudForces;
	}
	public void setCroudForces(double croudForces) {
		this.croudForces = croudForces;
	}
	public int getNumberPeople() {
		return numberPeople;
	}
	public void setNumberPeople(int numberPeople) {
		this.numberPeople = numberPeople;
	}
	public boolean isThunderstormActive() {
		return thunderstormActive;
	}
	public void setThunderstormActive(boolean thunderstormActive) {
		this.thunderstormActive = thunderstormActive;
	}
}