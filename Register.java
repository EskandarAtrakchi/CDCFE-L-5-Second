import java.util.Scanner;//importing Java utilities from the scanner 

public class Main {//start the class

		public String username;//declare the username as a variable 
		
		public String location;//declare the location as a variable 
		
		public String email;//declare the email as a variable 
		
		public String password;//declare the password as a variable 
		
		//Make reference to the Scanner 
		static Scanner input = new Scanner(System.in);
	
	public Register
	(String username, String location, String email, String password) 
	{//start constructor 
	
		this.username = username;//giving a value for the user name
		
		this.location = location;//giving a value for the location
		
		this.email = email;//giving a value for the email
		
		this.password = password;//giving a value for the password
	}//end the constructor

	@Override
		public String toString() 
	{//start String toString special method to return the value
		
			return "User info [Name" +username+ "Location" 
		+location+ "Email" +email+ "Password" +password+ "]";//returning the values
		}//end String toString
		
		public void Request() {//Start non ((static)) method 

			System.out.println
			("\nTo register please fill the details down below:\n");//to print a line
			
			System.out.println("Please enter your name:");//to print a line
			
			username = input.next();//to take the user input
			
			System.out.println("Please enter Password:");//to print a line
			
			password = input.next();//to take the user input 
			
			System.out.println("Please enter your location:");//to print a line
			
			location = input.next();//to take the user input
			
		}//end the Request method 
		
	  public void Validation() {//Start non ((static)) method 
		  
		/**giving a String value to email so we can use it in the while
		loop to take the user input as a String, and to print the user 
		input out**/
		  
	    	String email = "";
	    	
	    	boolean flag = false;//boolean it is either/or 
	    	int At;// (@) as int      
	    	int Dot;// (.) as int 
	    

	    	while(flag == false ){//while loop starts 
	    		
	    		System.out.print("Enter E-mail");//asking user to input their E-mail
	    		
	    		email = input.next();//taking E-mail as a String
	    		
	    		At = email.indexOf("@");// (@) must exist in the user input
	    		
	    		Dot = email.indexOf(".");// (.) must exist in the user input

	    		if ((At !=-1 ) && (Dot != -1)){//is statement starts 
	    			
	    			flag = true;//if it's true then proceed 
	    			
	    		}//end if
	    		
	    		else{
	    			
	    			System.out.println
	    			("\nInvalid email try to include (.) or/and (@)\n");//if it's false then it's invalid
	    			
	    		}//end else 
	    		
	    	}//end while
	    	
	    	System.out.println
	    	("\n\nPlease check your details\n");//inform the user to check their input
	    	
	    	System.out.println("----------------------------");//print out a line
	    	
	    	System.out.println("\nName:\t\t"+username+"\nLocation:\t"
	         +location+"\nPassWord:\t"+password+"\nE-mail\t\t"
	         	+email);//print out the user's details 
	    	
	  	}//end the validation method 
	  }//end class
