package sckript;

import java.util.Random;

import area.*;
import exceptions.AlreadyMurmuringException;
import people.Croud;
import people.Danko;

public class OneMove {
    

    Croud croud = new Croud();  
    Danko danko = new Danko();
    Swamp swamp = new Swamp();
    Trees trees = new Trees();
    Forest forest= new Forest();
    Roots roots= new Roots();

  
    private int coordinate = 0;     
    
    double lvlOfDifficulty =forest.getDifficultyOfRoad();  
    private double probabilityOfThunderstorm = 0.01; 
    private double probabilityOfDeath = 0.05;
    private double probabilityOfInterwine = 0.08;  
    double lvlDarkness = forest.getLevelOfDarkness();
    boolean alreadymurmuring = false;
    private boolean thunderstormActive = false; 
    private final Random random = new Random();
	private double lvl; 
	
	
	/*public void setLvlOfDifficulty(double lvlOfDifficulty) {
		this.lvlOfDifficulty=lvlOfDifficulty;
	}
    
	public double getLvlOfDifficulty() {
		return lvlOfDifficulty;
	}*/
	
    private void incrementFear(int delta,double levelOfFear) { 
        for (int i = 0; i < delta; i++) { 
            levelOfFear++;
        } 
    }
   
	public void makeMove(int numberPeople, double croudForces) { 
        while (true) { 
            printStatus(numberPeople, croudForces); 
            NormalScript normalScript = new NormalScript(numberPeople,croudForces);
            
            double lvl=croud.getLevelOfFear();
            int coordCroud = croud.getCoordinate();
            int peopleInCroud = normalScript.getNumberPeople();
            double forces = normalScript.getCroudForces();
            
            
            if (coordCroud >= 26) { 
            	if (forces<=lvlOfDifficulty){
            		System.out.println("У людей иссякли силы и они не смогли продолжить путь"); 
	                break; 
            	} else {
                System.out.println("Данко довел людей до нового и чудесного места"); 
                break; }
            }
            if (peopleInCroud <= 0) { 
                System.out.println("Все люди, ведомые Данко, погибли в ужасном лесу"); 
                break; 
            } 
            if (forces <= 0) { 
                System.out.println("Это был трудный путь, и люди, утомленные им, пали духом. Но им стыдно было сознаться в бессилии, и вот они в злобе и гневе обрушились на Данко."); 
                try{croud.murmur(lvl);
                } catch (AlreadyMurmuringException e){
                	System.out.println(e.getMessage());
                }
                break; 
            } 

            
 
            if (thunderstormActive) { 
                incrementFear(3,lvl); 
                if (random.nextDouble() < 0.1) { 
                    System.out.println("Молния сверкнула над головами людей!"); 
                } 
            } 
 
            try{ croud.murmur(lvl);
            } catch (AlreadyMurmuringException e){
            	System.out.println(e.getMessage());
            }
            
            trees.interwine(lvlOfDifficulty,probabilityOfInterwine);
            probabilityOfInterwine += 0.02; 
            forces =forces- forest.getDifficultyOfRoad(); 
            
            coordinate++; 
            lvlDarkness++; 
            forest.setLevelOfDarkness(lvlDarkness);
            
            probabilityOfThunderstorm += 0.005; 
            probabilityOfDeath += 0.05;
            forest.updateDifficultyOfRoad(lvlDarkness); 
            forest.checkThunderstorm( lvlDarkness, probabilityOfThunderstorm ); 
            danko.leadPeople(lvl);
            croud.move(coordCroud);
            danko.move(coordCroud);
            swamp.scarePeople(peopleInCroud,probabilityOfDeath);
            trees.scarePeople(peopleInCroud,probabilityOfDeath);
            roots.scarePeople(peopleInCroud,probabilityOfDeath);
            
            normalScript.setCroudForces(forces);
            normalScript.setNumberPeople(peopleInCroud);
            forest.setDifficultyOfRoad(lvlOfDifficulty);
            }
        }
	
	
	private void printStatus(int numberPeople, double croudForces) { 
		
		
        System.out.println("\n=== Шаг цикла ==="); 
        System.out.println("Людей в толпе: " + numberPeople); 
        System.out.println("Состояние толпы: " + croud.getCroudCondition(lvl)); 
        System.out.println("Идёт ли гроза: " + thunderstormActive); 
        System.out.println("Текущая координата: " + coordinate); 
        System.out.println("Осталось сил у толпы: " + croudForces); 
        System.out.println("Уровень страха: " + lvl); 
        System.out.println("Уровень тьмы: " + lvlDarkness); 
        System.out.println("Сложность пути: " + lvlOfDifficulty); 
    } 
    
}
