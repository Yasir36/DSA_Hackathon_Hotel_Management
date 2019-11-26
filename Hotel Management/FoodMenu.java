import java.util.Scanner;
import java.util.ArrayList;

class FoodMenu{
	ArrayList<String> foods = new ArrayList<String>();
	int total = 0;int choice;

	// we are adding a method for menu
	public void menu(){
		foods.add("1- chicken Meal - 150 R.S");
		foods.add("2- Beef Meal - 200 R.S");
		foods.add("3- Vegitable Meal - 120 R.S");
		foods.add("4- Done");
		foods.add("5- Cancel");	 
		

		
	}

	//method for printing ArrayList
	public void display(){
		System.out.println("******Order Menu*******");
		for(String food: foods){
			
			System.out.println(food);
		}
		System.out.println("Please Enter Your Choice");
		Scanner sc = new Scanner(System.in);
		 choice = sc.nextInt();
		 searchFood();
	}


	//method for chosing food
	public void searchFood(){
		System.out.println();
		if(choice == 1){
				total += 150;	
				display();
				}
		else if(choice == 2){
				total += 200;
				display();
			}
			
		else if(choice == 3){
				total += 120;
				display();
			}
		else if(choice == 4){
				System.out.println("Your Total Is: "+total);
				System.out.println("Thank you for choosing our restorant. Hope to see you again");

			}
		else if(choice == 5){
				System.out.println("Thank you fr coming");
			}
		else{
				System.out.println("Sorry We Can't have this value");
		}
		
	}

}