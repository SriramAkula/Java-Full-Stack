import java.util.Scanner;
class WhishlistCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nof items in whishlist: ");
		int whishlist=sc.nextInt();
		System.out.println((whishlist<100) ? "Can add items" : "Whishlist is already exceeded maximum");
	}
}
