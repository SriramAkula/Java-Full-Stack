import java.util.Scanner;
class Remainder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m: ");
		int m=sc.nextInt();
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int temp=m;
		while(m>=n){

			m-=n;
		}
		System.out.println("Remainder of "+temp+"/"+n+" is "+(m));
	}
}