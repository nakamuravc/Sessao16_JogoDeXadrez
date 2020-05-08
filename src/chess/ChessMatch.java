package chess;

import boardgame.Board;

public class ChessMatch {
// classe com as regras da partida de xadrez
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
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
	
}
