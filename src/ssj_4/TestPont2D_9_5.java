package ssj_4;

import java.util.Scanner;
import javafx.geometry.Point2D;

public class TestPont2D_9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter point1's x-, y-coordinate: ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		System.out.println("Enter point2's x-, y-coordinate: ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		
		Point2D p1=new Point2D(x1,y1);
		Point2D p2=new Point2D(x2,y2);
		System.out.println("p1 is "+p1.toString());
		System.out.println("p2 is "+p2.toString());
		System.out.println("The distance between p1 and p2 is "+p1.distance(p2));
		System.out.println("The midpoint between p1 and p2 is "+p1.midpoint(p2).toString());
	}

}
