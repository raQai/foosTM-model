package de.kongfoos.foostm.model;

public enum RegistrationStatus {
    COMPLETE("Complete"),
    OPEN("Open"),
    PREREGISTERED("Preregistered"),
    REGISTERED("Registered");

    private final String status;

    RegistrationStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
