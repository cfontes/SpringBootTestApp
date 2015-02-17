package br.com.omcrud.commons;

/**
 * The current status of a given OM;
 */
public enum OMStatus {
    PROPOSED("Proposed"),ONGOING("OnGoing"),Finished("Finished");

    private String description;

    private OMStatus(String text){
        this.description = text;
    }

    public String getDescription() {
        return description;
    }
}
