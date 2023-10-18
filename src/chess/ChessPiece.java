package chess;

import boardgame.Piece;
import boardgame.Position;
import chess.Color;

public abstract class  ChessPiece  extends Piece{
	
	private Color color;
	private Integer moveCount;
	
	public ChessPiece(Position position, Color color, Integer moveCount) {
		super(position);
		this.color = color;
		this.moveCount = moveCount;
	}
	
	
	public ChessPosition getChessPosition() {
		return null;
	}
	
	
	public boolean isTherOpponentPiece(Position position) {
		return (Boolean) null;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}
}
