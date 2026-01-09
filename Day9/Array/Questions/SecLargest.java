import java.util.Scanner;
import java.util.Arrays;
class SecLargest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			System.out.print("Element "+(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
		int maxi2=secLargest(arr);
		System.out.print(maxi2);
	}
	public static int secLargest(int arr[]){
		int maxi=arr[0];
		int maxi2=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(maxi<arr[i]){
				maxi2=maxi;
				maxi=arr[i];
			}
			else if(arr[i]>maxi2 && arr[i]!=maxi){
				maxi2=arr[i];
			}
		}
		return maxi2;
	}
}
