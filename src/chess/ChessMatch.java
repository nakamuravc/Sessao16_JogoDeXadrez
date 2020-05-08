package chess;

import boardgame.Board;
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
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
	}
}
