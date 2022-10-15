import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Search {

    void Rations(Human person1, Human person2){
        /*Дано два человека. Нужно выяснить, кем они друг другу приходятся 
         * Идея в том, чтобы проверить старше или младше второй человек. Если старше лезем вверх и проверяем старше ли он родителей и т.д.
        */
        Human first = person1;
        List<String> line = new ArrayList<>();
        for first != person2{
            if (person1.dateOfBirth <= person2.dateOfBirth){ 
                /*Надо проверить не является ли person2 матерью или отцом */
                if (person2 == person1.mather){
                    System.out.printf("%d мать %d", person2.name, person1.name);
                }
                if (person2 == person1.father){
                    System.out.printf("%d отец %d", person2.name, person1.name);
                }
                else{
                    first = person1.mather;/*Не понятно как выбрать к кому первому идти к матери или отцу */
                    line.add("mather");
                } 

            }/*По идее Если нужное имя не нашлось среди родни по материнской линии надо переходить к другой, Как это сделать*/
            else{
                first = person1.son;;
                line.add("son");
            }
        }
        /*Потом берём получившийся список и в зависимости от того что получилось решаем */
        if ((String) line == "mather mather") System.out.printf("%d бабушка %d", person2.name, person1.name); /*не очень мне нравится это решение... */
    }
    /*А вот как быть, если даты рождения какого-нибудь прадедушки нет вообще? */
}
