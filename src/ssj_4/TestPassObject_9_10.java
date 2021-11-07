package ssj_4;

public class TestPassObject_9_10 {	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Circle_9_8 myCircle=new Circle_9_8(1.0);
			int n=5;
			printAreas(myCircle,n);
			System.out.println("Radius is "+myCircle.getRadius());
			System.out.println("n is "+n);
		}
		public static void printAreas(Circle_9_8 c,int times) {
			System.out.println("Radius \t\tArea");
			while(times>=1) {
				System.out.println(c.getRadius()+"\t\t"+c.getArea());
				c.setRadius(c.getRadius()+1);
				times--;
			}
		}
	}
