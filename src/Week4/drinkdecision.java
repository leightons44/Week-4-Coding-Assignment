package Week4;

public class drinkdecision {
	public static boolean willBuyDrink(Boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
		
	}
	public static void main(String[] args) {
		boolean isHotOutside = true;
		double moneyInPocket = 5.00;
		boolean buyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("Buy the drink!" + buyDrink);
	}//Main method 
}
