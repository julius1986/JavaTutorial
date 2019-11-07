package coretutorial.Lesson10_Collections_Core.GenericsExample;

import java.io.*;
import java.util.*;
/*Generic нужны для того что бы делать ограничения на работу с типом
* обьектов, к примеру если бы мы не задавали дженерик и к примеру
* при извлечении обьектов использовали операции доступные для типа
* String то если случайно ктото положит в наш лист обьект типа Integer
* то произойдет исключение.*/
public class MainProgramm {

    public static void main(String[] args) throws IOException {
        //тут мы создаем лист в котором можно поместить и получить
        //только обьекты типа String
        List<String> list1 = new ArrayList<String>();





        /*  тут мы создаем обьект нашего класса и дженериком
        *   например в первом случае мы можем поместить обьекты
          *   типа Strint а во втором случае обьекты
          *   типа Integer */

        MyBox<String> myBox = new MyBox<String>("dsdf");
        MyBox<Integer> myBox2 = new MyBox<Integer>(12);
       myBox2.setName(12);


        // myBox.setName(new Integer(13));
        System.out.println(myBox.getClass().equals(myBox2.getClass()));


    }
}
