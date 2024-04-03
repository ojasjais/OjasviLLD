package ticTacToe.strategy;

import ticTacToe.model.Board;
import ticTacToe.model.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);

}
