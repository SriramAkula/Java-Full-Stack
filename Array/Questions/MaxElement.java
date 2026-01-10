import java.util.Scanner;
import java.util.Arrays;
class MaxElement
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int maxi=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>maxi){
				maxi=arr[i];
			}
		}
		System.out.println("Max Element: "+maxi);
		
	}
}
