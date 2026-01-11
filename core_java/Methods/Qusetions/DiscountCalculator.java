import java.util.Scanner;
class DiscountCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Purchase amt: ");
		double amt=sc.nextDouble();
		System.out.print("Enter customer type: ");
		String type=sc.next();
		String mess=checkDiscount(amt,type);
		System.out.println(mess);
	}
	public static String checkDiscount(double amt,String type){
		double price=amt;
		if(amt>0){
			if(type.equals("regular")){
				if(amt>=2000){
					price-=amt*10/100;
				}else if(amt>=3000){
					price-=amt*15/100;
				}else if(amt>5000){
					price-=amt*25/100;
				}else{
					return "Discount not applied. Pay: "+price;
				}
				return "Discount applied. Pay: "+price;
			}
			else if(type.equals("premium")){
				if(amt>=1000){
					price-=amt*12/100;
				}else if(amt>=2000){
					price-=amt*17/100;
				}else if(amt>4000){
					price-=amt*27/100;
				}else{
					return "Discount not applied. Pay: "+price;
				}
				return "Premium Discount applied. Pay: "+price;
			}else{
				return "Invalid user type";
			}
		}
		
		return "Invalid Amt range.";
	}
}
