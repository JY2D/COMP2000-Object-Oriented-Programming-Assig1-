import java.awt.*;
import java.util.Random;

public class Oasis extends Cell {

    public Oasis (int x, int y) {
        super(x,y);
        Random rand = new Random();
        this.colour = new Color(0, 0, rand.nextInt((255 - 100) + 1) + 100);
        this.crossingTime = 8;
        this.cellPos = "Oasis";
    }

}