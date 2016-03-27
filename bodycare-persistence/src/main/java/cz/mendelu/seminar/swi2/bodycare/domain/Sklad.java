package cz.mendelu.seminar.swi2.bodycare.dao;

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
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sklad)) return false;

        Sklad sklad = (Sklad) o;

        if (!getNazev().equals(sklad.getNazev()))
            return false;
        
        return true;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getNazev() != null ? getNazev().hashCode() : 0);
        return result;
    }

}
