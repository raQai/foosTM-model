package de.kongfoos.foostm.model.table;

@Deprecated
public class Table {
    private int number;
    private TableType type;

    public Table(int number, TableType type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TableType getType() {
        return type;
    }

    public void setType(TableType type) {
        this.type = type;
    }
}
