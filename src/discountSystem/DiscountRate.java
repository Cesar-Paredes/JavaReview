package discountSystem;

public class DiscountRate {
	
	
	private static double servicePremium = 0.2;
	private static double serviceGold = 0.15;
	private static double serviceSilver = 0.1;
	
	private static double productPremium = 0.1;
	private static double productGold = 0.1;
	private static double productSilver = 0.1;
	
	public double getServiceDiscountRate(String type) {
		if(type.equalsIgnoreCase("premium"))
			return servicePremium;
		
		else if(type.equalsIgnoreCase("gold"))
			return serviceGold;
		
		else if(type.equalsIgnoreCase("silver"))
			return serviceSilver;
		
		else
			return 0.0;
	}
	
	
	public double getProductDiscountRate(String type) {
		if(type.equalsIgnoreCase("premium"))
			return productPremium;
		
		else if(type.equalsIgnoreCase("gold"))
			return productGold;
		
		else if(type.equalsIgnoreCase("silver"))
			return productSilver;
		
		else
			return 0.0;
			
	}
	
}

