package area;

import java.util.Random;

import interfaces.Scary;

public class Forest implements Scary { 
	 private double difficultyOfRoad = 0;  
	 private boolean thunderstormActive = false;  
	 private final Random random = new Random(); 
	 private double levelOfDarkness = 0; 
	 

	    public double updateDifficultyOfRoad(double levelOfDarkness ) { 
	        if (levelOfDarkness > 50) { 
	            difficultyOfRoad += 1; 
	        } else if (levelOfDarkness > 25) { 
	            difficultyOfRoad += 0.5; 
	        }  
	        return difficultyOfRoad;
	    } 
	    
	    public void checkThunderstorm(double levelOfDarkness, double probabilityOfThunderstorm ) { 
	        if (!thunderstormActive) { 
	            if (random.nextDouble() < probabilityOfThunderstorm) { 
	                thunderstormActive = true; 
	                levelOfDarkness = 100; 
	                System.out.println("Началась страшная гроза! Тьма окутала лес."); 
	            } 
	        } 
	    }   
	 
	 @Override
	 public int scarePeople(int numberPeople, double probabilityOfDeath) {
			return numberPeople;
	 }

	public double getDifficultyOfRoad() {
		return difficultyOfRoad;
	}

	public void setDifficultyOfRoad(double difficultyOfRoad) {
		this.difficultyOfRoad = difficultyOfRoad;
	}

	public double getLevelOfDarkness() {
		return levelOfDarkness;
	}

	public void setLevelOfDarkness(double levelOfDarkness) {
		this.levelOfDarkness = levelOfDarkness;
	}
	}

