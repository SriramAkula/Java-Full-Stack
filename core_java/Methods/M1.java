class M1 
{
	public static void main(String[] args) 
	{
		m1(m3(),m2(100),200);
	}
	public static void m1(int y,int x,int a){
		System.out.println("m1 -> "+a);
	}
	public static int m2(int a){
		System.out.println("m2 -> "+a);
		return a;
		
	}
	public static int m3(){
		System.out.println("m3 method ");
		return 10;
		
	}
}
