package ticTacToe.strategy;

import ticTacToe.model.Board;
import ticTacToe.model.Cell;

public interface BotPlayingStrategy {
    Cell makeMove(Board board);
}
