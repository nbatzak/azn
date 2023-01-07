package de.nb.azn.entity;

import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "VERGUETUNGSMODELL")
@Entity
public class Verguetungsmodell {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "GELTUNGS_JAHRGANG_VON")
    private LocalDate geltungsJahrgangVon;

    @Column(name = "GELTUNGS_JAHRGANG_BIS")
    private LocalDate geltungsJahrgangBis;

    @Column(name = "ZEITABSCHNITT1_PREIS")
    private BigDecimal zeitabschnitt1Preis;

    @Column(name = "ZEITABSCHNITT2_PREIS")
    private BigDecimal zeitabschnitt2Preis;

    @Column(name = "ZEITABSCHNITT3_PREIS")
    private BigDecimal zeitabschnitt3Preis;

    @Column(name = "ZEITABSCHNITT4_PREIS")
    private BigDecimal zeitabschnitt4Preis;

    @Column(name = "AKTIV")
    private String aktiv;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @DeletedBy
    @Column(name = "DELETED_BY")
    private String deletedBy;

    @DeletedDate
    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedDate;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "verguetungsmodell")
    private MonatsZeitnachweis monatsZeitnachweis;

    public MonatsZeitnachweis getMonatsArbeitsZeitnachweis() {
        return monatsZeitnachweis;
    }

    public void setMonatsArbeitsZeitnachweis(MonatsZeitnachweis monatsZeitnachweis) {
        this.monatsZeitnachweis = monatsZeitnachweis;
    }

    public void setZeitabschnitt1Preis(BigDecimal zeitabschnitt1Preis) {
        this.zeitabschnitt1Preis = zeitabschnitt1Preis;
    }

    public BigDecimal getZeitabschnitt1Preis() {
        return zeitabschnitt1Preis;
    }

    public void setZeitabschnitt2Preis(BigDecimal zeitabschnitt2Preis) {
        this.zeitabschnitt2Preis = zeitabschnitt2Preis;
    }

    public BigDecimal getZeitabschnitt2Preis() {
        return zeitabschnitt2Preis;
    }

    public void setZeitabschnitt3Preis(BigDecimal zeitabschnitt3Preis) {
        this.zeitabschnitt3Preis = zeitabschnitt3Preis;
    }

    public BigDecimal getZeitabschnitt3Preis() {
        return zeitabschnitt3Preis;
    }

    public void setZeitabschnitt4Preis(BigDecimal zeitabschnitt4Preis) {
        this.zeitabschnitt4Preis = zeitabschnitt4Preis;
    }

    public BigDecimal getZeitabschnitt4Preis() {
        return zeitabschnitt4Preis;
    }

    public LocalDate getGeltungsJahrgangVon() {
        return geltungsJahrgangVon;
    }

    public void setGeltungsJahrgangVon(LocalDate geltungsJahrgangVon) {
        this.geltungsJahrgangVon = geltungsJahrgangVon;
    }

    public LocalDate getGeltungsJahrgangBis() {
        return geltungsJahrgangBis;
    }

    public void setGeltungsJahrgangBis(LocalDate geltungsJahrgangBis) {
        this.geltungsJahrgangBis = geltungsJahrgangBis;
    }

    public String getAktiv() {
        return aktiv;
    }

    public void setAktiv(String aktiv) {
        this.aktiv = aktiv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}