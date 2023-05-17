package bike;
import java.util.Random;


import java.util.Scanner;



public class bike 
{

    
    String name;
    long mobileNumber;
    private int customerid; // Only readable
    String bikeName;

    Scanner sc = new Scanner(System.in); 
    
    
	public int getCustomerid() // only readable
	{
		return customerid;
	}
	
	//static block (for greeting)
	static
	{
		System.out.println("**************************************************************************************");
		System.out.println("");
		System.out.println("Welcome To Bike Showroom");
		System.out.println("");
		System.out.println("**************************************************************************************");
		System.out.println("");
	}
	
	 // Constructor Chaining
   bike(String name,long mobileNumber,int customerid)
    {
        this(name,mobileNumber);
        this.customerid=customerid;

    }

    bike(String name,long mobileNumber)
    {
        this(mobileNumber);
        this.name = name;
    }

    bike(long mobileNumber)
    {
        this.mobileNumber= mobileNumber;
    }

    bike(String bikeName)
    {
        this.bikeName=bikeName;
    }

    bike()
    {

    }

    
	
	
	@Override
	public String toString() 
	{
		 System.out.println("*********************Customer Details**************************");
         //System.out.println("");
         System.out.println("name:\n"         +             name);
         System.out.println("Mobile Number:\n"+     mobileNumber);
         System.out.println("CustomerID:\n"   +       customerid);
         //System.out.println("");
         System.out.println("******************Registered Successfully************************");  
          return "";
		
	}
	
	 public int Customerid()
	    {
	        Random rand = new Random();
	        int customerid = rand.nextInt(2000);
	        System.out.println("CustomerID will asign automatically.");
	        return customerid;
	    }

	    public long Mobilenum()
	    {   //Scanner sc = new Scanner(System.in);
	        System.out.println("");
	        System.out.println("Enter mobile number");
	        System.out.println("===================");
	        long mobileNumber=sc.nextLong();
	        return mobileNumber;
	    }

	     public String CustomerName()
	    {
	        System.out.println("Enter your name:");
	        System.out.println("================");
	        String name = sc.nextLine();
	        return name;
	    } 


	public static void main(String[] args) 
	{
		 
		bike c1 = new bike(); // For calling Customerid Method
        
        String name = c1.CustomerName();
        long mobileNumber = c1.Mobilenum();
        int customerid = c1.Customerid();

        bike customerdetails = new bike(name, mobileNumber,customerid); // address has been override by data.
        System.out.println(customerdetails);

        System.out.println("Hello "+ name +", Myself Java Compilier, May I know your interest in which bike ? ");
        
          Details.bikedetails();    

	}




//Details of bikes present in Showroom.
class Details
 {
     public static void bikedetails()
     { Scanner sc = new Scanner(System.in);
         int a;
         System.out.println("");
         System.out.println("Press 1 to Enter in to  ===> bike Showroom");
         System.out.println("");
         System.out.println("Enter below:");
         a = sc.nextInt();
         System.out.println("");
         
         switch(a)
         {
          case 1: 
         System.out.println("*************************************"); 
         System.out.println("Welcome to bike Showroom");
         System.out.println("*************************************"); 

         Showroom.range(); // Operation start from here
         break;
  
         }
             
     }

 }


//Here bike/scooty is mention
class Showroom
{     
 public static void  range()  // No need to create non Static method because range() will share same memory for all instance(Object)
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Mention your choice so that it will easy for us to filter out best bike for You ");
     System.out.println("");
     System.out.println("Do you looking for bike ?");
     System.out.println("If Yes, Press ===> 1");
     System.out.println("");
     System.out.println("Do you looking for scooty ?");
     System.out.println("If Yes, Press ===> 2");

     double a= sc.nextDouble();
     System.out.println(""); 

