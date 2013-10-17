
public class TestCircle {
	
	public void start(){
		Circle c1, c2;
		c1 = new Circle(8, 9, 10);
		c2 = new Circle();
		
		c1.setCentre(23, 45);
		c1.setColour("Red");
		c2.setColour("Blue");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		if (c1.equals(c2)) {
			System.out.println("c1 equals c2");
		} else {
			System.out.println("c1 does not equal c2");
		}
	}

}
