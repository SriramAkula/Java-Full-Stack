import java.util.Arrays;
class A2 
{
	public static void main(String[] args) 
	{
		//How many ways we can print the element
		
		//1st
		int arr[]={1,2,3,4,5};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//2nd
		System.out.println(Arrays.toString(arr));
	}
}
