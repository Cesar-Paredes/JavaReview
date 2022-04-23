package discountSystem;

import java.util.Date;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Welcome to our Beauty Salon!");
		
		Customer anna = new Customer("Anna");
		Customer mike = new Customer("Mike");
		Customer claudia = new Customer("Claudia");
		Customer brenda = new Customer("Brenda");
		
		DiscountRate discount = new DiscountRate();
		
		Random random = new Random();
		
		int year = random.nextInt(2022 - 2020)+2020;
		int month = random.nextInt(12 - 1) +1;
		int day = random.nextInt(28-1)+1;
		
		Date date1 = new Date(year, month, day);//sets a random date
		
		year = random.nextInt(2022 - 2020)+2020;
		month = random.nextInt(12 - 1) +1;
		day = random.nextInt(28-1)+1;
		Date date2 = new Date(year, month, day);//sets a random date
		
		year = random.nextInt(2022 - 2020)+2020;
		month = random.nextInt(12 - 1) +1;
		day = random.nextInt(28-1)+1;
		Date date3 = new Date(year, month, day);//sets a random date
		
	
		//CUSTOMER PROFILE FOR ANNA
		//Ana
		Visit annaVisit = new Visit("Anna",date1);
		
		//we set Anna as a member
		anna.setMember(true);
		anna.setMemberType("premium");//she is a premium member
		
		//VISIT PROFILE FOR ANNA WITH DISCOUNTS
		//she got a haircut for $150.99
		annaVisit.setServiceExpense(150.99);
		double annaServiceDiscount = discount.getServiceDiscountRate("premium"); //Anna gets a premium discount rate in Services
		double totalAnnaBill = annaVisit.getServiceExpense() - (annaVisit.getServiceExpense() * annaServiceDiscount);
		
		//she also bought some hair products for $89.55
		annaVisit.setProductExpense(89.55);
		double annaProductDiscount = discount.getProductDiscountRate("premium");//Anna gets premium discount in products
		totalAnnaBill += (annaVisit.getProductExpense() - (annaVisit.getProductExpense()) * annaProductDiscount);
		
		System.out.println("______________________________________________________________________________________________");
		System.out.println("Member Profile: ");
		System.out.println(anna.toString());
		System.out.println("Visit Expenses: ");
		System.out.println(annaVisit.toString());
		System.out.println("Total with " + anna.getMemberType() + " membership discount: " + totalAnnaBill);
		
		System.out.println();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//CUSTOMER PROFILE FOR MIKE
		Visit mikeVisit = new Visit("Mike",date2);
		
		//we set Mike as a member
		mike.setMember(true);
		mike.setMemberType("gold");
		
		//VISIT PROFILE FOR MIKE WITH DISCOUNTS
		mikeVisit.setServiceExpense(45);
		double mikeServiceDiscount = discount.getServiceDiscountRate("gold"); 
		double totalMikeBill = mikeVisit.getServiceExpense() - (mikeVisit.getServiceExpense() * mikeServiceDiscount);
		
		//she also bought some hair products for $89.55
		mikeVisit.setProductExpense(10.55);
		double mikeProductDiscount = discount.getProductDiscountRate("gold");//Anna gets premium discount in products
		totalMikeBill += (mikeVisit.getProductExpense() - (mikeVisit.getProductExpense()) *mikeProductDiscount);
		
		System.out.println("______________________________________________________________________________________________");
		System.out.println("Member Profile: ");
		System.out.println(mike.toString());
		System.out.println("Visit Expenses: ");
		System.out.println(mikeVisit.toString());
		System.out.println("Total with " + mike.getMemberType() + " membership discount: "  + totalMikeBill);
		
		System.out.println();
		
	
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//CUSTOMER PROFILE FOR CLAUDIA
				Visit claudiaVisit = new Visit("Claudia",date3);
				
				//we set Mike as a member
				claudia.setMember(true);
				claudia.setMemberType("silver");
				
				//VISIT PROFILE FOR MIKE WITH DISCOUNTS
				claudiaVisit.setServiceExpense(400);
				double claudiaServiceDiscount = discount.getServiceDiscountRate("silver"); 
				double totalClaudiaBill = claudiaVisit.getServiceExpense() - (claudiaVisit.getServiceExpense() * claudiaServiceDiscount);
				
				//she also bought some hair products for $89.55
				annaVisit.setProductExpense(150);
				double claudiaProductDiscount = discount.getProductDiscountRate("silver");
				totalClaudiaBill += (claudiaVisit.getProductExpense() - (claudiaVisit.getProductExpense()) *claudiaProductDiscount);
				
				System.out.println("______________________________________________________________________________________________");
				System.out.println("Member Profile: ");
				System.out.println(claudia.toString());
				System.out.println("Visit Expenses: ");
				System.out.println(claudiaVisit.toString());
				System.out.println("Total with " + claudia.getMemberType() + " membership discount: "  + totalClaudiaBill);
				
				System.out.println();
		
				///////////////////////////////////////////////////////////////////////////////////////////////////////////////
				//CUSOMER PROFILE FOR BRENDA
		
				Visit brendaVisit = new Visit("Brenda",date3);
				
				//we set Mike as a member
				brenda.setMember(false);
				brenda.setMemberType("no member");
				
				//VISIT PROFILE FOR MIKE WITH DISCOUNTS
				brendaVisit.setServiceExpense(500.65);
				double brendaServiceDiscount = discount.getServiceDiscountRate("no"); 
				double totalBrendaBill = brendaVisit.getServiceExpense() - (brendaVisit.getServiceExpense() * brendaServiceDiscount);
				
				//she also bought some hair products for $89.55
				brendaVisit.setProductExpense(49.99);
				double brendaProductDiscount = discount.getProductDiscountRate("no");
				totalBrendaBill += (brendaVisit.getProductExpense() - (brendaVisit.getProductExpense()) *brendaProductDiscount);
				
				System.out.println("______________________________________________________________________________________________");
				System.out.println("Member Profile: ");
				System.out.println(brenda.toString());
				System.out.println("Visit Expenses: ");
				System.out.println(brendaVisit.toString());
				System.out.println("Total with " + brenda.getMemberType() + " membership discount: "  + totalBrendaBill);
				
				System.out.println();
		
	}

}
