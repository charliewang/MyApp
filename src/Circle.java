public class Circle {
	private int radius;
	private int xCentre;
	private int yCentre;

	public Circle() {
		radius = 10;
		xCentre = 100;
		yCentre = 100;
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

	public String toString() {
		return new String("Circle: (" + xCentre + "," + yCentre
				+ ") + radius: " + radius);
	}
}
