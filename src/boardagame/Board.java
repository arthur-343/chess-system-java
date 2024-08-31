package boardagame;

public class Board {
    private Integer rows, columns;
    private  Piece[][] pieces;

    public Board(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Piece pieces(int row, int column){
        return pieces[row][column];
    }

    public Piece pieces(Position position) {
    return pieces[position.getRow()][position.getColumns()];
    }
}
