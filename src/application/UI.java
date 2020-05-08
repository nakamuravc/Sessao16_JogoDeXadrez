package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece [][] pieces) {
		for (int i=0; i<pieces.length; i++) { // faz a leitura das colunas
			System.out.print((8 - i) + " "); // imprime a primeira coluna com a numeração
			for (int j=0; j<pieces.length; j++) { //faz a leitura das linhas
				printPiece(pieces[i][j]);
			}
			System.out.println(); // faz a quebra de linha para não imprimir tudo na mesma linha
		}
		System.out.println("  a b c d e f g h");
	}
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-"); // sem pular linha
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" "); // deixar um espaço para que as casas não fiquem grudadas uma nas outras; 
	}
	
}
