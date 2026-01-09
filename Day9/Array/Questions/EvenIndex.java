import java.util.Scanner;
import java.util.Arrays;
class EvenIndex
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i+=2){
			System.out.print(arr[i]+" ");
		}
		
	}
}