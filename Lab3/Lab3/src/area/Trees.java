package area;

import java.util.Random;

public class Trees extends Forest{
	private final Random random = new Random();
	
	@Override
	public int scarePeople(int numberPeople, double probabilityOfDeath) {
		if (random.nextDouble()<probabilityOfDeath ) {
		System.out.println("Человек так и не смог протиснуться сквозь могучую стену деревьев и остался далеко позади.");
		numberPeople=numberPeople-1;
		
		}
		return numberPeople;
	}
	public void interwine(double difficultyOfRoad,double probabilityOfInterwine) {
		if (random.nextDouble()<probabilityOfInterwine ) {
			difficultyOfRoad=difficultyOfRoad+0.5;
			System.out.println("Деревья простирали вокруг людей, уходивших из плена тьмы, корявые, длинные руки, сплетая их в густую сеть и пытаясь остановить уходящих.                         ");
		}
	}

}