     if(a==1)
         {

             bikes.bike(); 
               
         }
          else  
         {
            bikes.scooty();          
         } 

 }


public static void Payment(double price) // Parameterized Method ====> Payment Method
{   Scanner sc = new Scanner(System.in);
    
    System.out.println("How would you like do payment via:");
    System.out.println("==================================");
    System.out.println("For UPI         ===> press 1");
    System.out.println("For Credit card ===> press 2");
    System.out.println("For Cash        ===> press 3");

    int p = sc.nextInt();

     // work here for user input , moved price variable on global area
    double discountPrice;

    switch(p)     // I have use switch for payment in details
    {
        case 1: 
        System.out.println("==============================================");
        System.out.println("You have to pay Rupees\t"+price+
                           "\nPlease enter amount after Scanning barcode\n "+
                           "Enter Amount here");

         // Unless user won't enter correct amount he have to enter amount again and again.                  
        do                
        {   double pay = sc.nextDouble();
            if(pay!=price)
            {
                System.out.println("Please enter required amount\t"+price);
            }
            else{
                break;
            }
        }
        while(true);

        System.out.println("");
        System.out.println("************Successfully Paid****************");
        System.out.println("");

        OtherStuff.WouldYou();
        System.out.println("");

        break;

        case 2:
        System.out.println("==============================================");
    
        System.out.println("But if you are using ICICI credit card");
        System.out.println("then you will get 12% Off discount on MRP");
        System.out.println("");
        System.out.println("Press 1 ===> using ICICI Credit Card \n"+
                           "Press 2 ===> other credit card, No discount on it");
        System.out.println("*****");
    

        int y = sc.nextInt();

        if (y==1)
        {
            System.out.println("You have to pay rupees:\t"+ price);
            System.out.println("x");
            System.out.println("Ohooooh :-) you can avail offer of 12% discount ");
            System.out.println("**********************************************");
            discountPrice= price-(price*12/100);
            System.out.println("Congrats  you have to pay rupees:\t" + Math.round(discountPrice)+"/-");
            
            double saveMoney= price - discountPrice;
            System.out.println("**********************************************");
            System.out.println( "You have saved rupees:\t"+(Math.round(saveMoney)+"/-")); // For round off discount value
            System.out.println("**********************************************");
            System.out.println("Please swip your ICICI credit card.");
            System.out.println("");
            System.out.println("***********Transcation Successful*************");
            System.out.println("");
            OtherStuff.WouldYou();
        } else 
        {
            System.out.println("You have to pay Rupees:\t" + price
            + "\nPlease Swipe your Credit card \n");
            System.out.println("**********************************************");
            System.out.println("***********Transcation Successful*************");
            System.out.println("");
            OtherStuff.WouldYou();
            
        }

        break;

        case 3:
        System.out.println("Please pay the cash to the cash counter");
        System.out.println("Give the cash in multiple of 500 or Exact amount");
        System.out.println("");
        System.out.println("Enter amount(Cash):");
        double pay = sc.nextDouble();
        System.out.println("****************************************************");
        if(pay>=price)
        {
            double takeChange = pay - price;
            Math.round(takeChange);
           
         if(takeChange!=0)
            {                  
                System.out.println("Please collect your change:\t"+takeChange+"/-");
                System.out.println("");
                OtherStuff.WouldYou();
            }
         else 
            {
                OtherStuff.WouldYou();                  
            }
                
        } else 
        {
            System.out.println("Not enough cash ");
            System.out.println("Please try any other payment method");
            System.out.println("");
            System.out.println("***********Redirecting to Payment method Selection*********************");
            System.out.println("");
            Showroom.Payment(price);
        }                          
        

    }
        
}

}
                       
class OtherStuff 
{ 
public static void Thankyou() // To avoid Code repeatation
{
    System.out.println("Thankyou :-)");
    System.out.println("Have a nice day Sir, Visit again");
    

}

public static void WouldYou()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Any thing else, Sir");
    System.out.println("Press 1 ===> Go back to Budget range Section");
    System.out.println("Press 2 ===> No, Thanks");
    System.out.println("*******************************");
    int w = sc.nextInt();

    if(w==1)
    {  
       Showroom.range();
    }
    else 
    {   System.out.println("*****************************");
        Thankyou();
        System.out.println("*****************************");
    }
}




}

