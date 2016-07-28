package de.kongfoos.foostm.model.table;

import javax.validation.constraints.NotNull;

public abstract class ATableBuilder<T extends ATable> {

    private final int id;
    private final TableType type;

    protected ATableBuilder(@NotNull int id, @NotNull TableType type) {
        this.id = id;
        this.type = type;
    }

    protected abstract T getInstance();

    public T build() {
        final T table = getInstance();
        table.setID(id);
        table.setType(type);
        return table;
    }
}
