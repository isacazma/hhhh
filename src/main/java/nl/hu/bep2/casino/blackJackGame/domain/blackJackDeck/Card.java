package nl.hu.bep2.casino.blackJackGame.domain.blackJackDeck;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Card {
    private TypenKaart typenKaart;
    private WaardeKaart waardeKaart;
//     maak one to many maak een sub key niet elke key oplslaan
//als je kaart string doet kan je verwijderen als ERD geen database

//    cascadeType.ALL selecteerd meteen elke subKeys van de andere klassen

private String naamKaart ;
    @Id
@GeneratedValue
    private Long id;

    public Card(TypenKaart typenKaart, WaardeKaart waardeKaart) {
        this.typenKaart = typenKaart;
        this.waardeKaart = waardeKaart;
       this.naamKaart = "de naam = "+typenKaart +""+waardeKaart;
    }

    public TypenKaart getTypenKaart() {
        return typenKaart;
    }

    public void setTypenKaart(TypenKaart typenKaart) {
        this.typenKaart = typenKaart;
    }

    public WaardeKaart getWaardeKaart() {
        return waardeKaart;
    }

    public void setWaardeKaart(WaardeKaart waardeKaart) {
        this.waardeKaart = waardeKaart;
    }

    public String getNaamKaart() {
        return naamKaart;
    }

    public void setNaamKaart(String naamKaart) {
        this.naamKaart = naamKaart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Card() {

    }

    @Override
    public String toString() {
        return "Card{" +
                "typenKaart=" + typenKaart +
                ", waardeKaart=" + waardeKaart +
                '}';
    }
}
