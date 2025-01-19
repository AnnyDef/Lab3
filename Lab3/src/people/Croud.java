package people;
import AbstractClass.Person;
import enums.CroudCondition;
import area.*;


public class Croud extends Person {
	private double levelOfFearCroud;
	int coordinate=0;
	
	Forest forest= new Forest();
	@Override
	public void move (double croudForces, int coordinate, int numberPeople) {
		coordinate++;
		croudForces= croudForces-forest.getDifficultyOfRoad();
		
			}
	
	public double getLevelOfFearCroud() {
		return levelOfFearCroud;
	}
	
	public void setLevelOfFearCroud(double levelOfFear) {
		this.levelOfFearCroud = levelOfFearCroud;
	}
	
	public int getCoordinate() {
		return coordinate;
	}
	
	public void setCoordinateCroud(int coordinate) {
		this.coordinate = coordinate;
	}
	 private CroudCondition getCroudCondition() { 
	        if (levelOfFearCroud < 25) { 
	            return CroudCondition.NORMAL; 
	        } else {if (levelOfFearCroud < 40) { 
	            return CroudCondition.FRUSTRATION; 
	        } else { if (levelOfFearCroud < 70) { 
	            return CroudCondition.PANIC; 
	        } else { 
	            return CroudCondition.FEAR; 
	        } }}
	    }
	 
	 public void murmur(int levelOfFearCroud) {
	 double probabilityOfMurmuring = (levelOfFearCroud / 100.0); 
	 double a=Math.random();
     if (a< probabilityOfMurmuring) { 
         System.out.println("В толпе раздался ропот недовольства..."); 
         levelOfFearCroud++;
     } }
	 
}