
public class Test2 {

	public Test2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon[] poly= {new Square(3),
						new Triangle(4, 5, 6),
						new Rectangle(3,4)};
		
		for(Polygon pol:poly)
		{
			System.out.print("For this " + pol.getClass().getName() + "\n" + "Number of sides= " + pol.getNumberOfSides() + "\n" + "Perimeter= " + pol.computePerimeter() + "\n");
		}
	}

}
