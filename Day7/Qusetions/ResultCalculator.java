import java.util.Scanner;
class ResultCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Physics Marks: ");
		int pM=sc.nextInt();
		System.out.print("Enter Chemistry Marks: ");
		int cM=sc.nextInt();
		System.out.print("Enter Maths Marks: ");
		int mM=sc.nextInt();
		char grade=checkGrade(pM,cM,mM);
		
		if(grade=='F'){
			System.out.println("Not Eligible for placement training");
		}else{
			System.out.println("Eligible for placement training");
		}
		
	}
	public static char checkGrade(int p,int c,int m){
		double avg=(p+c+m)/3;
		if(avg>=80){
			return 'A';
		}
		if(avg>=65){
			return 'B';
		}
		if(avg>=50){
			return 'C';
		}
		if(avg>=35){
			return 'D';
		}
		return 'F';
		
	}
}
