package ssj_4;

public class TotalArea_9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle_9_8[] circleArray;
		circleArray=creatCircleArray();
		printCircleArray(circleArray);
	}
	public static Circle_9_8[]creatCircleArray(){
		Circle_9_8[] circleArray=new Circle_9_8[5];
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i]=new Circle_9_8(Math.random()*100);
		}
		return circleArray;
	}
	public static void printCircleArray(Circle_9_8[] circleArray){
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for(int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
		}
		System.out.println("_______________________________________________");
		System.out.printf("%-30s%-15f\n","The total area of circles is",sum(circleArray));
	}
	public static double sum(Circle_9_8[] circleArray) {
		double sum=0;
		for(int i=0;i<circleArray.length;i++) {
			sum+=circleArray[i].getArea();
		}
		return sum;
	}
}
