import java.util.Scanner;
class SendAlert 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of login attempts:  ");
		int loginAttempts =sc.nextInt();
		System.out.print("Enter true if locked else false:  ");
		boolean isLocked =sc.nextBoolean();
		boolean shouldSendAlert = !isLocked && (loginAttempts > 3);
		System.out.println(shouldSendAlert ? "Alert Sent" : "Alert Not Sent");
	}
}
