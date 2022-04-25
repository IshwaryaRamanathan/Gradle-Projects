package Testing;

public class ArithmeticOperation {
	int a,b;

	public ArithmeticOperation(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int add() {
		int c=a+b;
		System.out.println("Sum="+c);
		return c;
	}
}
