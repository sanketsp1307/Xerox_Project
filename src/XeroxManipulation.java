import java.util.Scanner;

public class XeroxManipulation {
	
	
	
	
	public void A4(Scanner sc) {
		
		System.out.println("How many Copy do you want : ");
		System.out.println("Per copy 1.5 rupees");
		int copy = sc.nextInt();
		
		double price = 1.5;
		
		
		System.out.println("Enter your choice : 1\n Color Print \n 2: Blak & White");
		int choice = sc.nextInt();
		
		while(true) {
			
			
			if(choice==1) {
				
				System.out.println("Your color print price is 4 ruppes per page  ");
				System.out.println("You total price is "+4*copy);
				break;
				
				
			}
			else if (choice==2) {
				
				if(copy>100) {
					System.out.println("You are eligible for 5% discount : ");
					price = (price * copy) * 0.5;
					
					System.out.println("You price was "+copy*1.5 + " With discount is "+price);
				}
				else {
					price*=copy;
					System.out.println("Your total amount is "+price);
				}
				break;
				
			}
			else System.err.println("Please enter valid input");
			
		}
	

	}
	public void landScape(Scanner sc) {
	
		System.out.println("Price for LandScape document is : 2" );
		System.out.println("How Many copy do you want :");
		int copy = sc.nextInt();
		
		while(true) {
			
			

			System.out.println("Enter your choice : 1\n Color Print \n 2: Blak & White");
			int choice = sc.nextInt();
			
			if(choice==1) {
				
				System.out.println("Your color print price is 4 ruppes per page :");
				System.out.println("Your total is :"+copy*4);
				break;
				
				
			}
			else if(choice==2) {
				
				if(copy>50) {
					System.out.println("You are eligible for discount  with 4 percent : ");
					double price = (copy*2) *0.4;
					
					System.out.println("Your total price is "+(copy*2)+" with discount is : "+price);
				
					
				}
				else {
					
					System.out.println("Your total price is :"+copy*2);
					
					
				}
				break;
			}
			else System.out.println("Plese Enter valid input");
			
		}
	

	}
	
	
	public void horizontal(Scanner sc) {
		
		
		System.out.println("How Many copy do you want :");
		int copy = sc.nextInt();
		
		while(true) {
			
			
			
			System.out.println("Enter your choice : 1\n Color Print \n 2: Blak & White");
			int choice = sc.nextInt();
			
			if(choice==1) {
				
				
				System.out.println("Price for Horizontal document with color print is : 4" );
				
				
				double price = copy*4;
				
				System.out.println("Your total price is "+price);
				break;
				
				
				
				
			}
			else if(choice==2) {
				
				if(copy>100) {
					
					System.out.println("Price for Horizontal document is : 2" );
					
					System.out.println("You are eligible for discount  with 6 percent : ");
					double price = (copy*2) *0.6;
					
					System.out.println("Your total price is "+(copy*2)+" with discount is : "+price);
					break;
					
				}
				else {
					
					System.out.println("Your total price is :"+copy*2);
					break;
					
				}
				
			}
			else System.out.println("Please enter valid input ");
		}
		
		

	}
	
	public void micro(Scanner sc) {
		
	System.out.println("Enter your choice \n 1: Color Print \n2: Black & White :");
	int choice = sc.nextInt();
	
			 if(choice==1) {
				 
				 System.out.println("Price for per micro is 5 ");
				 System.out.println("Enter you copies ");
				 int copy = sc.nextInt();
				 
				 
				 
				 System.out.println("Your total price is "+5*copy);
				 
			 }
			 else if (choice==2) {
				 System.out.println("Price for per micro is 3 ");
				 System.out.println("Enter you copies ");
				 int copy = sc.nextInt();
				 
				 System.out.println("Your total price is "+ 3*copy);
				 
				 
				 
			 }
			 else System.err.println("Invalid input");

	}
	

}