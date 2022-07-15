package usageofstatic;

public class DemoStatic {
	private static int staticVariable;
	private int normalVariable;

	public static int getStaticVariable() {
		return staticVariable;
	}

	public int getNormalVariable() {
		return normalVariable;
	}

	DemoStatic() {
		staticVariable++;
		normalVariable++;
	}

	public static void main(String[] args) {
		DemoStatic obj1 = new DemoStatic();
		DemoStatic obj2 = new DemoStatic();
		DemoStatic obj3 = new DemoStatic();

		System.out.println("normalVariable=" + obj1.getNormalVariable());
		System.out.println("staticVariable=" + obj1.getStaticVariable());

	}
}
