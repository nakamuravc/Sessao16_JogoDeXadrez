package application;

import boardgame.Board;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
	ChessMatch chessMatch = new ChessMatch();
	UI.printBoard(chessMatch.getPieces()); // imprime o tabuleiro com a fun��o escrita na classe UI
	}

}
