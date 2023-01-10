package csw;

import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args) {
		circle c=new circle();
		Scanner sc= new Scanner(System.in);
		System.out.println("radius :");
		double r = sc.nextDouble();
		c.radius=r;
		System.out.println("Area :"+c.getArea ());
		System.out.println("Circumference :"+c.getCircumference ());
	}
}
