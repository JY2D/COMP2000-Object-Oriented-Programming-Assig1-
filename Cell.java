import java.awt.*;

class Cell extends Rectangle {
    // fields
    static int size = 35;
    Color colour;
    int crossingTime;
    String cellPos;

    //constructors
    public Cell(int x, int y){
        super(x,y,size,size);
    }

    //methods
    void paint(Graphics g, Point mousePos){
        if(contains(mousePos)){
            g.drawString("Cell Type: " + cellPos, 750, 40);
            g.drawString("Crossing Time: " + crossingTime, 750, 60);
            g.setColor(Color.GRAY);
        } else {
            g.setColor(colour);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
        g.setFont(new Font("Calibri", Font.PLAIN, 16)); 
    }

    public boolean contains(Point p){
        if (p != null){
            return super.contains(p);
        } else {
            return false;
        }
    }
    
    public String getcellPos(){
        return cellPos;
    }
    
    public int getcrossingTime(){
        return crossingTime;
    }
}