package pl.application.person.enity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "adress")
@Entity
public class Adress implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "PERSON_ID")
    private Long personId;
    @Column(name = "CITY")
    private String city;
    @Column(name = "ZIP_CODE")
    private String zip_code;
    @Enumerated(EnumType.ORDINAL)
    private AdressType adressType;
    @Column(name = "STREET")
    private String street;
    @Column(name = "HOUSE_NR")
    private int HouseNr;
    @Column(name = "FLAT_NR")
    private int flatNr;

    public Adress(Long personId, String city, String zip_code, AdressType adressType, String street, int houseNr, int flatNr) {
        this.personId = personId;
        this.city = city;
        this.zip_code = zip_code;
        this.adressType = adressType;
        this.street = street;
        HouseNr = houseNr;
        this.flatNr = flatNr;
    }

    public Adress() {
    }
}

