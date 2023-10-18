package boardgame;

public abstract class Piece {
	
	private Position position;

	public Piece(Position position) {
		this.position = position;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return (Boolean) null;
	}
	
	public boolean isThereAnyPossibleMove() {
		return null != null;
	}
}
