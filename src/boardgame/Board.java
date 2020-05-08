package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; //a matriz pieces ser� formada pela quantidade de linhas e colunas
	}
	public int getRows() { //somente get pois n�o se pode alterar a quantidade linhas/colunas
		return rows;
	}

	public int getColumns() { //somente get pois n�o se pode alterar a quantidade linhas/colunas
		return columns;
	}
	
	public Piece piece(int row, int column) {  //comando para imprimir a matriz do board
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()]; //outra matriz, com as poss�veis posi��es de movimenta��o das pe�as
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
				piece.position = position;
	}
	
	public boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns; // primeira condi��o de usa posi��o existir � ela estar dentro do tabuleiro
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
}
