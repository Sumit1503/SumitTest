//below code Arithmetic obj = (Arithmetic) new B(); is called _____ .

class Arithmetic {
	int a = 20, b = 30;
	public void add() {
		System.out.println(a + b);
	}
}

class B2 extends Arithmetic {
	int a = 53, b = 28;
	public void add() {
		System.out.println(a + b);
	}
}

public class UpcastingQuiz {
	public static void main(String[] args) {
		Arithmetic obj = (Arithmetic) new B2();
		obj.add();
		System.out.println(obj.a);

	}

}
