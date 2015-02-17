package br.com.omcrud.persistence.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.omcrud.commons.OMStatus;

/**
 * Represents and OM
 */
@Entity
public class OMEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany(mappedBy = "oms")
    private List<User> author;

    private String title;

    private String description;

    @Enumerated
    private OMStatus status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedEndDate;

    private int estimatedEffortInHours;

    private long valueSavedInCents;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<User> getAuthor() {
        return author;
    }

    public void setAuthor(List<User> author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OMStatus getStatus() {
        return status;
    }

    public void setStatus(OMStatus status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEstimatedEndDate() {
        return estimatedEndDate;
    }

    public void setEstimatedEndDate(Date estimatedEndDate) {
        this.estimatedEndDate = estimatedEndDate;
    }

    public int getEstimatedEffortInHours() {
        return estimatedEffortInHours;
    }

    public void setEstimatedEffortInHours(int estimatedEffortInHours) {
        this.estimatedEffortInHours = estimatedEffortInHours;
    }

    public long getValueSavedInCents() {
        return valueSavedInCents;
    }

    public void setValueSavedInCents(long valueSavedInCents) {
        this.valueSavedInCents = valueSavedInCents;
    }
}
