package de.nb.azn.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "JAHRES_ZEITNACHWEIS")
@Entity
public class JahresZeitnachweis {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "JAHR")
    private LocalDate jahr;

    @Column(name = "UEBERSTUNDEN")
    private BigDecimal ueberstunden;

    @OneToMany(mappedBy = "jahresZeitnachweis")
    private List<MonatsZeitnachweis> monatsEintraege;

    public void setUeberstunden(BigDecimal ueberstunden) {
        this.ueberstunden = ueberstunden;
    }

    public BigDecimal getUeberstunden() {
        return ueberstunden;
    }

    public List<MonatsZeitnachweis> getMonatsEintraege() {
        return monatsEintraege;
    }

    public void setMonatsEintraege(List<MonatsZeitnachweis> monatsEintraege) {
        this.monatsEintraege = monatsEintraege;
    }

    public LocalDate getJahr() {
        return jahr;
    }

    public void setJahr(LocalDate jahr) {
        this.jahr = jahr;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}