//All bike list according to your output.
class bikes extends Showroom
{
	public static void bike()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("List of bikes according to you");
        System.out.println("==============================================");
        System.out.println(" Honda Shine ");
        System.out.println(" Price : 87,897 ");
        System.out.println("");
        System.out.println(" Honda Hornet ");
        System.out.println(" Price : 1,36,250 ");
        System.out.println("");
        System.out.println(" Hero Spelender ");
        System.out.println(" Price : 76,050 ");
        System.out.println("");
        System.out.println(" Hero HF_Delux ");
        System.out.println(" Price : 68,500 ");
        System.out.println("");
        System.out.println(" RE Bullet 350 ");
        System.out.println(" Price : 1,70,000 ");
        System.out.println("");
        System.out.println(" RE Bullet Classic 350 ");
        System.out.println(" Price : 1,90,000 ");
        System.out.println("");
        System.out.println(" Yamaha MT15 ");
        System.out.println(" Price : 1,50,000 ");
        System.out.println("");
        System.out.println(" Yamaha FzS ");
        System.out.println(" Price : 1,26,000 ");
        System.out.println("");
        System.out.println(" Suzuki Gixxer ");
        System.out.println(" Price : 1,98,000 ");
        System.out.println("");
        System.out.println(" Suzuki Avenger ");
        System.out.println(" Price : 1,27,900 ");
        System.out.println("");
        
        
        System.out.println("***********************************************");
        System.out.println("Press 1 ===> Honda Shine ");
        System.out.println("Press 2 ===> Honda Hornet ");
        System.out.println("Press 3 ===> Hero Spelender ");
        System.out.println("Press 4 ===> Hero HF_Delux ");
        System.out.println("Press 5 ===> RE Bullet 350 ");
        System.out.println("Press 6 ===> RE Bullet Classic 350 ");
        System.out.println("Press 7 ===> Yamaha MT15 ");
        System.out.println("Press 8 ===> Yamaha FzS ");
        System.out.println("Press 9 ===> Suzuki Gixxer ");
        System.out.println("Press 10 ===> Suzuki Avenger ");
        
        
        System.out.println("***********************************************");
        int b = sc.nextInt();
        System.out.println("***********************************************");
        
