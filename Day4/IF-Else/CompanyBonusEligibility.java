import java.util.Scanner;
class CompanyBonusEligibility 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your experience: ");
		int experience=sc.nextInt();
		System.out.print("Please enter your performance rating: ");
		double performanceRating=sc.nextDouble();
		
		if(experience>5 && performanceRating>=4){
			System.out.println("Bonus Eligible");
		}else{
			System.out.println("Bonus not eligible");
		}

	}
}
