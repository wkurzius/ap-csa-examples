import java.util.concurrent.TimeUnit;
import JavaSwingTurtle.*;

public class TurtleRun {
    public static void main(String[] args) {

        World habitat = new World(300, 300);
        World habitat2 = new World();

        Turtle yertle = new Turtle(habitat);
        Turtle yertle2 = new Turtle(20, 20, habitat);

        habitat.show(true);

        yertle.forward();
    }
}
