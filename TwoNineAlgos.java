public class TwoNineAlgos {

    public static boolean isDivisible(int n, int d) {
        return (n % d == 0);
    }
    
    // exclusive
    public static int sum(int start, int end, int count) {

        int sum = 0;

        for (int i = start; i < end; i += count) {
            sum += i;
        }

        return sum;
    }

    public static String printDigits(int n) {

        String s = "";
        int temp = n;

        while (temp != 0) {
            s = s + (temp % 10) + " ";
            temp /= 10;
        }

        return s;
    }

    public static int minRand(int num) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num; i++) {
            int rand = (int) (Math.random() * Integer.MAX_VALUE);
            // System.out.println(rand);
            if (rand < min)
                min = rand;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minRand(1000000000));
        // System.out.println(isDivisible(5, 2));
        // System.out.println(printDigits(42069));
        // System.out.println(sum(1, 10, 1));
    }

}