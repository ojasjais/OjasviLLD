package ticTacToe.model;

import ticTacToe.exception.DuplicateSymbolForPlayer;
import ticTacToe.exception.MoreThanOneBotException;
import ticTacToe.exception.PlayerAndBoardCountMismatch;
import ticTacToe.strategy.WinningStrategy;

import java.awt.datatransfer.Clipboard;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class Game {
   private List<Player> playerList;

   private Board board;
   private  Player winner ;
   private GameState gameState;
   private List<Move> moves ;
   private int nextplayerindex;
private List<WinningStrategy> winningStrategies;

   private Game(List<Player> playerList, int dimension ,List<WinningStrategy> winningStrategies) {
      this.playerList = playerList;
      this.board = new Board(dimension);
      this.winningStrategies = winningStrategies;
      this.gameState = GameState.IN_PROG;
      this.moves = new ArrayList<>();
   }


   public List<Player> getPlayerList() {
      return playerList;
   }

   public void setPlayerList(List<Player> playerList) {
      this.playerList = playerList;
   }

   public Board getBoard() {
      return board;
   }

   public void setBoard(Board board) {
      this.board = board;
   }

   public Player getWinner() {
      return winner;
   }

   public void setWinner(Player winner) {
      this.winner = winner;
   }

   public GameState getGameState() {
      return gameState;
   }

   public void setGameState(GameState gameState) {
      this.gameState = gameState;
   }

   public List<Move> getMoves() {
      return moves;
   }

   public void setMoves(List<Move> moves) {
      this.moves = moves;
   }

   public static Builder getbuilder(){
      return new Builder();
   }

   public static class Builder{
      //attribute we need validation
      private List<Player> player;
      private int dimension ;

      //constructor
      public Builder() {
         this.player = new ArrayList<>();
         this.dimension = 0;
      }
      //setter
      public Builder setPlayer(List<Player> player) {
         this.player = player;
         return this;
      }

      public Builder setDimension(int dimension) {
         this.dimension = dimension;
         return this;
      }
     // build method
      public Game Build() throws MoreThanOneBotException, PlayerAndBoardCountMismatch, DuplicateSymbolForPlayer {
         //add all validation
         validateBotCount();
         validateDimensionAndPlayerCount();
         validateUniqueSymbolForEachPlayer();
         return new Game(player,dimension);
      }

      private void validateUniqueSymbolForEachPlayer() throws DuplicateSymbolForPlayer {
         HashSet<Character> symbol= new HashSet<>();
         for(Player player : player){
            if(symbol.contains(player.getSymbol())){
               throw new DuplicateSymbolForPlayer();

            }
            symbol.add(player.getSymbol());
         }
      }

      private void validateDimensionAndPlayerCount() throws PlayerAndBoardCountMismatch {
         if(player.size() !=dimension-1){
            throw new PlayerAndBoardCountMismatch();
         }
      }

      private void validateBotCount() throws MoreThanOneBotException {
         int botCount =0;
         for( Player player: player){
            if(player.getPlayerType().equals(PlayerType.BOT)){
               botCount++;
            }
            if (botCount > 1){
               throw new MoreThanOneBotException("the bot count is more than 1");
            }
         }
      }
   }


}
