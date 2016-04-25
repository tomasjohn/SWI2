package cz.mendelu.seminar.swi2.bodycare.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Zakaznik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(nullable = false)
    private String jmeno;

    @Column()
    private String adresa;
    
    @Column()
    private int cena;
    
    @Column()
    private int dan;

    public Zakaznik(int cena, int dan, String jmeno,String adresa) {
        this.cena = cena;
        this.dan = dan;
        this.jmeno = jmeno;
        this.adresa = adresa;
    }
    
    protected Zakaznik() {
    }

    public int getId() {
        return id;
    }
	public String getJmeno() {
        return jmeno;
    }
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }	
	
	public String getAdresa() {
        return adresa;
    }
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zakaznik)) return false;

        Zakaznik zakaznik = (Zakaznik) o;

        if (getJmeno() != null ? !getJmeno().equals(zakaznik.getJmeno()) : zakaznik.getJmeno() != null)
            return false;
        if (getAdresa() != null ? !getAdresa().equals(zakaznik.getAdresa()) : zakaznik.getAdresa() != null)
            return false;
        

        return true;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getAdresa() != null ? getAdresa().hashCode() : 0);
        return result;
    }

}
