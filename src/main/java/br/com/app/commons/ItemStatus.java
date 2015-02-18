package br.com.app.commons;

/**
 * The current status of a given OM;
 */
public enum ItemStatus {
    PROPOSED("Proposed"),ONGOING("OnGoing"),Finished("Finished");

    private String description;

    private ItemStatus(String text){
        this.description = text;
    }

    public String getDescription() {
        return description;
    }
}
