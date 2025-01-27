package people;

import java.util.Random;

import AbstractClass.Person;
import area.Forest;
import sckript.OneMove;


public class Danko extends Person{
	int coordinate;
	final double probabilityOfHelp=0.01;
	private final Random random = new Random();
	private final String name="Данко";
	
	Forest forest = new Forest();
	double lvlOfDifficulty=forest.getDifficultyOfRoad();
	
	
	@Override
	public void move (double croudForces) {
		if (random.nextDouble()<probabilityOfHelp) {
			System.out.println("Данко шел впереди людей и, прилагая огромные усилия, раздвигал тесно переплетенные ветви деревьев, делая дорогу чуть легче.");
			croudForces++;
		} 
	}
	
	public double leadPeople (double levelOfFearCroud) {
		double a=Math.random();
		if (a<0.12) {
		Croud croud = new Croud();
		double lvlFear= croud.getLevelOfFear();
		lvlFear=lvlFear-0.1;
		croud.setLevelOfFear(lvlFear);
		System.out.println("Данко окликнул людей, тем самым предупредив их об опасности.");
		}
		return levelOfFearCroud;
	}
	/*@Override
    public boolean equals(Object o) {        if (this == o) return true;
        if (!(o instanceof Danko)) return false;        Danko other = (Danko) o;
        return this.name.equals(other.name) && this.coordinate == other.coordinate;  }
	
	
    @Override    public int hashCode() {
        int result = name.hashCode(); result = 31 * result + coordinate;
        return result;    }
    
    @Override
    public String toString() {        
    	return "Danko{name='" + name + ", coordinate=" + coordinate;
    } */
	
}
