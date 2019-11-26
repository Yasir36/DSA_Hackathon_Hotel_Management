import java.util.*;
//starting rooms class
class Rooms{
   
  private int[] bigroom=new int[10];
  private int[] smallroom=new int[5];
  private int id;
  int countb=0;
  int counts=0;
 int remainb=bigroom.length-countb;
 int remains=smallroom.length-counts;
//Constructor
//in contructor switch statement is being used for booking and facilities;
  public void rooms()
   {

   	Scanner input=new Scanner(System.in);
   	LinkedList l=new LinkedList();
   	
    System.out.print("Hello!! Sir how may i help you");
    System.out.println("1:Big Rooms");
    System.out.println("2: Small Rooms");
    System.out.println("3.Avaibility");
    System.out.println("4:Room Facility");
    int r=input.nextInt();
    //SwitchStatement starts;
    switch(r){
    	case 1:
    	   if(countb==bigroom.length){
    		System.out.println("Sorry sir you are late");
    	}
    	else{
    		Bigroom br=new Bigroom();
    		br.booking();

    		l.add(countb);
    		System.out.println("Room is Booked");
    		System.out.println();
    		System.out.print("Your room number is"+countb);
    		System.out.println("Your id is"+countb);

    		countb++;
    	}
    	break;
    	
    	case 2:
    	
    		 if(counts==smallroom.length){
    		System.out.println("Sorry sir you are late");
    	}
    	else{
    		Bigroom br=new Bigroom();
    		br.booking();
    		l.add(counts);
    		System.out.println("Room is booked");
    		System.out.println();
    		System.out.println("Your room number is"+counts);
    		System.out.println("Your id is"+counts);
    		counts++;

    	}
    	break;
    
    	case 3:
    	    
    	   System.out.print("Big Rooms available:"+remainb);
    	   
    	   System.out.println("Small room avaiable:"+remains);
    	   //Conditions if rooms are full!!
    	    if(countb==bigroom.length)
    	    	{System.out.println("Sorry sir! There is no free room");}
    	    if(counts==smallroom.length)
    	    {
    	    	System.out.println("There is no free room");
    	    }
    	     System.out.println("Go back");
    	     char a='Y';
    	     char c=input.next().charAt(0);
    	     if(c.equalsIgnoreCase('Y')){
    	     	back();
    	     }
    	    break;
    	    
         case 4:
           RoomFacility rf=new RoomFacility();
           System.out.println("Big room facility:");
           //calls bigroom facility 
             rf.bigroom();
             System.out.println();
             System.out.println("Small room facility");
             //calls smallroom facility/.
             rf.smallroom();



    } // room method over :);
}

 public void back(){
 	rooms();
 }


}
