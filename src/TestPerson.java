public class TestPerson {
	public void start() {
		Person p1 = new Person("Charlie", 27, 175, 90);
		Person p2 = new Person("Tracy", 26, 180, 60);
		System.out.println(p1);
		System.out.println(p2);
		//p1.setHeight(181);
		int secondHeight = p2.getHeight();
		if (p1.isTallerThan(p2)) {
			System.out.println(p1.getName() + " is taller");
		} else {
			System.out.println(p2.getName() + " is taller");
		}
	}

}
