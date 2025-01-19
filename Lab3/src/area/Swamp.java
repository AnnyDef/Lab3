package area; 


public class Swamp extends Forest{
	double a=Math.random();
	
	@Override
	public void scarePeople(int numberPeople) {
		if (a<0.05) {
		System.out.println("Болото разинуло свою жадную гнилую пасть и проглотило человека");
		numberPeople=numberPeople-1;
	 }
		}
}
