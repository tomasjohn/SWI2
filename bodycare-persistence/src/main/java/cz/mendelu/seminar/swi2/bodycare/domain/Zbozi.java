package cz.mendelu.seminar.swi2.bodycare.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Zbozi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(nullable = false)
    private int cena;
    
    @NotNull
    @Column(nullable = false)
    private int dan;
	
    @NotNull
    @Column(nullable = false)
    private String nazev;

    @Column()
    private String znacka;

    public Zbozi(int cena, int dan, String nazev, String znacka) {
        this.cena = cena;
        this.dan = dan;
        this.nazev = nazev;
        this.znacka = znacka;
    }

    protected Zbozi() {
    }

    public int getId() {
        return id;
    }
	
	public int getCena() {
        return cena;
    }
    public void setCena(int cena) {
        this.cena = cena;
    }

	public int getDan() {
        return dan;
    }
    public void setDan(int dan) {
        this.dan = dan;
    }
	public String getNazev() {
        return nazev;
    }
    public void setNazev(String nazev) {
        this.nazev = nazev;
    }	
	
	public String getZnacka() {
        return znacka;
    }
    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zbozi)) return false;

        Zbozi zbozi = (Zbozi) o;

        if (getCena() != zbozi.getCena()) return false;
        if (getDan() != zbozi.getDan()) return false;
        if (getNazev() != null ? !getNazev().equals(zbozi.getNazev()) : zbozi.getNazev() != null)
            return false;
        if (getZnacka() != null ? !getZnacka().equals(zbozi.getZnacka()) : zbozi.getZnacka() != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getNazev() != null ? getNazev().hashCode() : 0);
        result = 31 * result + getDan();
        result = 31 * result + (getZnacka() != null ? getZnacka().hashCode() : 0);
        return result;
    }

}
