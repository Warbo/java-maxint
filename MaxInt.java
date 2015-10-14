public class MaxInt {
	public static void main(String[] args) {
		int myint = Integer.MAX_VALUE;
		System.out.print("x = ");
		System.out.println(myint);
		System.out.print("x + 1 = ");
		System.out.println(myint + 1);
		if (myint + 1 < myint) {
			System.out.println("Java fails at maths.");
		}
	}
}

