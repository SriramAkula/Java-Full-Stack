import java.util.Scanner;
class Q7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m: ");
		int m=sc.nextInt();
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int eRes=1,oRes=1;
		for(int i=m;i<n;i++){
			if(i%2==0){
				eRes*=i;
			}else{
				oRes*=i;
			}
		}
		System.out.println("Even Product: "+eRes);
		System.out.println("Even Product: "+oRes);
	}
}
