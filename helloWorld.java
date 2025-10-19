
public class helloWorld {

    public static void main(String[] args) {
        System.out.println(inverse(0, 4));

        
    }

    public static String inverse(int n, int d) {
        if (n != 0) {
            return d + "/" + n;
        }   

        return "Cannot be inverted.";
    }
}