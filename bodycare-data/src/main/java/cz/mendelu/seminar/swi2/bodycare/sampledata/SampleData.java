package cz.mendelu.seminar.swi2.bodycare.sampledata;

import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;
import cz.mendelu.seminar.swi2.bodycare.domain.Zakaznik;
import cz.mendelu.seminar.swi2.bodycare.domain.Objednavka;
import cz.mendelu.seminar.swi2.bodycare.domain.Sklad;
import cz.mendelu.seminar.swi2.bodycare.service.ObjednavkaService;
import cz.mendelu.seminar.swi2.bodycare.service.SkladService;
import cz.mendelu.seminar.swi2.bodycare.service.ZakaznikService;
import cz.mendelu.seminar.swi2.bodycare.service.ZboziService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
   



@Component
@Transactional
public class SampleData {

    @Autowired
    private ObjednavkaService objednavkaService;

    @Autowired
    private SkladService skladService;

    @Autowired
    private ZakaznikService zakaznikService;

    @Autowired
    private ZboziService zboziService;

    public void loadData() {
        
   	Zbozi n1 = zbozi(200, 20, "Tělové mléko", "Nivea");
	Zbozi n2 = zbozi(300, 30, "Pleťový krém", "Nivea");
	Zbozi n3 = zbozi(250, 25, "Hydratační krém", "Nivea");
	Zbozi n4 = zbozi(350, 35, "Denní krém", "Nivea");
        
	Zbozi e1 = zbozi(1000, 100, "Krém proti vráskám", "Eucerin");
	Zbozi e2 = zbozi(300, 30, "Oční krém", "Eucerin");
	Zbozi e3 = zbozi(550, 55, "Regenerační krém", "Eucerin");
	Zbozi e4 = zbozi(1500, 150, "Proti-atopický krém", "Eucerin");
        
	Zbozi b1 = zbozi(200, 20, "Micelární voda", "Bioderma");
	Zbozi b2 = zbozi(250, 25, "Mléko na opalování", "Bioderma");
	Zbozi b3 = zbozi(300, 30, "Sébium krém", "Bioderma");
	Zbozi b4 = zbozi(350, 35, "Tělový krém", "Bioderma");

	Zakaznik z1 = zakaznik(0, "Honza Pepa", "Uliční 97, Brno");
	Zakaznik z2 = zakaznik(0, "Jarda Jágr", "Kladenská 68, Kladno");
	Zakaznik z3 = zakaznik(0, "Kája Gotů", "Nemocniční 1, Praha");
	Zakaznik z4 = zakaznik(0, "Ewička Farná", "Polská 7, Varšava");
	Zakaznik z5 = zakaznik(0, "Wade Wilson", "Holywood 5, Los Angales");
        
	Sklad s1 = sklad("Centrální sklad");
	Sklad s2 = sklad("Brněnský sklad");
	
	s1.addZbozi(n1);
	s1.addZbozi(n2);
	s1.addZbozi(n3);
	s1.addZbozi(n4);
        
	s1.addZbozi(e1);
	s1.addZbozi(e2);
	s1.addZbozi(e3);
	s1.addZbozi(e4);
        
	s1.addZbozi(b1);
	s1.addZbozi(b2);
	s1.addZbozi(b3);
	s1.addZbozi(b4);
	
//        s2.addZbozi(n1);
//	s2.addZbozi(n3);
//	s2.addZbozi(n4);
//	s2.addZbozi(e1);
//	s2.addZbozi(e4);
//	s2.addZbozi(b2);
//	s2.addZbozi(b3);
//	s2.addZbozi(b4);

	Objednavka o1 = objednavka(z1);
        Objednavka o2 = objednavka(z2);
	Objednavka o3 = objednavka(z3);
	Objednavka o4 = objednavka(z4);
	Objednavka o5 = objednavka(z5);

	o1.addZbozi(n1);
	o1.addZbozi(n2);
	o1.addZbozi(n3);
	
	o2.addZbozi(e2);
	
	o3.addZbozi(n4);

	o4.addZbozi(b1);
	o4.addZbozi(b2);
	o4.addZbozi(b3);
	o4.addZbozi(b4);
	
	o5.addZbozi(e1);
	o5.addZbozi(e3);
	o5.addZbozi(e4);
	
    }

    private Objednavka objednavka(Zakaznik zakaznik) {
	Objednavka objednavka = new Objednavka(zakaznik);
	objednavkaService.create(objednavka);
	return objednavka;
    }

    private Sklad sklad(String nazev) {
	Sklad sklad = new Sklad(nazev);
	skladService.create(sklad);
	return sklad;
    }

    private Zakaznik zakaznik(int sleva, String jmeno, String adresa) {
	Zakaznik zakaznik = new Zakaznik(sleva, jmeno, adresa);
	zakaznikService.create(zakaznik);
	return zakaznik;
    }

    private Zbozi zbozi(int cena, int dan, String nazev, String znacka) {
	Zbozi zbozi = new Zbozi(cena, dan, nazev, znacka);
	zboziService.create(zbozi);
	return zbozi;
    }

}