        switch(b)
        {
        
        case 1:
        	
            System.out.println("You have selected Honda Shine ");
            System.out.println("");
            System.out.println("There is two colour option in this model");
            System.out.println("Which colour you will prefer, Sir?");
            System.out.println("*******************************************");
            Honda_Shine  b1 = new  Honda_Shine();
            b1.spec();
            
            break;
            
        case 2:
        	
        	 System.out.println("You have selected Honda Hornet ");
             System.out.println("");
             System.out.println("There is two colour option in this model");
             System.out.println("Which colour you will prefer, Sir?");
             System.out.println("*******************************************");
             Honda_Hornet b2 = new Honda_Hornet();
             b2.spec();
             
             break;
            	 
        case 3:
        	
       	 	System.out.println("You have selected Hero Spelender ");
            System.out.println("");
            System.out.println("There is two colour option in this model");
            System.out.println("Which colour you will prefer, Sir?");
            System.out.println("*******************************************");
            Hero_Spelender b3 = new Hero_Spelender();
            b3.spec();
            
            break;
            
            
        case 4:
        	
       	 	System.out.println("You have selected Hero HF_Delux ");
            System.out.println("");
            System.out.println("There is two colour option in this model");
            System.out.println("Which colour you will prefer, Sir?");
            System.out.println("*******************************************");
            Hero_HF_Delux b4 = new Hero_HF_Delux();
            b4.spec();
            
            break;
            
            
        case 5:
        	
       	 	System.out.println("You have selected RE Bullet 350 ");
            System.out.println("");
            System.out.println("There is two colour option in this model");
            System.out.println("Which colour you will prefer, Sir?");
            System.out.println("*******************************************");
            RE_Bullet_350 b5 = new RE_Bullet_350();
            b5.spec();
            
            break;
            	
            
        case 6:
        	
       	 	System.out.println("You have selected RE Bullet Classic 350 ");
            System.out.println("");
            System.out.println("There is two colour option in this model");
            System.out.println("Which colour you will prefer, Sir?");
            System.out.println("*******************************************");
            RE_Bullet_Classic_350 b6 = new  RE_Bullet_Classic_350();
            b6.spec();
            
            break;
            
        case 7:
        	
       	 	System.out.println("You have selected Yamaha MT15 ");
            System.out.println("");
            System.out.println("There is two colour option in this model");
            System.out.println("Which colour you will prefer, Sir?");
            System.out.println("*******************************************");
            Yamaha_MT15 b7 = new Yamaha_MT15();
            b7.spec();
            
            break;
            	
            
        case 8:
        	
       	 	System.out.println("You have selected Yamaha FzS ");
            System.out.println("");
            System.out.println("There is two colour option in this model");
            System.out.println("Which colour you will prefer, Sir?");
            System.out.println("*******************************************");
            Yamaha_FzS b8 = new Yamaha_FzS();
            b8.spec();
            
            break;
            	
            
        case 9:
        	
       	 	System.out.println("You have selected Suzuki Gixxer ");
            System.out.println("");
            System.out.println("There is two colour option in this model");
            System.out.println("Which colour you will prefer, Sir?");
            System.out.println("*******************************************");
            Suzuki_Gixxer b9 = new Suzuki_Gixxer();
            b9.spec();
            
            break;
            	
            
        case 10:
        	
       	 	System.out.println("You have selected Suzuki Avenger ");
            System.out.println("");
            System.out.println("There is two colour option in this model");
            System.out.println("Which colour you will prefer, Sir?");
            System.out.println("*******************************************");
            Suzuki_Avenger b10 = new Suzuki_Avenger();
            b10.spec();
            
            break;
            
            		
        }
        
        
	}
	
	public static void scooty()
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.println("List of scooty according to you ");
	        System.out.println("==============================================");
	        System.out.println(" Honda Activa ");
	        System.out.println(" Price : 88,996 ");
	        System.out.println("");
	        System.out.println(" Honda Activa 125 ");
	        System.out.println(" Price : 92,000 ");
	        System.out.println("");
	        System.out.println(" Tvs Ntorque ");
	        System.out.println(" Price : 1,00,000 ");
	        System.out.println("");
	        System.out.println(" Tvs Jupiter ");
	        System.out.println(" Price : 70,000 ");
	        System.out.println("");
	        System.out.println(" Yamaha Fascino ");
	        System.out.println(" Price : 70,000 ");
	        System.out.println("");
	        System.out.println(" Yamaha Ray ZR ");
	        System.out.println(" Price : 78,000 ");
	        System.out.println("");
	        System.out.println(" Suzuki Burgman ");
	        System.out.println(" Price : 97,500 ");
	        System.out.println("");
	        System.out.println(" Suzuki Access 125 ");
	        System.out.println(" Price : 95,550 ");
	        System.out.println("");
	        
	        System.out.println("***********************************************");
	        System.out.println("Press 1 ===> Honda Activa ");
	        System.out.println("Press 2 ===> Honda Activa 125 ");
	        System.out.println("Press 3 ===> Tvs Ntorque ");
	        System.out.println("Press 4 ===> Tvs Jupiter ");
	        System.out.println("Press 5 ===> Yamaha Fascino ");
	        System.out.println("Press 6 ===> Yamaha Ray ZR ");
	        System.out.println("Press 7 ===> Suzuki Burgman ");
	        System.out.println("Press 8 ===> Suzuki Access 125 ");
	        
	        System.out.println("***********************************************");
	        int b = sc.nextInt();
	        System.out.println("***********************************************");
	        
	        switch(b)
	        {
	        
	        case 1:
	            System.out.println("You have selected Honda Activa");
	            System.out.println("");
	            System.out.println("There is two colour option in this model,");
	            System.out.println("Which colour you will prefer, Sir?");
	            System.out.println("*******************************************");
	            Honda_Activa b1 = new Honda_Activa();
	            b1.spec();
	            
	            break;
	            
	            
	            
	        case 2:
	            System.out.println("You have selected Honda Activa 125");
	            System.out.println("");
	            System.out.println("There is two colour option in this model,");
	            System.out.println("Which colour you will prefer, Sir?");
	            System.out.println("*******************************************");
	            Honda_Activa_125 b2 = new  Honda_Activa_125();
	            b2.spec();
	            
	            break;
	            
	            
	            
	        case 3:
	            System.out.println("You have selected Tvs Ntorque ");
	            System.out.println("");
	            System.out.println("There is two colour option in this model,");
	            System.out.println("Which colour you will prefer, Sir?");
	            System.out.println("*******************************************");
	            Tvs_Ntorque b3 = new Tvs_Ntorque();
	            b3.spec();
	            
	            break;
	            
	            
	            
	        case 4:
	            System.out.println("You have selected Tvs Jupiter");
	            System.out.println("");
	            System.out.println("There is two colour option in this model,");
	            System.out.println("Which colour you will prefer, Sir?");
	            System.out.println("*******************************************");
	            Tvs_Jupiter b4 = new Tvs_Jupiter();
	            b4.spec();
	            
	            
	            break;
	            
	            
	            
	        case 5:
	            System.out.println("You have selected Yamaha Fascino");
	            System.out.println("");
	            System.out.println("There is two colour option in this model,");
	            System.out.println("Which colour you will prefer, Sir?");
	            System.out.println("*******************************************");
	            Yamaha_Fascino b5 = new Yamaha_Fascino();
	            b5.spec();
	            
	            break;
	            
	            
	        case 6:
	            System.out.println("You have selected Yamaha Ray ZR");
	            System.out.println("");
	            System.out.println("There is two colour option in this model,");
	            System.out.println("Which colour you will prefer, Sir?");
	            System.out.println("*******************************************");
	            Yamaha_Ray_ZR b6 = new Yamaha_Ray_ZR();
	            b6.spec();
	            
	            break;
	            
	            
	        case 7:
	            System.out.println("You have selected Suzuki Burgman");
	            System.out.println("");
	            System.out.println("There is two colour option in this model,");
	            System.out.println("Which colour you will prefer, Sir?");
	            System.out.println("*******************************************");
	            Suzuki_Burgman b7 = new Suzuki_Burgman();
	            b7.spec();
	            
	            break;
	            
	            
	        case 8:
	            System.out.println("You have selected Suzuki Access 125");
	            System.out.println("");
	            System.out.println("There is two colour option in this model,");
	            System.out.println("Which colour you will prefer, Sir?");
	            System.out.println("*******************************************");
	            Suzuki_Access_125 b8 = new Suzuki_Access_125();
	            b8.spec();
	            
	            break;
	            
	            
	        }
	        
	        
	}
	
}


