import java.util.Scanner;

public class Controller {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		XeroxManipulation xerox = new XeroxManipulation();
		
		while(true) {
			
			System.out.println("Enter Your Choice :   \n 1: A4 \n 2:LandScape \n 3: Horizontal \n 4: Micro \n 5:Exit");
			int choice= sc.nextInt();
			
			switch(choice) {
				
			case 1: 
				xerox.A4(sc);
				
				break;
			case 2:
				xerox.landScape(sc);
				break;
			case 3 :
				xerox.horizontal(sc);
				break;
			case 4:
				xerox.micro(sc);
				break;
			case 5:
				System.err.println("Log out successfully");
				System.exit(0);
				break;
			default :
				System.out.println("Please enter valid input");
			
			}
			
			
			
		}
		
	}
	

}