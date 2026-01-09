import java.util.Scanner;
import java.util.Arrays;
class A5 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		/*
		int size=sc.nextInt();
		int arr[]=new int[size];
		*/
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++){
			System.out.print("Element "+(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		//print through inbuild methods
		System.out.println(Arrays.toString(arr));
	}
}
