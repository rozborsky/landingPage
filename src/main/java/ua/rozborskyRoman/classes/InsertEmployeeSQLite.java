package ua.rozborskyRoman.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ua.rozborskyRoman.interfaces.InsertEmployee;
import ua.rozborskyRoman.interfaces.Person;

import javax.sql.DataSource;

/**
 * Created by roman on 25.07.2016.
 */
@Component("insertToSQLite")
public class InsertEmployeeSQLite implements InsertEmployee{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("datasourceSQLite")
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(Person employee) {
        String sql = "INSERT INTO employee (name, surname, email, language, experience, city, photo, cv) " +
                "VALUES (?,?,?,?,?,?,?,?)";

        try{
            jdbcTemplate.update(sql, new Object [] {employee.getName(), employee.getSurname(), employee.geteMail(),
                    employee.getProgrammingLanguage(), employee.getExperience(), employee.getCity(),
                    employee.getPhoto(), employee.getCv()});
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
