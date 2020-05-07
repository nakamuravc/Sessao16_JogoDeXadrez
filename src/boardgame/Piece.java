package boardgame;

public class Piece {

	protected Position position; //é protected pois são as posições do tabuleiro, e não das peças
	private Board board;		// desta forma, só podem ser acessada neste nível

	public Piece(Board board) {
		this.board = board;
		//position =null; => não precisa colocar, deixando em branco, fica nulo por padrão
	}

	protected Board getBoard() { //é proteted pois somente classe do mesmo pachage
		return board;			// ou SubClasses poderão acessar
	}
	
	
}
