package area; 


public class Swamp extends Forest{
	double a=Math.random();
	
	@Override
	public int scarePeople(int numberPeople, double probabilityOfDeath) {
		if (a<probabilityOfDeath) {
		System.out.println("Болото разинуло свою жадную гнилую пасть и проглотило человека");
		numberPeople=numberPeople-1;
	 }return numberPeople;
		}
}
