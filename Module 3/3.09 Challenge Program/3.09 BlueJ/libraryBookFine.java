
/**
 * The purpose of the program is to calculate a fine on an overdue book and convert information into a readable paragraph
 * 
 * @author (Pratap, Ady)
 * 
 * @version (11/26/2016)
 * 
 */


import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class libraryBookFine {
	
   public static void main(String[] args) {
	
    String procedure;
	String issuerName;
    String phoneNumber;
    String bookTitle;
	String issueDate;
	String dueDate;
	String dateToday;
	int daysLate;
    double fine = 0;
    long time;
    long time2 = 0;
    long time3;
    
   
   
    
		
		System.out.println("Welcome to StrangeLand public Library!"); 
		
		
		
		System.out.println("Check in or Check out? (Hit 1 to check in and 2 to check out) "); // Aks the user if he/she is returning or checking out a book
		
		Scanner input = new Scanner(System.in);
		
		int answer = input.nextInt();
		
		if (answer == 1) { // if returning a book, then:
			
			issuerName = input.nextLine();
			 
			System.out.println("Enter name ( Last, First):");
			
			    issuerName = input.nextLine();
			    
			    System.out.println();
			    
			    System.out.println("Name is " + issuerName);
			    
			    System.out.println();
			
			System.out.println("Enter phone number (###) ###-#### :");
			
			    phoneNumber = input.nextLine();
			    
			    System.out.println();
			    
			    System.out.println(" Phone number is " + phoneNumber);
			    
			    System.out.println();
			
			System.out.println("Enter book title:");
			
			    bookTitle = input.nextLine();
			    
			    System.out.println();
			    
			    System.out.println("Book title is " + bookTitle);
			    
			    System.out.println();
			    
			System.out.println("Enter isuue date (mm/dd/yyyy) :");
			
			    System.out.println();
			
			    issueDate = input.nextLine();
			    
			    System.out.println();
			    
			System.out.println("Enter due Date (mm/dd/yyyy) :");
			
			    System.out.println();
			
			    dueDate = input.nextLine();
			    
			    System.out.println();
			    
			System.out.println("Enter today's date (mm/dd/yyyy) : ");   
			     
			    dateToday = input.nextLine();
			    
			    System.out.println();
			    
			    
			    // 
			    
			    
			    String dateStart = issueDate; 
			    
				String dateStop = dueDate;
				
				String dateCurrent = dateToday;
				

				//HH converts hour in 24 hours format (0-23), day calculation
				SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy"); // This is to set a format for entered issue, due and current date

				Date date1 = null;
				
				Date date2 = null;
				
				Date date3 = null;
				
				
				try{ // Exception handler because .parse() throws exception
					
					date1 = format.parse(dateStart); // parses dateStart to an object of format
	
					date2 = format.parse(dateStop);
			
					date3 = format.parse(dateCurrent);
				
					long diff = date2.getTime() - date1.getTime(); // gets time in milliseconds since January 1, 1970 to date returned
			
				    time = diff/(24 * 60 * 60 * 1000); // converting milliseconds to days
	
					System.out.println("You have " + time + " day(s) to return the book.");// The issue period for a book or DVD 
					
					System.out.println();
					
                    diff = date3.getTime() - date2.getTime();
					
					time2 = diff/(24 * 60 * 60 * 1000);
					
					
					
					
					  if (time2 > 0) { // if book is over the due date, then: (time2 = overdue date counter)
					
				    				
					System.out.println("Your book is " + time2 + " days overdue ");
					
					System.out.println();
					
					System.out.println("The fine for the book for a day late is .60 dollars ");
					
					System.out.println();
				    
					fine = time2*.60; // overdue days times .60
					
					System.out.println("The fine has accumulated to: " + fine + " dollars");
					
					
					  }
					  
					  else { 
						  
						  System.out.println("Your book is not overdue");
						  
					  }
				
				} catch (Exception e) {
					e.printStackTrace();
								
			    }		
				
				// end of try catch
				
				if (time2 > 0){ // if book is overdue then:
				
				System.out.println();
			    
				System.out.println("------- Text for email message ---------");
				
				System.out.println();
				
				System.out.println("To:" +  issuerName);
				
				System.out.println();
				
				System.out.println("From: Mona (mona@csmediacenter.com");
				
				System.out.println();
				
				System.out.println("Subject: Overdue Book Notice");
				
				System.out.println();
				
				System.out.println(bookTitle + " was checked out on: " + issueDate + "\n This book is currently " + time2 + " day(s) late " + "\n Your fine has accumilated to : " + fine + " dollars");
				
				
				}
				
		}
		
		else if (answer == 2) { // if checking book out, then:
			
			issuerName = input.nextLine();
			 
			System.out.println("Enter name ( Last, First):");
			
			    issuerName = input.nextLine();
			    
			    System.out.println("Name is " + issuerName);
			    
			    System.out.println();
			
			System.out.println("Enter phone number (###) ###-#### :");
			
			    phoneNumber = input.nextLine();
			    
			    System.out.println(" Phone number is " + phoneNumber);
			    
			    System.out.println();
			
			System.out.println("Enter book title:");
			
			    bookTitle = input.nextLine();
			    
			    System.out.println("Book title is " + bookTitle);
			    
			    System.out.println();
			    
			System.out.println("Enter isuue date (mm/dd/yyyy) :");
			
			    issueDate = input.nextLine();
			    
			    System.out.println();
			    
			System.out.println("Enter due Date (mm/dd/yyyy) :");
			
			    dueDate = input.nextLine();
			    
			System.out.println("Happy Reading!");
			
		}
		
		
		else {
			
			
			System.out.println("Enter a valid number (1 or 2)");
			
		
	   }
	}
}
