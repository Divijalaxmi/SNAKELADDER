package coordinates;

public class Coordinates {
    int row,col;
    
    public Coordinates(int row, int col){
        this.row = row;
        this.col = col;
    }

    public String printCoordinates() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(row).append(",").append(col).append("]");
        return sb.toString();
    }

    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }
}
