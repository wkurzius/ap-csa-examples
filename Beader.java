public class Beader {

    public static boolean beadCheck(String s) {

        int length = s.length();
        boolean lengthGood, correctColors, startEndGood;

        // length check
        if (length >= 5 && length <= 10)
            lengthGood = true;
        else
            lengthGood = false;

        // color check
        if (s.indexOf("B") >= 0 && s.indexOf("W") >= 0)
            correctColors = true;
        else
            correctColors = false;

        // start-end check
        if (s.substring(0, 1).equals(s.substring(length - 1)))
            startEndGood = true;
        else
            startEndGood = false;

        return lengthGood && correctColors && startEndGood;
    }

    public static void main(String[] args) {
        System.out.println(beadCheck("OBWO"));
        System.out.println(beadCheck("BWBGOGWBB"));
        System.out.println(beadCheck("ROYGBIVW"));
        System.out.println(beadCheck("BOBOBOBO"));
        System.out.println(beadCheck("WBWRWBWRWBWR"));
        System.out.println(beadCheck("BWWWBBWWWB"));
    }
}