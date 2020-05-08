package application;

import boardgame.Board;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
	ChessMatch chessMatch = new ChessMatch();
	UI.printBoard(chessMatch.getPieces()); // imprime o tabuleiro com a função escrita na classe UI
	}

}
