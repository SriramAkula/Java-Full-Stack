import java.util.Scanner;
class Discount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of Units purchased: ");
		int quantity=sc.nextInt();
		System.out.print("Enter cost of each unit: ");
		double cp=sc.nextDouble();
		double totPrice=quantity*cp;
		
		if(totPrice>1000){
			double disPrice=totPrice-(totPrice*10/100);
			System.out.println("You got discount....");
			System.out.println("You need to pay Rs. "+disPrice+" Only.");
		}else{
			System.out.println("You need to pay Rs. "+totPrice+" Only.");
		}
		

	}
}
