import java.util.Scanner;

class HotelInterface{
	Scanner sc;
	public HotelInterface()
	{
		display();
	}
	private void display()
	{
		System.out.println("Welcome To Hotel Management System!");
		System.out.println("1.Accomodation");
		System.out.println("2.Car Rental");
		System.out.println("3.Food");
		System.out.println("4.Exit");
		sc = new Scanner(System.in);
		System.out.println("\n Your Input : ");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				new Rooms().rooms();
				break;
			case 2:
				CarRental c = new CarRental();
				break;
			case 3:
				FoodMenu f = new FoodMenu();
				f.menu();
				f.display();
			case 4:
				System.exit(0);
			default:
				System.out.println("Wrong input!");
				display();
		}
	}
}