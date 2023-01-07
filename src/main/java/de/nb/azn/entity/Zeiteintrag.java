package de.nb.azn.entity;

import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "ZEITEINTRAG", indexes = {
        @Index(name = "IDX_ZEITEINTRAG_MONATSARBEITSZ", columnList = "MONATS_ARBEITS_ZEITNACHWEIS_ID")
})
@Entity
public class Zeiteintrag {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DATUM")
    private LocalDate datum;

    @Column(name = "START_TS")
    private LocalDateTime startTs;

    @Column(name = "ENDE_TS")
    private LocalDateTime endeTs;

    @Column(name = "ZEITABSCHNITT1")
    private Double zeitabschnitt1;

    @Column(name = "ZEITABSCHNITT2")
    private Double zeitabschnitt2;

    @Column(name = "ZEITABSCHNITT3")
    private Double zeitabschnitt3;

    @Column(name = "ZEITABSCHNITT4")
    private Double zeitabschnitt4;

    @DeletedBy
    @Column(name = "DELETED_BY")
    private String deletedBy;

    @DeletedDate
    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedDate;

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @JoinColumn(name = "MONATS_ARBEITS_ZEITNACHWEIS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MonatsZeitnachweis monatsZeitnachweis;

    public MonatsZeitnachweis getMonatsArbeitsZeitnachweis() {
        return monatsZeitnachweis;
    }

    public void setMonatsArbeitsZeitnachweis(MonatsZeitnachweis monatsZeitnachweis) {
        this.monatsZeitnachweis = monatsZeitnachweis;
    }

    public void setStartTs(LocalDateTime startTs) {
        this.startTs = startTs;
    }

    public LocalDateTime getStartTs() {
        return startTs;
    }

    public void setEndeTs(LocalDateTime endeTs) {
        this.endeTs = endeTs;
    }

    public LocalDateTime getEndeTs() {
        return endeTs;
    }

    public Double getZeitabschnitt4() {
        return zeitabschnitt4;
    }

    public void setZeitabschnitt4(Double zeitabschnitt4) {
        this.zeitabschnitt4 = zeitabschnitt4;
    }

    public Double getZeitabschnitt3() {
        return zeitabschnitt3;
    }

    public void setZeitabschnitt3(Double zeitabschnitt3) {
        this.zeitabschnitt3 = zeitabschnitt3;
    }

    public Double getZeitabschnitt2() {
        return zeitabschnitt2;
    }

    public void setZeitabschnitt2(Double zeitabschnitt2) {
        this.zeitabschnitt2 = zeitabschnitt2;
    }

    public Double getZeitabschnitt1() {
        return zeitabschnitt1;
    }

    public void setZeitabschnitt1(Double zeitabschnitt1) {
        this.zeitabschnitt1 = zeitabschnitt1;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}