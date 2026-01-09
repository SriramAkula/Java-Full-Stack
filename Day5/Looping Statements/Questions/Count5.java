import java.util.Scanner;
class Count5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m: ");
		int m=sc.nextInt();
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int c=0;
		for(int i=m;i<n;i++){
			boolean flag=true;
			int res=i;
			while(res>0){
				
				int temp=res%10;
				if(temp==5){
					flag=false;
					break;
				}
				res/=10;
			}
			if(flag==false){
				c++;
			}
		}
		System.out.println("The Count is : "+c);
		
	}
}