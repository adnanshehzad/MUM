
public class Main {
	private static Triangle triang;
	private static Rectangle rect;
	private static Circle circ;
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circ=new Circle(2);
		triang=new Triangle(10,20);
		rect=new Rectangle(6,10);
		
		double result1,result2,result3;
		
		result1=circ.computeArea();
		result2=triang.computeArea();
		result3=rect.computeArea();
		
		System.out.print("The Area of Triangle is  " + result2 + "\n" + 
						"The Area of Rectangle is  " + result3 + "\n"
						+ "The Area of Circle is  " + result1);
		
	}

}
