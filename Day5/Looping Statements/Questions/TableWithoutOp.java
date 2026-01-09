import java.util.Scanner;
class TableWithoutOp
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num=sc.nextInt();
		int res=0;
		for(int i=1;i<=10;i++){
			
			res+=num;
			System.out.println(num +" * "+i+" = "+(res));
			
		}
		
	}
}
