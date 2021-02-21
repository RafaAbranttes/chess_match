package boardGame;


//classe das peças do tabuleiro
public abstract class Piece {

	 protected Position position;
	 private Board board;
	 
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}
	
	
	//sem set para não ser alterado
	//e tem que ser protected para o resto nao ter acesso 
	//somente acessado pelo pacote boardGame
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	
	//gancho com a subclasse
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getColumn()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0 ; i < mat.length ; i ++) {
			for (int j = 0 ; j < mat.length; j ++ ) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
