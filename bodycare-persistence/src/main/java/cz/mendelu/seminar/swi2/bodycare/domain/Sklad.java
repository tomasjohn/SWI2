package cz.mendelu.seminar.swi2.bodycare.domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Sklad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(nullable = false)
    private String nazev;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Zbozi> zbozi = new HashSet<>();

    public Sklad(String nazev) {
	this.nazev = nazev;
    }

    protected Sklad() {
    }

    public int getId() {
	return id;
    }

    public String getNazev() {
	return nazev;
    }

    public void setNazev(String nazev) {
	this.nazev = nazev;
    }

    public Set<Zbozi> getZbozi() {
	return Collections.unmodifiableSet(zbozi);
    }

    public void addZbozi(Zbozi zbozi) {
	if (zbozi != null) {
	    this.zbozi.add(zbozi);
	}
    }

    @Override
    public boolean equals(Object o) {
	if (this == o) {
	    return true;
	}
	if (!(o instanceof Sklad)) {
	    return false;
	}

	Sklad sklad = (Sklad) o;

	if (!getNazev().equals(sklad.getNazev())) {
	    return false;
	}

	return true;
    }

    @Override
    public int hashCode() {
	int result = getId();
	result = 31 * result + (getNazev() != null ? getNazev().hashCode() : 0);
	return result;
    }

}
