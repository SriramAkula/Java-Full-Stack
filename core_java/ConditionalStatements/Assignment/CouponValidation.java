import java.util.Scanner;
class CouponValidation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int currDate,expiryDate;
		System.out.print("Enter Current date: ");
		currDate=sc.nextInt();
		System.out.print("Enter Expiry date: ");
		expiryDate=sc.nextInt();
		System.out.println((currDate < expiryDate) ? "Coupon can be applied" : "Coupon cant be applied");
	}
}

// < is used. Because the coupon expires on the expirydate not after.