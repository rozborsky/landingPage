package ua.rozborskyRoman.classPackage;

import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by roman on 20.07.2016.
 */

public class user {
    @NotNull
    @Size(min = 2, max = 20, message = "name must be from 2 to 20 symbols")
    private String name;

    @NotNull
    @Size(min = 2, max = 20, message = "surname must be from 2 to 20 symbols")
    private String surname;

    @NotNull
    @Email(message = "not valid e-mail")
    private String eMail;

    private String fieldOne;

    private String fieldTwo;

    private String fieldThree;

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

    public String getFieldOne() {
        return fieldOne;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public String getFieldThree() {
        return fieldThree;
    }

    public String getPhoto() {
        return photo;
    }

    public String getCv() {
        return cv;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setFieldOne(String fieldOne) {
        this.fieldOne = fieldOne;
    }

    public void setFieldTwo(String fieldTwo) {
        this.fieldTwo = fieldTwo;
    }

    public void setFieldThree(String fieldThree) {
        this.fieldThree = fieldThree;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}