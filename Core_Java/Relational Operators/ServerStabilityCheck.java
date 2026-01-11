import java.util.Scanner;
class ServerStabilityCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter cpu usage percent:  ");
		double cpuUsage =sc.nextDouble();
		System.out.print("Enter memory usage percent:  ");
		double memoryUsage =sc.nextDouble();
		System.out.print("Enter true if under maintainance else false:  ");
		boolean isUnderMaintenance =sc.nextBoolean();
		String res = isUnderMaintenance ? "Server Under Maintainance" : (cpuUsage > 85 || memoryUsage >90) ? "Server Unstable" : "Server Stable";
		System.out.println(res);
	}
}
