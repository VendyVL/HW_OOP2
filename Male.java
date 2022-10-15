import java.sql.Date;

public class Male extends Human {
    public Male(String name, String familyname, Date dateOfBirth) {
        this.name = name;
        this.familyname = familyname;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.dateOfDeath = null;
        System.out.println(name);
    }
}
