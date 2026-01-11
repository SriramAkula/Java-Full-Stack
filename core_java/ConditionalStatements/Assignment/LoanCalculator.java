import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal Amt: ");
		double p=sc.nextDouble();
		System.out.print("Enter Rate of Interest: ");
		double r=sc.nextDouble();
		System.out.print("Enter Tenure in Years: ");
		double t=sc.nextDouble();
		double interest = (p*t*r)/100;
		double totalAmount = p+interest;
		double emiPerMonth=(totalAmount/5)/12;
		System.out.println("Interest for 5 years " + interest);
		System.out.println("Total Amount to be paid " + totalAmount);
		System.out.println("EMI per month " + emiPerMonth);
	}
}
