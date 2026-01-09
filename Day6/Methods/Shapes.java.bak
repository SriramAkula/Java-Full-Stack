import java.util.Scanner;
class Shapes 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Select shape to calculate: \n1. Square \n2. Rectangle \n3. Circle \n4. Triangle");
			String opt=sc.next();
			switch(opt){
				case "Square":
					double s_area=square();
					System.out.println("Area of square: "+s_area);
					break;
				case "Rectangle":
					double r_area=rectangle();
					System.out.println("Area of rectangle: "+r_area);
					break;
				case "Circle":
					double c_area=circle();
					System.out.println("Area of rectangle: "+c_area);
					break;
				case "Triangle":
					double t_area=triangle();
					System.out.println("Area of triangle: "+t_area);
					break;
				default:
					System.out.println("Invalid option.");
					break;
					
			}
			System.out.print("Enter for further input (yes/no): ");
			String s=sc.next();
			if(s.equals("no")){
				break;
			}
		}
		
		
	}
	
	public static double square(){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter side: ");
			double side=sc.nextDouble();
			double area=side*side;
			return area;
		}
		public static double rectangle(){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter length: ");
			double length=sc.nextDouble();
			System.out.print("Enter breadth: ");
			double breadth=sc.nextDouble();
			double area=length*breadth;
			return area;
		}
		public static double circle(){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter radius: ");
			double radius=sc.nextDouble();
			double area=radius*radius*3.14;
			return area;
		}
		public static double triangle(){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter breadth: ");
			double breadth=sc.nextDouble();
			System.out.print("Enter height: ");
			double height=sc.nextDouble();
			double area=0.5*breadth*height;
			return area;
		}
}
