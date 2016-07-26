package de.kongfoos.foostm.model.table;

public abstract class GenericTable<K, T> {
    private K number;
    private T type;

    public GenericTable(K number, T type) {
        this.number = number;
        this.type = type;
    }

    public K getNumber() {
        return number;
    }

    public abstract void setNumber(K number);

    public T getType() {
        return type;
    }

    public abstract void setType(T type);
}
