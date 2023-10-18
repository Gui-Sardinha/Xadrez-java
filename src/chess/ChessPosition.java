package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private Integer row;
	
	public ChessPosition(char column, Integer row) {
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}


	public Integer getRow() {
		return row;
	}

	public Position toPosition() {
		return null;
	}
	
	public ChessPosition fromPosition(Position position) {
		return null;
	}
	
}
