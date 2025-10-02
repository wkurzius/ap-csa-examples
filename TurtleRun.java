import java.util.concurrent.TimeUnit;
import JavaSwingTurtle.*;

public class TurtleRun {
    public static void main(String[] args) {

        World habitat = new World(300, 300);
        World habitat2 = new World();

        Turtle yertle = new Turtle(habitat);
        Turtle yertle2 = new Turtle(20, 20,habitat);


         habitat.show(true);

        yertle.forward();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        yertle.turnRight();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        yertle.forward();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        yertle.turnRight();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        yertle.forward();
        yertle.turnRight();

        System.out.println(getVersion());

    }

    private static int getVersion() {
        String version = System.getProperty("java.version");
        if (version.startsWith("1.")) {
            version = version.substring(2, 3);
        } else {
            int dot = version.indexOf(".");
            if (dot != -1) {
                version = version.substring(0, dot);
            }
        }
        return Integer.parseInt(version);
    }
}
