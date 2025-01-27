package people;
import AbstractClass.Person;
import enums.CroudCondition;
import exceptions.AlreadyMurmuringException;
import area.*;


public class Croud extends Person {
	private double levelOfFear;
	int coordinate=0;
	double probabilityOfMurmuring = (levelOfFear / 100.0); 
	boolean alreadymurmuring = false;
	
	Forest forest= new Forest();
	@Override
	public void move (double croudForces) {
		coordinate++;
		croudForces= croudForces-forest.getDifficultyOfRoad();
	}
	public void increaseProbabilityOfMurmuring(int numberPeople, int StartingNumberPeople) {
		if (numberPeople<StartingNumberPeople/2){
			probabilityOfMurmuring=probabilityOfMurmuring+0.1;
				}
		
			}
	
	
	public double getLevelOfFear() {
		return levelOfFear;
	}
	
	public void setLevelOfFear(double levelOfFear) {
		this.levelOfFear = levelOfFear;
	}
	
	public int getCoordinate() {
		return coordinate;
	}
	
	public void setCoordinateCroud(int coordinate) {
		this.coordinate = coordinate;
	}
	 public CroudCondition getCroudCondition(double levelOfFear) { 
	        if (levelOfFear < 25) { 
	            return CroudCondition.NORMAL; 
	        } else {if (levelOfFear< 40) { 
	            return CroudCondition.FRUSTRATION; 
	        } else { if (levelOfFear < 70) { 
	            return CroudCondition.PANIC; 
	        } else { 
	            return CroudCondition.FEAR; 
	        } }}
	    }
	 
	 public void murmur(double lvl) throws AlreadyMurmuringException {
	 double a=Math.random();
     if (a< probabilityOfMurmuring && alreadymurmuring == false) { 
         System.out.println("Люди в злобе и гневе обрушились на Данко, человека, который шел впереди их. И стали они упрекать его в неумении управлять ими."); 
         lvl++;
         alreadymurmuring = true;
     } else{
    	 throw new AlreadyMurmuringException ("Новая волна недовольного ропота прокатилась гулкой волной среди людей.");
     }
	 }
	 
}