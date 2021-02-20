package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.Color;

//construção da peça rei
public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
