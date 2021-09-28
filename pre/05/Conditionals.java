public class Conditionals{
	public static boolean isDivisible(int number1, int number2) {
		return (number1 % number2) == 0;
	}
	public static boolean isTriangle(int side1, int side2, int side3) {
		if ((side1 + side2) > side3 || (side1 + side3) > side2 || (side2 + side3) > side1) {
			return false;
		} else {
			return true;
		}
	}
	public static int ack(int m, int n) {
		if (m < 0) {
			return -1;
		} else {
			if (m > 0 && n == 0) {
				return ack(m-1,1);	
			}
			else if (m > 0 && n > 0) {
				return ack(m-1,ack(m,n-1));
			} else {
				return n + 1;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(isDivisible(3,2));
		System.out.println(isTriangle(2, 3, 25));
		System.out.println(ack(2,3));
	}
	
}