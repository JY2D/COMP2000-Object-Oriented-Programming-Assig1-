import java.awt.*;
import java.util.Random;

public class palmTree extends Cell {

    public palmTree (int x, int y) {
        super(x,y);
        Random rand = new Random();
        this.colour = new Color(0, rand.nextInt((255 - 100) + 1) + 100, 0);
        this.crossingTime = 2;
        this.cellPos = "PalmTree";
    }

}