package br.com.omcrud.security;

public enum RoleEnum {

    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");

    private String description;

    private RoleEnum(String description) {
        this.description = description;
    }

    public String toString() {
        return this.description;
    }
}
