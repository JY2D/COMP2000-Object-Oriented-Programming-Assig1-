import java.awt.*;

class Grid {
    //fields
    Cell[][] cells = new Cell[20][20];
    Cell wall;
    Cell oasis;
    Cell palmTree;
    Cell sand;

    // constructor
    public Grid(){
        for(int x = 0; x < cells.length; x++){
            for(int y = 0; y < cells[x].length; y++){
                double m = Math.random();
                if (m < 0.16666){ // 1/3 of 50%
                    cells[x][y] = new Wall (10 + 35 * x, 10 + 35 * y);
                }
                else if (m < 0.33333){ 
                    cells[x][y] = new Oasis (10 + 35 * x, 10 + 35 * y);
                }
                else if (m < 0.5){
                    cells[x][y] = new palmTree (10 + 35 * x, 10 + 35 * y);
                }
                else{ //3 times is 50%
                    cells[x][y] = new Sand (10 + 35 * x, 10 + 35 * y);
                }
            }
        }
    }

    // methods
    public void paint(Graphics g, Point mousePos){
        for(int x = 0; x < cells.length; x++){
            for(int y = 0; y < cells[x].length; y++){
                cells[x][y].paint(g, mousePos);
            }
        }
    }

    public Cell cellAtColRow(int a, int b){
        return cells[a][b];
    }
}