package Week4;

public class gasaverage {
		public static double main(String[] args) {
			double gasAverage1 = 0.0;
			//This defines a double data type of variable gasAverage and sets it to zero
			if (gasAverage1 > 2.89) {
				System.out.println("Go to Costco!");
			} else {
				System.out.println("Fill up the tank!");
				//This if/else statement checks the price of gas and provides feedback depending if the condition is met.
			}
			double[] gasPrices = {3.15, 3.10, 2.99, 3.05};
			double gasPrice = 0.0;
			for(int i = 0; i < gasPrices.length; i++) {
				gasPrice += gasPrices[i];
				gasAverage1 = gasPrice / gasPrices.length;
			
			
		} return gasPrice;
		
}
}