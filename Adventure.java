import java.util.Scanner;

public class Adventure {
    private static Scanner scan = new Scanner(System.in);

    public static void move() {

        String command = scan.nextLine(); // use nextLine() in your own IDE

        if (command.equals("n")) {
            System.out.println("You go north.");
            forest();
        } else if (command.equals("s")) {
            System.out.println("You go south.");
            sea();
        } else if (command.equals("e")) {
            System.out.println("You go east.");
            desert();
        } else if (command.equals("w")) {
            System.out.println("You go west.");
            lake();
        } else if (command.equals("d")) {
            System.out.println("You try to dig down. It is difficult and you become tired.");
            System.out.println("Where do you want to go next?");

        } else {
            System.out.println("You can't go in that direction!");
        }

    }

    public static void forest() {
        System.out.println("You enter a dark forest and see trees.");
        System.out.println();
        System.out.println("Where do you want to go next?");

        move();
    }

    public static void sea() {
        System.out.println("You enter a dark sea and see water.");
        System.out.println();
        System.out.println("Where do you want to go next?");

        move();
    }

    public static void desert() {
        System.out.println("It's dry.");
        System.out.println();
        System.out.println("Where do you want to go next?");

        move();
    }

    public static void lake() {
        System.out.println("It's moist.");
        System.out.println();
        System.out.println("Where do you want to go next?");

        move();
    }

    public static void main(String[] args) {

        System.out.println("You are on an island surrounded by water.");
        System.out.println("There is a path to the forest to the north, "
                           + "the sea to the south, desert to the east, and lake to the west.");
        System.out.println();
        System.out.println("Which way do you want to go (n,e,s,w)?");

        move();

        System.out.println("End of adventure!");
        scan.close();
    }
}
