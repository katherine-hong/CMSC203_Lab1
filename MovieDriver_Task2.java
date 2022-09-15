/*
 * CMSC 203 CRN 21076
 * Professor Monshi
 * Katherine Hong
 * Due: 09/20/2022
 * This is the code for task #2
 */

import java.util.Scanner;


public class MovieDriver_Task2 {

	public static void main(String[] args) {
		
		// The following creates a Scanner object
		Scanner input = new Scanner(System.in);
		
		// The following creates a Movie object
		Movie a = new Movie();
		
		// The following creates the necessary variables to hold input
		String movieTitle;
		String movieRating;
		int ticketSold;
		String movieInfo;
		String response;
		
		do
		{
			// The following asks the user for movie input
			System.out.println("Enter the name of a movie");
			movieTitle = input.nextLine();
			
			System.out.println("Enter the rating of the movie");
			movieRating = input.nextLine();
			
			System.out.println("Enter the number of tickets sold for this movie");
			ticketSold = input.nextInt();
			
			// The following uses set method to change variable data
			a.setTitle(movieTitle);
			a.setRating(movieRating);
			a.setSoldTickets(ticketSold);
			
			movieInfo = a.toString();
			System.out.println(movieInfo);
			
			input.nextLine();
			
			System.out.println("Do you want to enter another? (y or n)");
			response = input.nextLine();
			
		} while(response.equals("y") || response.equals("Y"));
		
		System.out.println("Goodbye");
		input.close();
		

	}

}

