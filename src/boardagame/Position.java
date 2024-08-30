package boardagame;

public class Position {
    private Integer row, column;

    public Position() { }

    public Position(Integer column, Integer row) {
        this.column = column;
        this.row = row;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public void setValue(int row, int column){
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("positon of the Chess piece : ");
        sb.append(" in the row  " + row);
        sb.append(" and in the column  " + column);
        return sb.toString();
    }
}
