package session5;

public class AccessFoodMenu implements VegItems, NonVegItems{

	@Override
	public void fry() {
		System.out.println("Chicken Fry,Prawn Fry,Mutton Fry,Fish Fry etc.");
		
	}

	@Override
	public void gravy() {
		System.out.println("Chicken Gravy,Prawn Gravy,Mutton Gravy, etc.");
		
	}

	@Override
	public void breakFast() {
		System.out.println("Idly,Dosa,Pongal,Poori etc.");
		
	}

	@Override
	public void lunch() {
		System.out.println("Meals,Chicken Biriyani,Mutton Biriyani etc.");
		
	}

	public static void main(String[] args) {
		   
	AccessFoodMenu af = new AccessFoodMenu();
	af.breakFast();
	af.fry();
	af.gravy();
	af.lunch();
	}
}
