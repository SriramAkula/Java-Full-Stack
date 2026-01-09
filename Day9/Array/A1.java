class A1 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[4];
		initA(arr);
		System.out.println(arr[1]);
	}
	public static void initA(int arr[]){
		for(int i=0;i<4;i++){
			arr[i]=i;
		}
	}
}
