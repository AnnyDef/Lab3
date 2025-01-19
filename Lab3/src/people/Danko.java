package people;

import AbstractClass.Person;


public class Danko extends Person{
	int levelOfFearDanko;
	int coordinate;
	
	@Override
	public void move (double croudForces, int coordinate, int numberPeople) {
		if (numberPeople>numberPeople/2) {
			System.out.println("Данко шел впереди людей и был бодр и ясен");
		} else {
			System.out.println("Данко ужаснулся от количества оставшихся людей, но продолжил вести их за собой");
		}
	}
	
	public double leadPeople (double levelOfFearCroud) {
		double a=Math.random();
		if (a<0.12) {
		Croud croud = new Croud();
		double lvlFear= croud.getLevelOfFearCroud();
		lvlFear=lvlFear-1;
		croud.setLevelOfFearCroud(lvlFear);
		}
		return levelOfFearCroud;
	}
	
}
