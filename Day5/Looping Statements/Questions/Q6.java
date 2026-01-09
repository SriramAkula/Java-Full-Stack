import java.util.Scanner;
class Q6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m: ");
		int m=sc.nextInt();
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int eRes=0,oRes=0;
		for(int i=m;i<n;i++){
			if(i%2==0){
				eRes+=i;
			}else{
				oRes+=i;
			}
		}
		System.out.println("Even Sum: "+eRes);
		System.out.println("Even Sum: "+oRes);
	}
}
