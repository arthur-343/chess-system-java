package chess;

import boardagame.Board;
import boardagame.Position;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getColumns()][board.getRows()];
        for (int i = 0; i < board.getRows() ; i++) {
            for (int j = 0; j < board.getColumns(); j++) {
               mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    private void  placeNewPiece(char column, int row, ChessPiece piece){
            board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
    }
}
