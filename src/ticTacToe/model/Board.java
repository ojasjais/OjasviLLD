package ticTacToe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;
    private int dimension ;

    public Board(int dimension) {    //constructor
        this.dimension = dimension;
        //initialize the board
         this.board =new ArrayList<>();
         for(int i =0;i <dimension;i++) {
             board.add(new ArrayList<>());
            // for single col add cell
             for (int j = 0; j < dimension; j++) {
                 board.get(i).add(new Cell(i,j));
             }
         }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
