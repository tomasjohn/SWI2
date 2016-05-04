package cz.mendelu.seminar.swi2.bodycare.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Objednavka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Zbozi> zbozi = new HashSet<>();
	
    @NotNull
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ZAKAZNIK_ID")
    private Zakaznik zakaznik;
      
    
    public Objednavka(Zakaznik zakaznik) {
        this.zakaznik = zakaznik;
    }

    protected Objednavka() {
    }

    public int getId() {
        return id;
    }

	
    public Zakaznik getZakaznik() {
        return zakaznik;
    }
    public void setZakaznik(Zakaznik zakaznik) {
        this.zakaznik = zakaznik;
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
        if (this == o) return true;
        if (!(o instanceof Objednavka)) return false;

        Objednavka obj = (Objednavka) o;

        if (!getZakaznik().equals(obj.getZakaznik()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getZakaznik() != null ? getZakaznik().hashCode() : 0);
        return result;
    }

}