//Object is created for Particuler bikes/scooty in above class
class  Honda_Shine extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 87897 ;
	String bikeName = "Honda_Shine";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Honda");
	       System.out.println("Bike Name:              Shine");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        150cc");
	       System.out.println("Mileage:                55-60Kmpl");
	       System.out.println("Fuel Tank Capacity:     13L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Honda");
	 	       System.out.println("Bike Name:              Shine");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        150cc");
	 	       System.out.println("Mileage:                55-60Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     13L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Honda_Shine  b1 = new  Honda_Shine();
	        System.out.println(b1); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different HP model.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
	   
}


class  Honda_Hornet extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 136250 ;
	String bikeName = "Honda_Hornet";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Honda");
	       System.out.println("Bike Name:              Hornet");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        150cc");
	       System.out.println("Mileage:                55-60Kmpl");
	       System.out.println("Fuel Tank Capacity:     14L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Honda");
	 	       System.out.println("Bike Name:              Hornet");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        150cc");
	 	       System.out.println("Mileage:                55-60Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     14L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Honda_Hornet b2 = new Honda_Hornet();
	        System.out.println(b2); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
	   
}


class  Hero_Spelender extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 76050 ;
	String bikeName = "Hero_Spelender";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Hero");
	       System.out.println("Bike Name:              Spelender");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        125cc");
	       System.out.println("Mileage:                55-60Kmpl");
	       System.out.println("Fuel Tank Capacity:     11L");
	       System.out.println("Front Break:            Drum break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Hero");
	 	       System.out.println("Bike Name:              Spelender");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        125cc");
	 	       System.out.println("Mileage:                55-60Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     11L");
	 	       System.out.println("Front Break:            Drum break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	       Hero_Spelender b3 = new Hero_Spelender();
	        System.out.println(b3); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
	   
}


