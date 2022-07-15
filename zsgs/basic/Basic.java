package basic;

public interface Basic {

	void input();

	void bitwise();

	void positiveOrNegative();

	void twoConcentricCircles();

	void areaOfSquare();

	private void areaOfRectangle() {
		int width = 5;
		int height = 10;
		int area = width * height;
		System.out.println("Area of rectangle=" + area);
	}

	default void accessPrivate() {
		areaOfRectangle();
	}

	void areaOfCylinder();

}
