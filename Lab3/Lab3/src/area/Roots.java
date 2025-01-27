package area;

public class Roots extends Trees{
double a=Math.random();
	
	@Override
	public int scarePeople(int numberPeople, double probabilityOfDeath) {
		if (a<probabilityOfDeath) {
		System.out.println("один из толпы споткнулся о по-змеиному извивающиеся корни и свалился в болота.");
		numberPeople=numberPeople-1;
		
		}return numberPeople;
	}
}
