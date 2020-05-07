package boardgame;

public class Piece {

	protected Position position; //� protected pois s�o as posi��es do tabuleiro, e n�o das pe�as
	private Board board;		// desta forma, s� podem ser acessada neste n�vel

	public Piece(Board board) {
		this.board = board;
		//position =null; => n�o precisa colocar, deixando em branco, fica nulo por padr�o
	}

	protected Board getBoard() { //� proteted pois somente classe do mesmo pachage
		return board;			// ou SubClasses poder�o acessar
	}
	
	
}
