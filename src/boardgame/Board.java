package boardgame;

public class Board {
	
	private Integer rows;
	private Integer columns;
	
	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	public Piece piece(Integer row, Integer columns) {
		return null;
	}
	
	public Piece piece(Position position) {
		return null;
	}
	
	public void placePiece(Piece pice, Position position) {
		
	}
	
	public Piece removePiece(Position position) {
		return null;
	}
	
	public boolean positionExists(Position position) {
		return null != null;
	}
	
	public boolean thereIsAPiece(Position position) {
		return null != null;
	}
}
