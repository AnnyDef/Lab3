package area;

import interfaces.Scary;

public class Forest implements Scary {
	 private int levelOfDarkness = 0;   
	 private double difficultyOfRoad = 0;  
	 private double probabilityOfThunderstorm = 0.01;
	 private double probabilityOfDeath = 0.05;
	 private double probabilityOfInterwine = 0.08;
	 private boolean thunderstormActive = false;   
	 
	 @Override
	 public void scarePeople(int numberPeople) {
		 
	 }

	public double getDifficultyOfRoad() {
		return difficultyOfRoad;
	}

	public void setDifficultyOfRoad(double difficultyOfRoad) {
		this.difficultyOfRoad = difficultyOfRoad;
	}
	}

