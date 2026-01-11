import java.util.Scanner;
class FreeDelivery 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Cart Value: ");
		double cartValue=sc.nextDouble();
		System.out.println((cartValue>=499) ? "Free Delivery Available" : "Add More to Cart for getting Free Delivery");
	}
}

// >= is used. if cartValue is exactly 499, free delivery available.