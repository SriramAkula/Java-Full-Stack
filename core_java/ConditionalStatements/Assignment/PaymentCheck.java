import java.util.Scanner;
class PaymentCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amt Paid: ");
		double paidAmount = sc.nextDouble();
		System.out.print("Enter the Order Amt: ");
		double orderAmount = sc.nextDouble();
		System.out.println((paidAmount == orderAmount) ? "Order Confirmed" : "Order not confirmed");
	}
}

// == is used.