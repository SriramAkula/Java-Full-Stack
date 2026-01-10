class LarAmong3 
{
	public static void main(String[] args) 
	{
		int a=3,b=4,c=5;
		int res=(a>b) && (a>c) ? a : ((b>c) ? b : c);
		System.out.println(res);
	}
}
