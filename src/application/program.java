package application;

import boardagame.Position;
import chess.ChessMatch;

public class program {
    public static void main(String[] args) {
//        System.out.println(" aaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//
//        Position p = new Position(3, 5);
//        System.out.println(p.toString());
//    }

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}