class  Hero_HF_Delux extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 68500 ;
	String bikeName = "Hero_HF_Delux";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Hero");
	       System.out.println("Bike Name:              HF Delux");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        125cc");
	       System.out.println("Mileage:                55-60Kmpl");
	       System.out.println("Fuel Tank Capacity:     11L");
	       System.out.println("Front Break:            Drum break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	           System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Hero");
	 	       System.out.println("Bike Name:              HF Delux");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        125cc");
	 	       System.out.println("Mileage:                55-60Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     11L");
	 	       System.out.println("Front Break:            Drum break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Hero_HF_Delux b4 = new Hero_HF_Delux();
	        System.out.println(b4); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
	   
}


class  RE_Bullet_350 extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 170000 ;
	String bikeName = "RE_Bullet_350";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Royal Enfield");
	       System.out.println("Bike Name:              Bullet 350");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        350cc");
	       System.out.println("Mileage:                40-50Kmpl");
	       System.out.println("Fuel Tank Capacity:     15L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	           System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Royal Enfield");
	 	       System.out.println("Bike Name:              Bullet 350");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        350cc");
	 	       System.out.println("Mileage:                40-50Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     15L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        RE_Bullet_350 b5 = new RE_Bullet_350();
	        System.out.println(b5); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
}

class  RE_Bullet_Classic_350 extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 190000 ;
	String bikeName = "RE_Bullet_Classic_350";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Royal Enfield");
	       System.out.println("Bike Name:              Classic Bullet 350");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        350cc");
	       System.out.println("Mileage:                40-50Kmpl");
	       System.out.println("Fuel Tank Capacity:     15L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Royal Enfield");
	 	       System.out.println("Bike Name:              Classic Bullet 350");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        350cc");
	 	       System.out.println("Mileage:                40-50Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     15L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        RE_Bullet_Classic_350 b6 = new  RE_Bullet_Classic_350();
	        System.out.println(b6); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
	   
}


class  Yamaha_MT15 extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 150000 ;
	String bikeName = "Yamaha_MT15";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Yamaha");
	       System.out.println("Bike Name:              MT15");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        155cc");
	       System.out.println("Mileage:                45-55Kmpl");
	       System.out.println("Fuel Tank Capacity:     13L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Yamaha");
	 	       System.out.println("Bike Name:              MT15");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        155cc");
	 	       System.out.println("Mileage:                45-55Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     13L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Yamaha_MT15 b7 = new Yamaha_MT15();
	        System.out.println(b7); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
	   
}

class  Yamaha_FzS extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 126000 ;
	String bikeName = "Yamaha_FzS";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Yamaha");
	       System.out.println("Bike Name:              FzS");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        150cc");
	       System.out.println("Mileage:                45-55Kmpl");
	       System.out.println("Fuel Tank Capacity:     13L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Yamaha");
	 	       System.out.println("Bike Name:              FzS");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        155cc");
	 	       System.out.println("Mileage:                45-55Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     13L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Yamaha_FzS b8 = new Yamaha_FzS();
	        System.out.println(b8); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
		
   }


}

