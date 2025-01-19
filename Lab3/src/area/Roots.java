package area;

public class Roots extends Trees{
double a=Math.random();
	
	@Override
	public void scarePeople(int numberPeople) {
		if (a<0.05) {
		System.out.println("один из толпы споткнулся о по-змеиному извивающиеся корни и свалился в болота.");
		numberPeople=numberPeople-1;
		}
	}
}
