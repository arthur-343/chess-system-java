package boardagame;

public class Board {
    private Integer rows, columns;
    private  Piece[][] pieces;

    public Board(Integer rows, Integer columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error creating board : there must be at least 1 row and 1 column.");
        }
        this.rows = rows;
        this.columns = columns;
    }

    public Integer getRows() {
        return rows;
    }


    public Integer getColumns() {
        return columns;
    }


    public Piece piece(int row, int column){
        if(!positionExists( row, column)){
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        if(!positionExists( position)){
            throw new BoardException("Position not on the board");
        }
    return pieces[position.getRow()][position.getColumns()];
    }
    public void placePiece(Piece piece, Position position){
        if(thereIsAPiece( position)){
            throw new BoardException("there is already a piece on position " + position);
        }
        pieces[position.getRow()][position.getColumns()] = piece;
        piece.position = position;
    }
    private boolean positionExists(int row, int column){
           return row >= 0 && row < rows && column >= 0 && column < columns;
    }
    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumns());
    }
    public boolean thereIsAPiece(Position position){
        if(thereIsAPiece( position)){
            throw new BoardException("there is already a piece on position " + position);
        }
        return piece(position) != null;
    }
}
