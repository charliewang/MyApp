
public class TestCircle {
	
	public void start(){
		Circle c1, c2;
		c1 = new Circle(8, 9, 10);
		c2 = new Circle();
		
		c1.setCentre(23, 45);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
