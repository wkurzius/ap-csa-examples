
public class helloWorld {

    public static void main(String[] args) {
        String s = "verisimilitude";
        int vowelCount = 0;

        for (int i = 0; i < s.length(); i++) {
            String currentChar = s.substring(i, i+1);
            int vowelIndex = "aeiou".indexOf(currentChar);
            if (vowelIndex != -1) vowelCount++;
        }

        System.out.println(vowelCount);
    }

}