import java.sql.Date;


public class Female extends Human{
    public Female(String name, String familyname, Date dateOfBirth) {
        this.name = name;
        this.familyname = familyname;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.dateOfDeath = null;
        System.out.println(name);
    }
}
