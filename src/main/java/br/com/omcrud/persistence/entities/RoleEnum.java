package br.com.omcrud.persistence.entities;

public enum RoleEnum {

    USER("User");

    private String description;

    private RoleEnum(String description) {
        this.description = description;
    }

    public String toString() {
        return this.description;
    }
}
