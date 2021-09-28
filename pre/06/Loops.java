public class Loops{
	public static double power(double x, int n) {
		double num = x;
		while ((n-1) > 0) {
			num = num * x;
			n -= 1;
		}
		return num;
	}
	public static int factorial(int number) {
		int os = number;
		while ((number-1) > 0) {
			os = os * (number-1);
			number -= 1;
		}
		return os;
	}
	public static void myexp(int x, int n) {
		double e = 1.0;
		int s = 1;
		while (s <= n) {
			e += (power(x,s))/factorial(n);
			s += 1;
		}
		System.out.println(e);
	}
	public static void main(String[] args) {
		power(2.0, 4);
		factorial(5);
		myexp(1,5);
	}
	
}