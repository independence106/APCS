public class SumDigits {
    public static int sumDigits(int n) {
        if (n % 10 == 0 && n / 10 == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(49));
    }
}
