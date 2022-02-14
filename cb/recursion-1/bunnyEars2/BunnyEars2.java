public class BunnyEars2 {
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return (bunnies % 2 == 0) ? 3 + bunnyEars2(bunnies - 1) : 2 + bunnyEars2(bunnies - 1);
    }
    public static void main(String[] args) {
        System.out.println(bunnyEars2(2));
    }
}