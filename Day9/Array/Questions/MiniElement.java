import java.util.Scanner;
import java.util.Arrays;
class MiniElement
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int mini=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<mini){
				mini=arr[i];
			}
		}
		System.out.println("Mini Element: "+mini);
		
	}
}
