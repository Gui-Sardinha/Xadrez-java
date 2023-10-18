package chess;

public class ChessMatch {
	
	private Integer turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;
	
	public ChessMatch(Integer turn, Color currentPlayer, boolean check, boolean checkMate,
			ChessPiece enPassantVulnerable, ChessPiece promoted) {
		this.turn = turn;
		this.currentPlayer = currentPlayer;
		this.check = check;
		this.checkMate = checkMate;
		this.enPassantVulnerable = enPassantVulnerable;
		this.promoted = promoted;
	}
	
	public ChessPiece[][] getPieces(){
		return null;
	}
	
	public boolean [][] possibleMoves(ChessPosition sourcePosition){
		return null;
	}
	
	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		return null;
	}
	
	public ChessPiece replacePromotedPiece(String type) {
		return null;
	}
}
