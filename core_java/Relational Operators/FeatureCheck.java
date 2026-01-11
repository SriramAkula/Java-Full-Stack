import java.util.Scanner;
class FeatureCheck
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter true if user has Logged in else false  ");
		boolean isLoggedIn = sc.nextBoolean();
		System.out.print("Enter true if has Accepted T and C else false:  ");
		boolean hasAcceptedConditions = sc.nextBoolean();
		boolean isFeatureEnabled = isLoggedIn && hasAcceptedConditions;
		System.out.println(isFeatureEnabled ? "Feature Enabled" : "Feature not enabled");
	}
}
