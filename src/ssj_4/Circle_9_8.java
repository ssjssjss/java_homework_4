package ssj_4;

public class Circle_9_8 {	
		private double radius;
		private static int numberOfObjects=0;
		public Circle_9_8(){
			radius=1;
			numberOfObjects++;
		}
		public Circle_9_8(double newRadius){
			radius=newRadius;
			numberOfObjects++;
		}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double newRadius){
			radius=(newRadius>=0) ? newRadius:0;
		}
		public static int getNumberOfObjects() {
			return numberOfObjects;
		}
		public double getArea() {
			return radius*radius*Math.PI;
		}
	}


