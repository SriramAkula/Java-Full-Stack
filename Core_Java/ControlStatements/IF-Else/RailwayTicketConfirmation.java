import java.util.Scanner;
class RailwayTicketConfirmation 
{
	public static void main(String[] args) 
	{
		int availableSeats=55;
		boolean isRacAvailable = true;
		Scanner sc = new Scanner(System.in);
		
		if(availableSeats>0){
			System.out.println("Your Ticket is Booked.");
		}else{
			if(isRacAvailable){
				System.out.println("Your ticket got waitlisted.");
			}else{
				System.out.println("Ticket cancelled due to no available seats");
			}
		}

	}
}
