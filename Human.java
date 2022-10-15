import java.sql.Date;

public abstract class Human {
    /* Длжны быть какие-то характеристики */
    protected static int number; /*Про public и privat вроде бы понятно, но я что-то упустила по части protected. Почему в примере использовался он? */

    protected String name;
    protected String familyname;
    protected Date dateOfBirth;
    protected int age;
    protected Date dateOfDeath;

    /*При этом любого из полей может вообще не быть, особенно последнего */

    /*У каждого Хумана должны быть ссылка на родителей и детей */
    public Human mather;
    public Human father;

    public Human son;
    public Human daughter;/*Как учитывать детей, если их много? */


    // void HumanAge(){
    //     if (dateOfDeath != null) age = today - dateOfBirth; /*как-то вычисляем возраст на текущий день */
    //     else age = dateOfDeath - dateOfBirth;
    // }
    
    public Human(String name, String familyname, Date dateOfBirth, Date dateOfDeath) {
        this.name = name;
        this.familyname = familyname;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.dateOfDeath = dateOfDeath;
    }

    public Human(String name, String familyname, Date dateOfBirth) {
        this.name = name;
        this.familyname = familyname;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.dateOfDeath = null;
    }

    public Human(String name, String familyname) {
        this.name = name;
        this.familyname = familyname;
        this.dateOfBirth = null;
        this.age = 0;
        this.dateOfDeath = null;
    }
    public Human() {
        this.name = "Неизвестно";
        this.familyname = "Неизвестно";
        this.dateOfBirth = null;
        this.age = 0;
        this.dateOfDeath = null;
    }


    protected void Born(Human parent1, Human parent2) {
        if (parent1 instanceof Male) /*Это должен быть интерфейс? */{
            father = parent1;
            mather = parent2;
        }
        else{
            father = parent2;
            mather = parent1;
        }
        
        
    }

    protected void Child(Human human) {
        /*и получается ещё один хуман */
        Human ch1 = new Human();
    }

    protected void Death(Date dateOfDeath) {
        
    }

}
