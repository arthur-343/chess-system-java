package chess;

import boardagame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getColumns()][board.getRows()];
        for (int i = 0; i < board.getRows() ; i++) {
            for (int j = 0; j < board.getColumns(); j++) {
               mat[i][j] = (ChessPiece) board.pieces(i,j);
            }
        }
        return mat;
    }

}
