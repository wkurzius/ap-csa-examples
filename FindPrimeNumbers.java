public class FindPrimeNumbers
{
    // isPrime checks whether n is a prime number
    public static boolean isPrime(int n)
    {
        int root = (int)(Math.sqrt(n));

        for (int i = 2; i <= root; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 2. Complete findPrimes to print and return
    // the number of prime numbers between num1 and num2
    public static int findPrimes(int num1, int num2)
    {
        int count = 0;
        
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) count++;
        }

        return count;
    }

    public static void main(String[] args)
    {
        System.out.println("There are " + findPrimes(2, 100) + " prime numbers between 2 and 100.");
        // You may see the grader's test runs in the output.
    }
}
