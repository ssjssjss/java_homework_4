package ssj_4;

public class Circle_9_6 {	
		double radius;
		static int numberOfObjects=0;
		Circle_9_6(){
			radius=1;
			numberOfObjects++;
		}
		Circle_9_6(double newRadius){
			radius=newRadius;
			numberOfObjects++;
		}
		static int getNumberOfObjects() {
			return numberOfObjects;
		}
		double getArea() {
			return radius*radius*Math.PI;
		}
	}


