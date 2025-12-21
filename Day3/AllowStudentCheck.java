import java.util.Scanner;
class AllowStudentCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Attendance: ");
		double attendance = sc.nextDouble();
		System.out.print("Enter true if has medical cert else false:  ");
		boolean medicalCert = sc.nextBoolean();
		System.out.print("Enter true if fee paid else false:  ");
		boolean isFeePaid = sc.nextBoolean();
		
		boolean res = isFeePaid && ((attendance > 75) || (medicalCert));
		
		System.out.println(res ? "Student Allowed" : "Not Allowed");
	}
}