class  Suzuki_Gixxer extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 198000 ;
	String bikeName = "Suzuki_Gixxer";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Suzuki");
	       System.out.println("Bike Name:              Gixxer");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        150cc");
	       System.out.println("Mileage:                45-55Kmpl");
	       System.out.println("Fuel Tank Capacity:     13L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Suzuki");
	 	       System.out.println("Bike Name:              Gixxer");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        155cc");
	 	       System.out.println("Mileage:                45-55Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     13L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Suzuki_Gixxer b9 = new Suzuki_Gixxer();
	        System.out.println(b9); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
		
}

class  Suzuki_Avenger extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 127900 ;
	String bikeName = "Suzuki_Avenger";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Suzuki");
	       System.out.println("Bike Name:              Avenger");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        150cc");
	       System.out.println("Mileage:                45-55Kmpl");
	       System.out.println("Fuel Tank Capacity:     13L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Suzuki");
	 	       System.out.println("Bike Name:              Avenger");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        155cc");
	 	       System.out.println("Mileage:                45-55Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     13L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Suzuki_Avenger b10 = new Suzuki_Avenger();
	        System.out.println(b10); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
		
}

class  Honda_Activa extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 88996 ;
	String bikeName = "Honda_Activa";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Honda");
	       System.out.println("Bike Name:              Activa");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        100cc");
	       System.out.println("Mileage:                55-60Kmpl");
	       System.out.println("Fuel Tank Capacity:     5L");
	       System.out.println("Front Break:            Drum break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Honda");
	 	       System.out.println("Bike Name:              Activa");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        100cc");
	 	       System.out.println("Mileage:                55-60Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     5L");
	 	       System.out.println("Front Break:            Drum break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Honda_Activa b11 = new Honda_Activa();
	        System.out.println(b11); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
		
}


class  Honda_Activa_125 extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 92000 ;
	String bikeName = "Honda_Activa_125";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Honda");
	       System.out.println("Bike Name:              Activa 125");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        125cc");
	       System.out.println("Mileage:                55-60Kmpl");
	       System.out.println("Fuel Tank Capacity:     5L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Honda");
	 	       System.out.println("Bike Name:              Activa 125");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        125cc");
	 	       System.out.println("Mileage:                55-60Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     5L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Honda_Activa_125 b2 = new  Honda_Activa_125();
	        System.out.println(b2); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
		
}


class  Tvs_Ntorque extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 100000 ;
	String bikeName = "Tvs_Ntorque";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Tvs");
	       System.out.println("Bike Name:              Ntorque");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        125cc");
	       System.out.println("Mileage:                55-60Kmpl");
	       System.out.println("Fuel Tank Capacity:     5L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Tvs");
	 	       System.out.println("Bike Name:              Ntorque");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        125cc");
	 	       System.out.println("Mileage:                55-60Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     5L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Tvs_Ntorque b3 = new Tvs_Ntorque();
	        System.out.println(b3); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
		
}


class  Tvs_Jupiter extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 100000 ;
	String bikeName = "Tvs_Jupiter";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Tvs");
	       System.out.println("Bike Name:              Jupiter");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        125cc");
	       System.out.println("Mileage:                55-60Kmpl");
	       System.out.println("Fuel Tank Capacity:     5L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Tvs");
	 	       System.out.println("Bike Name:              Jupiter");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        125cc");
	 	       System.out.println("Mileage:                55-60Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     5L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Tvs_Jupiter b4 = new Tvs_Jupiter();
	        System.out.println(b4); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
		
}


class  Yamaha_Fascino extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 75000 ;
	String bikeName = "Yamaha_Fascino";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Yamaha");
	       System.out.println("Bike Name:              Fascino");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        125cc");
	       System.out.println("Mileage:                55-60Kmpl");
	       System.out.println("Fuel Tank Capacity:     5L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Yamaha");
	 	       System.out.println("Bike Name:              Fascino");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        125cc");
	 	       System.out.println("Mileage:                55-60Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     5L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Yamaha_Fascino b5 = new Yamaha_Fascino();
	        System.out.println(b5); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
		
}


