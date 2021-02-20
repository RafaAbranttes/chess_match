package boardGame;


//classe das peças do tabuleiro
public class Piece {

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

}
