package sckript;
import area.*;
import people.*;

public class NormalScript {
	double croudForces;
	int numberPeople;
	public NormalScript(int numberPeople, int croudForces) {
		this.numberPeople = numberPeople; 
        this.croudForces = croudForces; 
	}
	public static void main(String[] args) {
            if (args.length< 2) { 
                System.out.println("Usage: java Scenario <numberOfPeople> <forcesCroud>"); 
                return; 
            } 
     
            int numberPeople = Integer.parseInt(args[0]); 
            double croudForces = Integer.parseInt(args[1]); 
     
    Croud croud = new Croud();  
    Danko danko = new Danko();
    Swamp swamp = new Swamp();
    Trees trees = new Trees();
    
    double lvl=croud.getLevelOfFearCroud();
    int coordCroud = croud.getCoordinate();
    
    danko.leadPeople(lvl);
    croud.move(croudForces, coordCroud, numberPeople );
    swamp.scarePeople(numberPeople);
    trees.scarePeople(numberPeople);
}
}