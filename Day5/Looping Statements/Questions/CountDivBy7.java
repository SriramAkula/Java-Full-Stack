import java.util.Scanner;
class CountDivBy7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m: ");
		int m=sc.nextInt();
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int c=0;
		for(int i=m;i<n;i++){
			if(i%7==0){
				c++;
			}
		}
		System.out.println(c);
	}
}
