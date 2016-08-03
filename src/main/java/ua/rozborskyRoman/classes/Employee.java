package ua.rozborskyRoman.classes;

import org.hibernate.validator.constraints.Email;
import ua.rozborskyRoman.interfaces.Person;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by roman on 20.07.2016.
 */

public class Employee implements Person{
    @NotNull
    @Size(min = 2, max = 20, message = "name must be from 2 to 20 symbols")
    private String name;

    @NotNull
    @Size(min = 2, max = 20, message = "surname must be from 2 to 20 symbols")
    private String surname;

    @NotNull
    @Email(message = "not valid e-mail")
    private String eMail;

    private String programmingLanguage;

    private String experience;

    private String city;

    private String photo;

    private String cv;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String geteMail() {
        return eMail;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public String getExperience() {
        return experience;
    }

    public String getCity() {
        return city;
    }

    public String getPhoto() {
        return photo;
    }

    public String getCv() {
        return cv;
    }

    public void setName(String name) { this.name = name; }

    public void setSurname(String surname) { this.surname = surname; }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}