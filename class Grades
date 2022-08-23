	import java.util.Scanner;//import java Scanner
	
	public class Grades {//start class
	
			private static String Subjects;//declare variable as a string
			private static int Grades;//declare variable as a int
			static String strgrade;//declare variable as a string
			static int total;//declare variable as a int
			static int points;//declare variable as a int
			
			static Scanner input = new Scanner(System.in);//make a reference 
			
			public String toString () {//start String toString special return method 
				return "Assigment2[Subjects=\t"+Subjects+ 
						"\nGrades=\t" +Grades+ "]";// return the Subjects and the Grades 
			}//end the return String toString 
			
			public void Calc() {//Start Calc method 
	
			for(int i=1; i<7; i++) {//start for loop 
				System.out.println("Please enter subject number"
						+ "\t"+i);//ask the user to enter their subject
				Subjects = input.next();//take the user's input as a String
				System.out.println("Please enter your Grade of"
						+ "\t"+Subjects);//ask the user to enter their corresponding grade
				strgrade = input.next();//take in user input as a string
				inputValidation();//check the validation of the user's input 
				Grades = Integer.parseInt(strgrade);//parse String into integer
				//Grades = input.nextInt();
				System.out.println("Your grade is:\t"+Grades+"\t\n"
						+ "your subject is:\t"+Subjects);//display the Subject and the corresponding grade 
				
			//int points = total;
			if (Grades >= 90 ) {//start if statement 
				points = 90;//only with this statement points should equal 90 
				System.out.println("your points are:\t"+points+"\n");//display points for the user 
			}//end if statement 
			else if (Grades >= 80 && Grades < 90){//start else if
				points = 80;//only with this statement points should equal 80
				System.out.println("your points are:\t"+points+"\n");//display points for the user 
			}//end if statement 
			else if (Grades >= 70 && Grades < 80){//start else if
				points = 70;//only with this statement points should equal 70
				System.out.println("your points are:\t"+points+"\n");//display points for the user 
			}//end if statement 
			else if (Grades >= 60 && Grades < 70) {//start else if
				points = 60;//only with this statement points should equal 60
				System.out.println("your points are:\t"+points+"\n");//display points for the user 
			}//end if statement 
			else if (Grades >= 50 && Grades < 60) {//start else if
				points = 50;//only with this statement points should equal 50
				System.out.println("your points are:\t"+points+"\n");//display points for the user 
			}//end if statement 
			else if(Grades <= 49) {//start else if
				points = 0;//only with this statement points should equal 0
				System.out.println("your points are:\t"+points+"\n");//display points for the user 
			}//end if statement 
			total=total+points;//plus the points all together 
			}//end for loop
		
			}// end the Calc method 
			
			public void inputValidation() {// start method 
				while(!strgrade.matches("\\d+")) 
				{//start while loop for not numbers input 
					System.out.println("\nNot allowed, numbers only!\nPlease enter your Grade "
					+ "for\t"+Subjects+"\tagain:");//notify the user that only digits allowed for grades 
					strgrade = input.next();//take in user input as a string
					}//end while loop	
			}//end method
			public void total() {//start method 
				total=total+points;//plus the points all together 
				System.out.println("****************************************");//draw a line 
				System.out.println("Your points are:" 
				+ total);//display all the total points of all of the subject 
					
			}//end the method 
			
	}//end the class
	
	
	
