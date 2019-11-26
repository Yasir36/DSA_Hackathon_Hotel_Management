import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class CarRental{
	Car car;
	List<Car> availableCars;
	List<Car> rentedCars;
	int count;
	Scanner sc;
	public CarRental()
	{
		availableCars = new ArrayList<>();
		rentedCars = new ArrayList<>();
		display();
	}
	public void addCar(int modelNo,String manufacturer,float rentPrice){
		car = new Car();
		car.setModelNo(1);
		car.setManufacturer("HONDA");
		car.setRentPrice(50000.89);
		availableCars.add(car);
		count++;
		car = new Car();
		car.setModelNo(2);
		car.setManufacturer("Toyota");
		car.setRentPrice(50000.89);
		availableCars.add(car);
		count++;
		car = new Car();
		car.setModelNo(3);
		car.setManufacturer("Mercedes");
		car.setRentPrice(50000.89);
		availableCars.add(car);
		count++;
	}
	public void rentCar(int i)
	{
		if(i>-1 && i<availableCars.size()){
			rentedCars.add(availableCars.get(i));
			availableCars.remove(i);
			count--;
		}
		else
			System.out.println("ERROR 404 : CAR NOT FOUND!!");
	}
	public void display()
	{
		sc = new Scanner(System.in);
		System.out.println("Car Rental System!");
		printList();
		System.out.println("Which Car Do You Want To Rent?(press 0 to go back)");
		int choice = sc.nextInt();
		if(choice == 0)
			new HotelInterface();
		else if(choice >0 && choice <=availableCars.size()){
			rentCar(choice);
			System.out.println("Car Rented Successfully!Enjoy your new ride while it lasts!");
		}
		else{
			System.out.println("wrong choice!");
			display();
		}
	}
	private void printList()
	{
		for(int i=0;i<=count);i++){
			System.out.println(" CAR "+i+1);
			System.out.println("MODEL NO:"+availableCars.get(i).getModelNo());
			System.out.println("MANUFACTURER :"+availableCars.get(i).getManufacturer());
			System.out.println("RENTPRICE :"+availableCars.get(i).getRentPrice());
		}																																																																																											
	}
}