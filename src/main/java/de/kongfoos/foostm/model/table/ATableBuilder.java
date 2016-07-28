package de.kongfoos.foostm.model.table;

import javax.validation.constraints.NotNull;

public abstract class ATableBuilder<T extends ATable> {

    private final int number;
    private final TableType type;

    protected ATableBuilder(@NotNull int number, @NotNull TableType type) {
        this.number = number;
        this.type = type;
    }

    protected abstract T getInstance();

    public T build() {
        final T table = getInstance();
        table.setNumber(number);
        table.setType(type);
        return table;
    }
}
