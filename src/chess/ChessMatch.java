package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
// classe com as regras da partida de xadrez
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){  //O Objeto ChessPiece é uma matriz bidimensional
		ChessPiece[][] mat = new ChessPiece[board.getRows()][ board.getColumns()]; //criou um tabuleiro temporário
		for (int i=0; i<board.getRows(); i++) { // faz a leitura da linhas do tabuleiro
			for (int j=0; j<board.getColumns(); j++) { // faz a leitura da colunas do tabuleiro
				mat[i][j] = (ChessPiece) board.piece(i, j); // não existe board.piece, por isso foi feito um downcasting para ChessPiece
			}									// aqui, está se igualando o tabuleiro real (Boar) com o tabuleiro virtual (ChessMatch)
		}
		return mat;
	}
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
}
