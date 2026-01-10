import java.util.Scanner;
class LoanEligibilityChecker 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Monthly Income: ");
		double amt=sc.nextDouble();
		System.out.print("Enter Credit score: ");
		int cs=sc.nextInt();
		System.out.print("Enter Loan amt: ");
		double lA=sc.nextDouble();
		System.out.print("Enter Existing Emi amt: ");
		double eEmi=sc.nextDouble();
		System.out.print("Enter Tenure(months): ");
		int m=sc.nextInt();
		String mess=checkLoanEligibility(amt,cs,lA,eEmi,m);
		System.out.println(mess);
	}
	public static String checkLoanEligibility(double amt,int cs,double lA,double eEmi,int m){
		if(cs>=650){
			
			double r=0.1/12;
			double aEmi=(amt*0.70)-eEmi;
			
			double resEmi = lA * ((r * Math.pow((1+r),m)) / (Math.pow((1+r),m) - 1));
			if(resEmi > aEmi){
				return "Resultant Emi "+resEmi+" exceeding Available EMI"+String.format("%.2f", resEmi)+" Limit.\nPlease increase tenure or adjust loan amount";
			}else{
				return "You are eligible for this loan.\nYour Emi would be "+String.format("%.2f", resEmi)+" (approx).";
			}
			
		}else{
			return "Credit score is low. Loan not eligible.";
		}
	}
}
