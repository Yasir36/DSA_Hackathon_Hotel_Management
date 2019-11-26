import java.util.*;
//bigroom class
class Bigroom{
	Scanner input=new Scanner(System.in);
	 private String name;
 
 private String phonenumber;
 //booking and giving details
  public void booking()
  {
    System.out.println("Enter name:");
     name=input.nextLine();
     System.out.println();
    System.out.println("Enter phonenumber:"); 
    phonenumber=input.nextLine();

  }

}