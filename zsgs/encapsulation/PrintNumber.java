package encapsulation;

public class PrintNumber {

	public void execute() {
		float input = new DataHiding().getF();
		System.out.printf("%1.2f", input);
		long input2 = new DataHiding().getInput();
		System.out.println(input2);
	}

	public static void main(String[] args) {
		new PrintNumber().execute();
	}
}
