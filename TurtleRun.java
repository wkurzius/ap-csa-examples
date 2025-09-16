import JavaSwingTurtle.*;
import java.awt.*;
import java.util.*;

public class TurtleRun {
    public static void main(String[] args) {
        // Do not change the next 2 lines
        World habitat = new World(300, 300);
        Turtle yertle = new Turtle(habitat);

        // Code to make yertle move forward and turn right
        yertle.forward();
        yertle.turnRight();

        habitat.setVisible(true);
    }
}
