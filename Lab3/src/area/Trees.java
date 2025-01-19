package area;

public class Trees extends Forest{
	double a=Math.random();
	
	@Override
	public void scarePeople(int numberPeople) {
		if (a<0.05) {
		System.out.println("Человек так и не смог протиснуться сквозь могучую стену деревьев и остался далеко позади.");
		numberPeople=numberPeople-1;
		}
	}
	public void interwine(double difficultyOfRoad) {
		
	}

}
