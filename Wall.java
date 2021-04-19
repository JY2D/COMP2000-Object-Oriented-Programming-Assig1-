import java.awt.*;

public class Wall extends Cell {

    public Wall (int x, int y) {
        super(x, y);
        this.colour = Color.DARK_GRAY;
        this.crossingTime = 1000;
        this.cellPos = "Wall";
    }

}