class  Yamaha_Ray_ZR extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 78000 ;
	String bikeName = "Yamaha_Ray_ZR";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Yamaha");
	       System.out.println("Bike Name:              Ray ZR");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        125cc");
	       System.out.println("Mileage:                55-60Kmpl");
	       System.out.println("Fuel Tank Capacity:     5L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Yamaha");
	 	       System.out.println("Bike Name:              Ray ZR");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        125cc");
	 	       System.out.println("Mileage:                55-60Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     5L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Yamaha_Ray_ZR b6 = new Yamaha_Ray_ZR();
	        System.out.println(b6); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
		
}


class  Suzuki_Burgman extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 97000 ;
	String bikeName = "Suzuki_Burgman";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Suzuki");
	       System.out.println("Bike Name:              Burgman");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        125cc");
	       System.out.println("Mileage:                55-60Kmpl");
	       System.out.println("Fuel Tank Capacity:     5L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Suzuki");
	 	       System.out.println("Bike Name:              Burgman");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        125cc");
	 	       System.out.println("Mileage:                55-60Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     5L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Suzuki_Burgman b7 = new Suzuki_Burgman();
	        System.out.println(b7); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
		
}


class  Suzuki_Access_125 extends bike
{
	Scanner sc = new Scanner(System.in);
	double price = 95550 ;
	String bikeName = "Suzuki_Burgman";
	bike bname = new bike(bikeName);
	
	 public String toString()  // toString() Method has been used.
	    {  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press 1 ===> Silver");
	        System.out.println("Press 2 ===> Black ");
	        System.out.println("");
	        int c = sc.nextInt();

	        if(c == 1)
	        {
	       System.out.println("*******************************************");
	       System.out.println("Brand:                  Suzuki");
	       System.out.println("Bike Name:              Access 125");
	       System.out.println("Colour:                 Silver");
	       System.out.println("Engine Capacity:        125cc");
	       System.out.println("Mileage:                55-60Kmpl");
	       System.out.println("Fuel Tank Capacity:     5L");
	       System.out.println("Front Break:            Disc break");
	       System.out.println("Rear Break:             Drum Break");
	       System.out.println("*******************************************");
	       
	       
	       return "";
	        }
	        else
	        {
	        	System.out.println("*******************************************");
	 	       System.out.println("Brand:                  Suzuki");
	 	       System.out.println("Bike Name:              Access 125");
	 	       System.out.println("Colour:                 Black");
	 	       System.out.println("Engine Capacity:        125cc");
	 	       System.out.println("Mileage:                55-60Kmpl");
	 	       System.out.println("Fuel Tank Capacity:     5L");
	 	       System.out.println("Front Break:            Disc break");
	 	       System.out.println("Rear Break:             Drum Break");
	 	       System.out.println("*******************************************");
	 	       
	 	       
	 	       return "";
	        }
			
	    }
	   public void spec() // Specification method
	    {
	        Suzuki_Access_125 b8 = new Suzuki_Access_125();
	        System.out.println(b8); // Due to 'OverRiding' toString() we have get data instead of address of an object.
	        System.out.println("Do you want to switch to another model.");
	        System.out.println("Press 1 ===> Switch to different bike.");
	        System.out.println("Press 2 ===> Switch to different brand.");
	        System.out.println("Press 3 ===> To stay here itself.");
	        int s =sc.nextInt();

	        if (s==1)
	        {   
	            bikes.bike();
	        }

	        else if(s==2)
	        {
	            Details.bikedetails();
	        }

	        System.out.println("Do you want to purchase ?");
	        System.out.println("Press 1 ===> yes \n"+
	                           "Press 2 ===> No ");

	        int y = sc.nextInt();
	        System.out.println("");
	        if (y==1)
	        {
	            System.out.println( "==>"+bikeName+"\n"+
	            "Total amount:\t"+price);  
	                               Showroom.Payment(price);                      
	        }
	        else 
	        {
	            System.out.println("Okay Sir, You can look around for other bike ");
	            System.out.println("");
	            Showroom.range(); 
	        }

	    }
		
}