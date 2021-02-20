package application;

import chess.ChessPiece;

public class UI {

	//imprimindo o tabuleiro completo
	public static void printBoard(ChessPiece[][] pieces) {
		for(int i = 0 ; i < pieces.length; i ++) {
			//imprimindo as coordenadas de numericas na vertical
			System.out.print((8 - i) + " ");
			for(int j = 0 ; j < pieces.length; j ++ ) {
				//imprimindo a peça na posição
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	//imprimindo somente peça por peça
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
