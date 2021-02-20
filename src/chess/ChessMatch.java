package chess;

import boardGame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

//tera as regras do jogo
public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		this.board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i = 0; i < board.getRows(); i ++) {
			for(int j = 0; j < board.getColumns(); j ++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
 	}
	
	//novo lugar da peça
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	//formação inicial do jogo de xadrez
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 6, new King(board, Color.WHITE));

	}
	
}
