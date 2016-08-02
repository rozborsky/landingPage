package ua.rozborskyRoman.interfaces;


/**
 * Created by roman on 25.07.2016.
 */
public interface Person {

    String getName();

    String getSurname();

    String geteMail();

    String getProgrammingLanguage();

    String getExperience();

    String getCity();

    String getPhoto();

    String getCv();

    void setName(String name);

    void setSurname(String surname);

    void seteMail(String eMail);

    void setProgrammingLanguage(String programmingLanguage);

    void setExperience(String experience);

    void setCity(String city);

    void setPhoto(String photo);

    void setCv(String cv);
}