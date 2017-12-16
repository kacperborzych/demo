package pl.application.person.enity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "USER")
public class User implements Serializable {

    @Column(name = "ID")
    @GeneratedValue
    private Long Id;
    @Enumerated(EnumType.ORDINAL)
    private UserGender userGender;
    @Column(name ="FNAME")
    private String fName;
    @Column(name = "LNAME")
    private String lName;
    @Column(name = "PESEL")
    private int pesel;
    @Column(name = "BDAY")
    private Date birthDate;

    public User(UserGender userGender, String fnName, String lName, int pesel, Date birthDate) {
        this.userGender = userGender;
        this.fName = fnName;
        this.lName = lName;
        this.pesel = pesel;
        this.birthDate = birthDate;
    }

    public User() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public UserGender getUserGender() {
        return userGender;
    }

    public void setUserGender(UserGender userGender) {
        this.userGender = userGender;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
