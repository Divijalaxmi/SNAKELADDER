package board;

import java.util.HashMap;
import jumper.Jumper;

public class Board {
    int size;
    public String[][] board;
    public HashMap<String,Jumper> jumpers;

    public Board(int size, HashMap<String,Jumper> jumpers) {
        this.size = size;
        this.jumpers = jumpers;
        this.board =  new String[size][size];
        int count = 1;
        for(int row = size-1; row>=0; row--){
            if(row%2!=0){
                for(int col = 0; col<size; col++){
                    board[row][col] = count+"";
                    count++;
                }
            }
            else{
                for(int col=size-1; col>=0; col--){
                    board[row][col]=count+"";
                    count++;
                }
            }
        }
    }

    public void printBoard(){
        for(int row = 0; row<size; row++){
            for(int col = 0; col<size; col++){
                System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
    }
    
    public int getBoardSize(){
        return this.size;
    }


}
