import java.util.Scanner;
class Method1 
{
	public static void main(String[] args) 
	{

		/*
		int a=10;
		if(a==10){
			
			addition();
			subtraction();//Exception
		}else if(a==11){
			
			subtraction();
		}else{
			
			multiplication();
		}*/
		
		addition();

	}
	public static void addition(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=sc.nextInt();
		System.out.print("Enter b: ");
		int b=sc.nextInt();
		int rAdd=a+b;
		System.out.println("Addition of "+a+" and "+b+" = "+rAdd);
		subtraction();
		sc.close();
	}
	public static void subtraction(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=sc.nextInt();
		System.out.print("Enter b: ");
		int b=sc.nextInt();
		int rSub=a-b;
		System.out.println("Subtraction of "+a+" and "+b+" = "+rSub);
		multiplication();
		sc.close();
	}
	public static void multiplication(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=sc.nextInt();
		System.out.print("Enter b: ");
		int b=sc.nextInt();
		int rMul=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" = "+rMul);
		sc.close();
	}
}
