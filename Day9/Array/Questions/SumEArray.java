import java.util.Scanner;
import java.util.Arrays;
class SumEArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i+=2){
			sum+=arr[i];
		}
		System.out.println("Sum of Even index ele: "+sum);
		
	}
}