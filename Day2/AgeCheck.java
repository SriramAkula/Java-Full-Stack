import java.util.Scanner;
class AgeCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age=sc.nextInt();
		int minAge=18;
		int maxAge=65;
		
		System.out.println((age>=minAge && age<=maxAge) ? "Age is Valid" : "Age is not valid");
	}
}
