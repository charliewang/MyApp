public class Person<anotherHeight> {
	private String name;
	private int age;
	private int height;
	private int weight;

	public Person(String theName, int theAge, int theHeight, int theWeight) {
		name = theName;
		age = theAge;
		height = theHeight;
		weight = theWeight;
	}

	public String toString() {
		String result = name + " is " + age + " years old, " + height
				+ " cm tall and " + weight + " kg.";
		return result;
	}
	public boolean isTallerThan(Person other) {
		return height > other.height;
	}
	public int getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}
	public int setHeight(int newHeight) {
		height = newHeight;
		return height;
		
	}
}
