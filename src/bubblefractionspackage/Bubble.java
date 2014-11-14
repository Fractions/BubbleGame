package bubblefractionspackage;

public class Bubble {
    final int WIDTH = 10;
    final int HIEGHT = 10;
    
    int[] xLoc = new int[4];
    int[] yLoc = new int[4];

    public int[] getxLoc() {
        return xLoc;
    }

    public void setxLoc(int[] xLoc) {
        this.xLoc = xLoc;
    }

    public int[] getyLoc() {
        return yLoc;
    }

    public void setyLoc(int[] yLoc) {
        this.yLoc = yLoc;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHIEGHT() {
        return HIEGHT;
    }
}
