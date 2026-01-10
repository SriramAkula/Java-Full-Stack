class A4
{
	public static void main(String[] args) 
	{
		int arr[]=new int[5]{}; //array creation with both dimension expression and initialization is illegal (CTE)
		int arr1[]=new int[]{}; // success but no printed because size not mentioned
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
	}
}