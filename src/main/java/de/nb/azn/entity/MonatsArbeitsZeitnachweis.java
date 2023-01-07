package de.nb.azn.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "MONATS_ARBEITS_ZEITNACHWEIS", indexes = {
        @Index(name = "IDX_MONATSARBEIT_VERGUETUNGSM", columnList = "VERGUETUNGSMODELL_ID")
})
@Entity
public class MonatsArbeitsZeitnachweis {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.DENY)
    @OneToMany(mappedBy = "monatsArbeitsZeitnachweis")
    private List<Zeiteintrag> zeiteintraege;

    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @JoinColumn(name = "VERGUETUNGSMODELL_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Verguetungsmodell verguetungsmodell;

    @Column(name = "DATUM")
    private LocalDate datum;

    @Column(name = "MONATS_SUMME", precision = 19, scale = 2)
    private BigDecimal monatsSumme;

    @Column(name = "UEBER_STUNDEN", precision = 19, scale = 2)
    private BigDecimal ueberStunden;

    @Column(name = "AUSZAHLUNGS_BETRAG", precision = 19, scale = 2)
    private BigDecimal auszahlungsBetrag;

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

    public Verguetungsmodell getVerguetungsmodell() {
        return verguetungsmodell;
    }

    public void setVerguetungsmodell(Verguetungsmodell verguetungsmodell) {
        this.verguetungsmodell = verguetungsmodell;
    }

    public List<Zeiteintrag> getZeiteintraege() {
        return zeiteintraege;
    }

    public void setZeiteintraege(List<Zeiteintrag> zeiteintraege) {
        this.zeiteintraege = zeiteintraege;
    }

    public void setMonatsSumme(BigDecimal monatsSumme) {
        this.monatsSumme = monatsSumme;
    }

    public BigDecimal getMonatsSumme() {
        return monatsSumme;
    }

    public BigDecimal getAuszahlungsBetrag() {
        return auszahlungsBetrag;
    }

    public void setAuszahlungsBetrag(BigDecimal auszahlungsBetrag) {
        this.auszahlungsBetrag = auszahlungsBetrag;
    }

    public BigDecimal getUeberStunden() {
        return ueberStunden;
    }

    public void setUeberStunden(BigDecimal ueberStunden) {
        this.ueberStunden = ueberStunden;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
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