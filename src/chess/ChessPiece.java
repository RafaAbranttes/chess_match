package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public abstract class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	
	protected boolean isThereOpponentPiece(Position positiono) {
		ChessPiece p = (ChessPiece) getBoard().piece(positiono);
		return p != null && p.getColor() != color;
	}
}
