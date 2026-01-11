import java.util.Scanner;
class Details 
{
	
	public static void main(String[] args) 
	{
		String d=details();
		System.out.println(d);
	}
	
	public static String details(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=sc.nextLine();
		System.out.print("Enter age: ");
		int age=sc.nextInt();
		System.out.print("Enter phNo: ");
		long phNo=sc.nextLong();
		
		return "Name: "+name+" Age: "+age+" phNo: "+phNo;
		
		
	}
}
