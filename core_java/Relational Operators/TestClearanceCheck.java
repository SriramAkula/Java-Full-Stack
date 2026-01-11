import java.util.Scanner;
class TestClearanceCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter true if cleared logic round else false:  ");
		boolean clearedLogicRound = sc.nextBoolean();
		System.out.print("Enter true if cleared coding round else false:  ");
		boolean clearedCodingRound = sc.nextBoolean();
		System.out.print("Enter true if has strong refferal else false:  ");
		boolean hasStrongRefferal = sc.nextBoolean();
		boolean clearedTest = hasStrongRefferal || (clearedLogicRound && clearedCodingRound);
		System.out.println(clearedTest ? "Cleared Test" : "Not Cleared");
	}
}
