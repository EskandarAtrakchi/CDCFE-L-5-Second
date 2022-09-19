//this code should be looked at for some errors and eceptions 
import java.io.IOException;//import java from IOException
import java.nio.file.Files;//import java from files 
import java.nio.file.Path;//import java from path
import java.nio.file.Paths;//import java from paths 
import java.util.Scanner;// import Scanner class from Java utilities library
import java.time.format.DateTimeFormatter;// import Date and Time format class from time library 
import java.time.LocalDateTime;// import Date and Time local class from time library 
	public class BankAccount1
	{// start class
		    static Scanner input = new Scanner (System.in);//make reference to the scanner 
		    private static String customersNames[]=
		    	{"Person1","Person2","Person3","Person4","Person5"};// The names of the customers declared as private
		    private static int customersPins[]= 
		    	{1,2,3,4,5};// The Pins of the Customers declared as private
		    private static int customersBalances[]=
		    	{111,222,333,444,555};// The customers balances declared as private
		    private static String customersNames1[]=
		    	{"\t\t\t\tThis is an actual bank statement of Eskandar's Bank\t\t\t\t\n"
		    			+ "--------------------------------------------------------------------"
		    			+ "-------------------------------------------"
		    			+ "------\n\t\t\t\t\tNames\t\tPins\t\tBalances\n\n--------------------"
		    			+ "------------------------------------------------"
		    			+ "-------------------------------------------------\n\n\t\t\t\t\tPe"
		    			+ "rson1\t1\t\t111$\n\n\t\tThis balance has been taken before any tra"
		    			+ "nsaction occures\n\n\t\t\tContact us for any queries at 01-999-392"
		    			+ "\n\n\n\t\t---------------------------Have a nice day---------------------------\n",
		    	"\t\t\t\tThis is an actual bank statement of Eskandar's Bank\t\t\t\t\n---------------"
		    	+ "--------------------------------------------"
		    	+ "----------------------------------------------------------\n\t\t\t\t\tNames\t\tP"
		    	+ "ins\t\tBalances\n\n------------------------------------------------------------"
		    	+ "-------------------------------------------------"
		    	+ "--------\n\n\t\t\t\t\tPerson2\t2\t\t222$\n\n\t\tThis balance has been taken befor"
		    	+ "e any transaction occures\n\n\t\t\tContact us for any queries at 01-999-392\n\n\n\t\t"
		    	+ "---------------------------Have a nice day---------------------------\n",
		    	"\t\t\t\tThis is an actual bank statement of Eskandar's Bank\t\t\t\t\n------"
		    	+ "-------------------------------------------------------------"
		    	+ "--------------------------------------------------\n\t\t\t\t\tNames\t\tPins\t\tBalances"
		    	+ "\n\n------------------------------------------------------------------------------"
		    	+ "---------------------------------------\n\n\t\t\t\t\t"
		    	+ "Person3\t3\t\t333$\n\n\t\tThis balance has been taken before any transaction occures"
		    	+ "\n\n\t\t\tContact us for any queries at 01-999-392\n\n\n\t\t--------------------------"
		    	+ "-Have a nice day---------------------------\n",
		    	"\t\t\t\tThis is an actual bank statement of Eskandar's Bank\t\t\t\t\n---------------"
		    	+ "----------------------------------------------------"
		    	+ "--------------------------------------------------\n\t\t\t\t\tNames\t\tPins\t\tBalances"
		    	+ "\n\n-------------------------------------------------------------------------------"
		    	+ "--------------------------------------\n\n\t\t\t\t\t"
		    	+ "Person4\t4\t\t444$\n\n\t\tThis balance has been taken before any transaction occures"
		    	+ "\n\n\t\t\tContact us for any queries at 01-999-392\n\n\n\t\t------------------------"
		    	+ "---Have a nice day---------------------------\n",
		    	"\t\t\t\tThis is an actual bank statement of Eskandar's Bank\t\t\t\t\n-----------------"
		    	+ "-------------------------------------------------"
		    	+ "---------------------------------------------------\n\t\t\t\t\tNames\t\tPins\t\tBalances"
		    	+ "\n\n-------------------------------------------------------------------------------"
		    	+ "--------------------------------------\n\n\t\t\t\t\t"
		    	+ "Person5\t5\t\t555$\n\n\t\tThis balance has been taken before any transaction occures"
		    	+ "\n\n\t\t\tContact us for any queries at 01-999-392\n\n\n\t\t-------------------"
		    	+ "--------Have a nice day---------------------------\n"};
		    private static int overDraft[]=
		    	{0,0,0,0,0};// overDraft is zero so the Customer's account won't be minus overdraft declared as private 
		    static String struserInput;//declare variable as String
		    static int index;//declare variable as int 
		    static int counter=3;// maximum Number of attempts 
		    static int userPin;//declare variable as int 
		    static int customerWithdraw;//declare variable as int 
		    static int customerDeposit;//declare variable as int 
		    static int Exit;//declare variable as int 
		    static int changePin;//declare variable as int 
		    
		    //struserInput=input.next(); i will use this to take the input as a string 
	            //inputValidation();//check the validation of an input 
		    //customerWithdraw = Integer.parseInt(struserInput);//parse String into integer
		    //-----------------------------------------------------------------------------------
		    public static void methods()
		    {//Start method 
		    	PrintCustomersAccounts();// print the customers account method 
		    	login();// log-in method 
		    		}//End methods
		    //-----------------------------------------------------------------------------------
			public static void PrintCustomersAccounts() 
			{//start method
				System.out.println("--------------------"
						+ "--------------------------------");// just printing the line 
				System.out.println("\t\tESKANDARS'S BANK");// declare the name of the bank
				//Drawing a line to separate the names from the bank's name 
				System.out.println("---------------------"
						+ "-------------------------------\n");//draw a line 
				System.out.println("\tNames\t\tPins\t\tBalances");// print the headings of the fields 
				System.out.println("---------------------------"
						+ "--------------------------\n");//Drawing a line to separate the headings
				   for(int i=0;i<5;i++)
				   {//start for loop to show all users info
				    	  System.out.println
				    	  ("\t"+customersNames[i]+"\t\t"+customersPins[i]
				    			  +"\t\t"+customersBalances[i]+"$");//print accounts of the users
				      }//end for loop
				   System.out.println("-------------------------------"
				      		+ "-----------------------\n");//Drawing a line
				      }//End method PrintCustomersAccounts
			//------------------------------------------------------------------------------------
				public static void login() 
				{//Start log-in method for correct and incorrect Pin
				System.out.println("Please enter your Pin");//Asking the customer to enter their Pin
				struserInput=input.next();//take in user input as a string
				inputValidation();//check the validation of the user's input 
				userPin = Integer.parseInt(struserInput);//parse String into integer
				//scenario number 1 (correct Pin)
						for(int i=0;i<customersNames.length;i++) 
						{//start for loop for correct pins 
							if(userPin == customersPins[i]) 
							{//start if statement
								index=i;//hold users 
								selectionMenu();// Get the customer to the selection menu 
								}//end if
						}//end for
						//Scenario number 2 (Incorrect Pin)
						for(int i=0;i<customersNames.length;i++) 
						{//for loop for incorrect pin
							if(userPin != customersPins[i]) 
							{//start if statement for incorrect Pin 
								System.out.println
								("INVALID PIN");//Printing the line if the customer gets to enter wrong Pin
								attemptsMethod();//Count an attempt 
								login();//get the customer to try to log-in again since it is not their third attempt
								}//end if	
						}//end for
				}//End method login
			//---------------------------------------------------------------------------------------
				public static void attemptsMethod() 
				{//start attempts method
				counter --;//counter starts from 3 and count downwards in minus 
				//to show the customer how many attempts left 
				System.out.println("\nYou have---"+ counter+"---attempts left\n");

				if(counter==0) 
				{//start if statement when the customer fails to enter their pin on the third attempt 
					System.out.println("ATTENTION, YOUR CARD IS BLOCKED");//after 3 wrong attempts 
					System.exit(0);//get the customer to exit because of 3 fail attempts 
					}//end if statement 
				else 
				{// start else 
					login();//to get the user to the login method since the counter is not zero yet
				}//end else statement
			}//end method attemptsMethod
			//----------------------------------------------------------------------------------------
			public static void attemptsMethodforaskingPin1() {//start method attemptsMethodforaskingPin1
				counter --;//counter starts from 3 and count downwards in minus 
				//to show the customer how many attempts left 
				System.out.println("\nYou have---"+ counter+"---attempts left"
						+ "\n");//inform the user for the number of attempts 

				if(counter==0) 
				{//start if statement when the customer fails to enter their pin on the third attempt 
					System.out.println("ATTENTION, YOUR CARD IS BLOCKED");//after 3 wrong attempts 
					System.exit(0);//get the customer to exit because of 3 fail attempts 
					}//end if statement 
				else 
				{// start else 
					statementMethod();//call the statementMethod
				}//end else statement
			}//end method attemptsMethodforaskingPin1
			//----------------------------------------------------------------------------------------
			public static void askingforPin1() {//start askingforpin1 method 
				System.out.println("Please enter your PIN first");//ask the customer for their PIN
				struserInput=input.next();//take in user input as a string
				inputValidation();//check if the user input is valid
				changePin = Integer.parseInt(struserInput);//parse String into integer
				for(int i=0;i<customersNames.length;i++)
				{//start for loop for correct pins 
					if(changePin == customersPins[index])
					{//start if statement
						//go back to the attempts method to select the (statementMethod) method from else 
						}//end if
				}//end for
				//Scenario number 2 (Incorrect Pin)
				for(int i=0;i<customersNames.length;i++)
				{//for loop for incorrect pin
					if(changePin != customersPins[index])
					{//start if statement for incorrect Pin 
						System.out.println
						("INVALID PIN");//Printing the line if the customer get to enter wrong Pin
						attemptsMethodforaskingPin1();//Count an attempt
						}//end if
				}//end for
			}//end method askingforPin1
			//----------------------------------------------------------------------------------------
			public static void attemptsMethodforaskingPin2() {//start attemptsMethodforaskingPin2 method 
				counter --;//counter starts from 3 and count downwards in minus 
				//to show the customer how many attempts left 
				System.out.println("\nYou have---"+ counter+"---attempts left"
						+ "\n");//inform the user for the number of attempts 

				if(counter==0) 
				{//start if statement when the customer fails to enter their pin on the third attempt 
					System.out.println("ATTENTION, YOUR CARD IS BLOCKED");//after 3 wrong attempts 
					System.exit(0);//get the customer to exit because of 3 fail attempts 
					}//end if statement 
				else 
				{// start else 
					withdrawMethod();//call the withdrawMethod method
				}//end else statement
			}//end method attemptsMethodforaskingPin2
			//----------------------------------------------------------------------------------------
			public static void askingforPin2() {//start askingforPin2 method 
				System.out.println("Please enter your PIN first");//ask the customer for their PIN
				struserInput=input.next();//take in user input as a string
				inputValidation();//check if the user input is valid
				changePin = Integer.parseInt(struserInput);//parse String into integer
				for(int i=0;i<customersNames.length;i++) 
				{//start for loop for correct pins 
					if(changePin == customersPins[index]) 
					{//start if statement
						//go back to the attempts method to select the withdrawMethod method from else 
						}//end if
				}//end for
				//Scenario number 2 (Incorrect Pin)
				for(int i=0;i<customersNames.length;i++) 
				{//for loop for incorrect pin
					if(changePin != customersPins[index]) 
					{//start if statement for incorrect Pin 
						System.out.println("INVALID PIN");//Printing the line if the customer get to enter wrong Pin
						attemptsMethodforaskingPin2();//Count an attempt 
						}//end if	
				}//end for
			}//end method askingforPin2
			//----------------------------------------------------------------------------------------
			public static void attemptsMethodforaskingPin3() {//start attemptsMethodforaskingPin3 method 
				counter --;//counter starts from 3 and count downwards in minus 
				//to show the customer how many attempts left 
				System.out.println("\nYou have---"+ counter+"---attempts left"
						+ "\n");//inform the user for the number of attempts 

				if(counter==0) 
				{//start if statement when the customer fails to enter their pin on the third attempt 
					System.out.println("ATTENTION, YOUR CARD IS BLOCKED");//after 3 wrong attempts 
					System.exit(0);//get the customer to exit because of 3 fail attempts 
					}//end if statement 
				else 
				{// start else 
					depositMethod();//call the depositMethod
				}//end else statement
			}//end method attemptsMethodforaskingPin3
			//----------------------------------------------------------------------------------------
			public static void askingforPin3() {//start askingforPin3 method 
				System.out.println("Please enter your PIN first");//ask the customer for their PIN
				struserInput=input.next();//take in user input as a string
				inputValidation();//check if the user input is valid
				changePin = Integer.parseInt(struserInput);//parse String into integer
				for(int i=0;i<customersNames.length;i++) 
				{//start for loop for correct pins 
					if(changePin == customersPins[index]) 
					{//start if statement
						//go back to the attempts method to select the depositMethod method from else 
						}//end if
				}//end for
				//Scenario number 2 (Incorrect Pin)
				for(int i=0;i<customersNames.length;i++) 
				{//for loop for incorrect pin
					if(changePin != customersPins[index]) 
					{//start if statement for incorrect Pin 
						System.out.println("INVALID PIN");//Printing the line if the customer get to enter wrong Pin
						attemptsMethodforaskingPin3();//Count an attempt 
						}//end if	
				}//end for
			}//end method askingforPin3
			//----------------------------------------------------------------------------------------
			public static void changePin() {//start changePin method 
				System.out.println("Please enter your new "
						+ "PIN");//	Asking the customer to enter their new PIN 
				struserInput=input.next();//take in user input as a string
				inputValidation();//check if the user input is valid
				changePin = Integer.parseInt(struserInput);//parse String into integer
				//reset the PIN to zero and taking user input PIN instead and store it in the array 
						customersPins[index]= customersPins[index]+changePin-
								customersPins[index];//update pin index
							 DateTimeFormatter dtf = DateTimeFormatter.ofPattern
									 ("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the device 
					    	   LocalDateTime now = LocalDateTime.now();//get the time and the date from the machine  
						 System.out.println("Your new PIN is now: "+ customersPins[index] + 
								 " This PIN been changed on "
								 +dtf.format(now));//inform the customer the new balance
						 System.out.println
						 ("Your card is still active in the ATM\n"
						 		+ "Please select from the menu down "
						 		+ "below\n");//notify the customer that his card still active
						 selectionMenu();//get the customer to selection Menu in-case for any other process
			}//end method changePin
			//----------------------------------------------------------------------------------------
			public static void selectionMenu() 
			{//start selectionMenu method
				while(true) 
				{//start while loop for the user to choose an option
					//customer can select one of those
				System.out.println("\n------------------------------------"
						+ "------------------\nSelect number 1 for bank Statement"
						+ "\nSelect number 2 to withdraw\n"
						+ "Select number 3 to Deposit\nSelect number 4 to Exit this "
						+ "ATM\nSelect number 5 to change your PIN\nSelect number 6"
						+ " to print an actual bank statement");//setting the selection menu 
				struserInput=input.next();//take in user input as a string
				inputValidation();//check if the user input is valid
				int option = Integer.parseInt(struserInput);//parse String into integer
					switch(option) 
					{//start switch statement
					case 1:statementMethod();break;//case number 1 for statement 
					case 2:withdrawMethod();break;//case number 2 for withdraw 
					case 3:depositMethod();break;//case number 3 for deposit 
					case 4:Exit();break;//case number 4 for exit 
					case 5:changePin();break;//case number 5 for changing PIN 
					case 6:printNotepad();break;//
					//in-case there was invalid input the user should retry again through the selection menu
					default:
						//to show the customer the input is invalid
						System.out.println("Incorrect selection");//when the input is invalid 
					selectionMenu();//to get the customer to the selection menu again 
					}//end switch statement
				}//end while loop
			}//end method selectionMenu
			//-------------------------------------------------------------------------------------------
			public static void statementMethod() 
			{//start statementMethod
				askingforPin1();//calling the askingforPin1 method 
				System.out.println("\t\tName\t\tPin\t\tBalance\n");//draw name, balance, and PIN
				System.out.println("-------------------------------"
						+ "--------------------------");//draw a line 
				System.out.println("\t\t"+customersNames[index]+
						"\t\t"+customersPins[index]+"\t\t$"
						+customersBalances[index]);//to print the customers info
				System.out.println("--------------------------------"
						+ "-------------------------");//draw a line 
				//to inform the customer about the bank statement
				System.out.println();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern
						("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the device 
		    	   LocalDateTime now = LocalDateTime.now();//get the time and the date from the machine  
		    	   System.out.println("\nThis is your Bank Statement been taken on " 
		    	   +dtf.format(now));//print the date and the time 
				//notify the customer that his card still active 
				System.out.println("\tYou still can select from the menu down below\n");
				selectionMenu();//get the customer to selection Menu in-case for any other process 
			}//end method statementMethod
			//-------------------------------------------------------------------------------------------
			public static void withdrawMethod() 
			{//start withdraw method
				askingforPin2();//calling the askingforPin2 method 
				System.out.println("How much to withdraw");//ask the customer how much they they want to withdraw 
				struserInput=input.next();//take in user input as a string
				inputValidation();//check if the user input is valid
				customerWithdraw = Integer.parseInt(struserInput);//parse String into integer
				 if (customerWithdraw<=customersBalances[index]&& 
					customerWithdraw - customersBalances[index]<= overDraft[index]) 
				 {//start if statement
					//update user account balance after the withdrawal
					 customersBalances[index]=customersBalances[index]-customerWithdraw;
				 DateTimeFormatter dtf = DateTimeFormatter.ofPattern
								("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the device 
				 LocalDateTime now = LocalDateTime.now();//get the time and the date from the machine 
				 System.out.println("Your new balance is now: "+ customersBalances[index] + "$ This "
				 		+ "balance is on " +dtf.format(now));//inform the customer the new balance
				 System.out.println("Your card is still active in the ATM\n"
				 		+ "Please select from the menu down below"
				 		+ "\n");//notify the customer that his card still active
				 selectionMenu();//get the customer to selection Menu in-case for any other process 
				 }//end if statement
				 else 
				 {//start else for another Scenario 
					 System.out.println("No enough funds");//if the customer withdraws more than the OverDraft
					 selectionMenu();//then direct the customer to the selection menu for selections
				 }//end else statement
			}//end method withdrawMethod
			//--------------------------------------------------------------------------------------------
			public static void depositMethod() 
			{//start deposit Method
				askingforPin3();//calling the askingforPin3 method 
				System.out.println("How much you want to deposit");//ask the customer how much they want to deposit 
				struserInput=input.next();//take in user input as a string
				inputValidation();//check if the user input is valid
				customerDeposit = Integer.parseInt(struserInput);//parse String into integer
				//update user account balance after depositing
				customersBalances[index]= customersBalances[index]+customerDeposit;
				System.out.println("\nPlease take your reciept\n");//tell the user to take their receipt 
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern
						("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the device 
				LocalDateTime now = LocalDateTime.now();//get the time and the date from the machine 
				System.out.println("\nYour new balance is now: "+ customersBalances[index] + "$ This"
						+ " balance is on " +dtf.format(now));//print the updating balance for the customer so they know 
				System.out.println("Your card is still active in the ATM\n"
				 		+ "Please select from the menu down below\n");//notify the customer that his card still active
				selectionMenu();//get the customer back to choose from the selection menu 
			}//end method depositMethod
			//---------------------------------------------------------------------------------------------
			public static void Exit() 
			{// start method 
				System.out.println("\n\t\t\tPlease take your card");//tell the customer to take their card 
			System.out.println("\n---------------------------Have a "
					+ "nice day---------------------------\n");//print good bye line
			System.exit(0);//get the system to exit 
			}//end method Exit
			//---------------------------------------------------------------------------------------------
			public static void inputValidation() {//start errorTypeInputCheck
				while(!struserInput.matches("\\d+")) 
				{//start while loop for not numbers input 
					System.out.println("\nNot allowed, "
							+ "numbers only!\n");//print this line when the customer does not enter numbers only
					struserInput=input.next();//take in user input as a string
					}//end while loop	
			}//end method inputValidation
			
			//---------------------------------------------------------------------------------------------
			static void printNotepad() {//start goToNote
				//I created the file gonote.txt to write to it
				
				Path path = Paths.get("C:\\Users\\Eskandar\\Desktop\\gonote.txt");//Using Paths from Java 8
				
				String text =  customersNames1[index].
						toString();//taking from the array and print it in the notepad 
				
				
				try {//start try
					System.out.println("Successfully Printed To gonote!");//inform the user 
					System.out.println("Name: " + customersNames[index]+"\nPIN: " 
					+ customersPins[index]+"\nBalance: " + customersBalances[index]
							+"$");//print the info after changes happen 
				Files.write(path, text.getBytes());//get the path to the notepad 
				
				} catch (IOException e) {//start catch
					System.out.println("Error, file already exist");//when it cannot print or create the file 
				e.printStackTrace();
				}//end catch
				}//end goToNotepad
				@SuppressWarnings("unused")
				private static void timerMethod() {//start timer method 
				Thread.currentThread();//get current thread 
				  try {//start try 
				  Thread.sleep(500);//get the thread
				  } catch (InterruptedException e) {//start catch
				  e.printStackTrace();//catch errors
				  }//end catch
				}//end method
			}//end class 
