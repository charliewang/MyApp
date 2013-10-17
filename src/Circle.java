public class Circle {
	// Class variable
	private static String colour;
	
	// Instance variables
	private int radius;
	private int xCentre;
	private int yCentre;

	public Circle() {
		radius = 10;
		xCentre = 100;
		yCentre = 100;
		colour = "red";
	}

	public Circle(int initRadius, int initX, int initY) {
		radius = initRadius;
		xCentre = initX;
		yCentre = initY;
	}

	public void setCentre(int x, int y) {
		xCentre = x;
		yCentre = y;
	}
	public void setColour(String colour) {
		Circle.colour = colour;
	}

	public String toString() {
		return new String("Circle: (" + xCentre + "," + yCentre
				+ ") radius: " + radius + " colour: " + colour);
	}
	public boolean equals(Circle other) {
		return ((radius == other.radius) &&
				(xCentre == other.xCentre)&&
				(yCentre == other.yCentre));
	}
}
