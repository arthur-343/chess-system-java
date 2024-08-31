package boardagame;

public class Position {
    private Integer rows, columns;

    public Position() { }

    public Position(Integer columns, Integer rows) {
        this.columns = columns;
        this.rows = rows;
    }

    public Integer getRow() {
        return rows;
    }

    public void setRow(Integer row) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumn(Integer columns) {
        this.columns = columns;
    }

    public void setValue(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("positon of the Chess piece : ");
        sb.append(" in the rows  " + rows);
        sb.append(" and in the columns  " + columns);
        return sb.toString();
    }
}
