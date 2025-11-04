//Curtis Chiu
//Period 7 10/28/2025
/* Postage.java
 * 
 * Pseudocode on Paper.
 * This program gives the user three choices for a postage type. 
 * It then prompts the weight, and then prints all the info out. 
 * 
 * 
 * Testing: In the menu prompt (the 1,2,3), any integer more than 3 or negative
 * will print a error message and end the program with the same ending message.  
 */
 
 import java.util.Scanner;
 
 public class Postage
 {
		//field variables
		private byte choice;
		private double price;
		private int weight;
		
		//These are the final values for no magic numbers.
		final double FirstClassRate;
		final double FirstClassEach;
		final double PostcardCost;
		final double MediaMailRate;
		final double MediaMailEach;
		
	 
	 public Postage()
	 {
		 //field variables
		 this.choice = choice;
		 this.price = price;
		 this.weight = weight;
		 
		 //Delcare and initialize final values for no magic numbers.
		 FirstClassRate = 0.29;
		 FirstClassEach = 0.78;
		 PostcardCost = 0.61;
		 MediaMailRate = 0.72;
		 MediaMailEach = 4.47;
	 }
	 public static void main(String[] args)
	 {
		 Postage ps = new Postage(); //Instance of Postage
		 ps.sendThis(); //call sendThis
	 }
		
		
	 public void sendThis()
	 {
		 getData(); //call getData
		 calculateCost(); //call calculateCost
		 printInfo(); //call printInfo
	}
	 //This method prompts the user for the type of mail and checks if
	 //it is a valid number also.
	 public byte getData()
	 {
		 Scanner input = new Scanner(System.in);
		 System.out.print("\n\n\nWelcome to the US Post Office.");
		 System.out.print("\n\n\n Please choose the category of your postage.");
		 System.out.print("\n(1) First class, domestic");
		 System.out.print("\n(2) Postcards, domestic");
		 System.out.print("\n(3) Media Mail");
		 System.out.print("\n\n\nUsing the menu above, please enter the category of your postage.");
		 choice = input.nextByte();
		 if(choice > 3 || choice <= 0)
		 {
			 System.out.print("\n\n\nPlease enter a valid postage class!");
			 System.out.print("\n\nHave a nice day!");
			 
		 }
		 return choice;
	}


	//Method for all the calculations. 
	public void calculateCost()
	{
		Scanner input2 = new Scanner(System.in);
		
		if(choice == 1)
		{
			 System.out.print("Please enter your weight in ounces (integer).");
			 weight = input2.nextInt();
			 price = (weight - 1) * FirstClassRate + FirstClassEach; //FirstClassRate is 0.29,  FirstClassEach is 0.78
		}
		else if(choice == 2)
		{
			weight = 0;
			price = PostcardCost; //PostcardCost is 0.61
		}
		
		else if(choice == 3)
		{
			System.out.print("Please enter your weight in pounds (integer).");
			weight = input2.nextInt();
			price = (weight-1) * MediaMailRate + MediaMailEach; //MediaMailRate is 0.72, MediaMailEach is 4.47
		}
		
		return; //return nothing, so it's fine.
	}
	
	//Printing the information
	public void printInfo()
	{
		String outWeight = new String("");
		String typeName = new String("");
		String dollar = new String("$");
		
		
			if (choice == 1 && weight != 1)
			{
				outWeight= weight+ " ounces";
				typeName = "First class, domestic";
			}
			else if(choice == 1 && weight == 1) //"1" will be a single unit
			{
				outWeight = weight + " ounce";
				typeName = "First class, domestic";
			}
			
			else if(choice == 2)
			{
				outWeight = "--";
				typeName = "Postcards, domestic";
			}
			else if(choice == 3 && weight == 1) //"1" will be a single unit
			{
				outWeight = weight + " pound";
				typeName = "Media Mail";
			}
			else if(choice == 3)
			{
				outWeight = weight + " pounds";
				typeName = "Media Mail";
			}
			
			
			System.out.print("\n\n\n");
			if (choice == 1) //print normal
			{
				System.out.printf("Your type of mail was: %31s%n%n", typeName);
				System.out.printf("Your weight was: %25s%n%n", outWeight);
				System.out.printf("Your mail costs: %17s%-17.2f%n%n", dollar, price);
				System.out.print("\nHave a nice day!");
		    } 
		    if (choice == 2) //print normal
		    {
				System.out.printf("Your type of mail was: %31s%n%n", typeName);
				System.out.printf("Your weight was: %22s%n%n", outWeight);
				System.out.printf("Your mail costs: %19s%-19.2f%n%n", dollar, price);
				System.out.print("\nHave a nice day!");
			}
			
		    else if(choice == 3) //print normal messages.
		    {
				System.out.printf("Your type of mail was: %21s%n%n", typeName);
				System.out.printf("Your weight was: %24s%n%n", outWeight);
				System.out.printf("Your mail costs: %18s%-18.2f%n%n", dollar, price);
				System.out.print("\nHave a nice day!");
			}
			else if(choice > 3 || choice <= 0) //print nothing, invalid number.
			{
				System.out.print("\n\n\n");
			}
			
			
	}
			
}
	




