package de.kongfoos.foostm.model.team;

public enum Type {
    SINGLES, DOUBLES, TEAM;

    public boolean isSingles() {
        return this.equals(SINGLES);
    }

    public boolean isDoubles() {
        return this.equals(DOUBLES);
    }

    public boolean isTeam() {
        return this.equals(TEAM);
    }
}
