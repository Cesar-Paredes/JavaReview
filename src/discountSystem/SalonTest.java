package discountSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalonTest {
	
	DiscountRate discount = new DiscountRate();
	Visit visit = new Visit();
	

	
	//HERE WE TEST SERVICES METHODS
	
	//premium is suppose to be set at 20% for services so we will see if our method is set correctly
	@Test
	public void checkServicePremium() {
		 double serviceDiscount = discount.getServiceDiscountRate("premium");
		 
		 //premium is suppose to be set at 20% for services so we will see if our method is set correctly
		 assertEquals(0.2,serviceDiscount);
	}
	
	//gold is suppose to be set at 15% for services so we will see if our method is set correctly
		@Test
		public void checkServiceGold() {
			 double serviceDiscount = discount.getServiceDiscountRate("gold");
			 
			 //gold is suppose to be set at 15% for services so we will see if our method is set correctly
			 assertEquals(0.15,serviceDiscount);
		}
		
		
		//gold is suppose to be set at 10% for services so we will see if our method is set correctly
		@Test
		public void checkServiceSilver() {
			double serviceDiscount = discount.getServiceDiscountRate("silver");

			//silver is suppose to be set at 10% for services so we will see if our method is set correctly
			assertEquals(0.1,serviceDiscount);
		}
		
		//no members have no discount so we will see if our method is set correctly
		@Test
		public void checkServiceNonMembers() {
			double serviceDiscount = discount.getServiceDiscountRate("no member");

			assertEquals(0.0,serviceDiscount);
		}
		
		
		////////////////////////////////
		
		//HERE WE TEST PRODUCTS METHODS
		//ALL MEMBERS HAVE A FLAT RATE DISCOUNT OF 10%
		
		//premium is suppose to be set at 10% for products so we will see if our method is set correctly
		@Test
		public void checkProductsPremium() {
			 double productDiscount = discount.getProductDiscountRate("premium");
			 
			 //premium is suppose to be set at 10% for products so we will see if our method is set correctly
			 assertEquals(0.1,productDiscount);
		}
		
		//gold is suppose to be set at 10% for products so we will see if our method is set correctly
		@Test
		public void checkProductsGold() {
			double productDiscount = discount.getProductDiscountRate("gold");

			//gold is suppose to be set at 10% for products so we will see if our method is set correctly
			assertEquals(0.1,productDiscount);
		}


		//gold is suppose to be set at 10% for products so we will see if our method is set correctly
		@Test
		public void checkProductsSilver() {
			double productDiscount = discount.getProductDiscountRate("silver");

			//silver is suppose to be set at 10% for products so we will see if our method is set correctly
			assertEquals(0.1,productDiscount);
		}

		//no members have no discount so we will see if our method is set correctly
		@Test
		public void checkProductsNonMembers() {
			double productDiscount = discount.getProductDiscountRate("no member");

			assertEquals(0.0,productDiscount);
		}


	
	
	//CHECK IF THE METHOD GETTOTALEXPENSES() IS WORKING PROPERLY				
	@Test
	public void checkTotalExpenses() {
		
		visit.setProductExpense(50);
		visit.setServiceExpense(50);
		
		double totalExpenses = visit.getTotalExpense();
		
		assertEquals(100,totalExpenses);
		
	}

}
