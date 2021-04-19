import java.awt.*;
import java.util.Random;

public class Sand extends Cell {

    public Sand (int x, int y) {
        super(x,y);
        Random rand = new Random();
        this.colour = new Color(255, rand.nextInt((225 - 180) + 1) + 180, 0);
        double yellowest = Math.random();
        if (yellowest < 0.8) {
            this.crossingTime = 5;
            this.cellPos = "Sand";
        }
        else {
            this.colour = new Color(255,255,0);
            this.crossingTime = 15;
            this.cellPos = "Quick Sand";
        }

    }

}