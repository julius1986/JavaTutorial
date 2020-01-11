package coretutorial.Lesson10_Collections.Core.LinkedListExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yuliy on 20.12.2016.
 * LinkedLink является двусвязным списком, и имеет быстрый доступ к
 * первому и последнему элементу. Так же может быстро добавлять
 * элементы в начало и конец списка. Реализует интерфейсы List,
 * Queqe. Намного медленее достает элементы по индексу.
 * Быстрое удаление и вставка элементов.
 *
 */
public class MainProgramm {
    public static void main(String[] args) {
        LinkedList<String> firstList = new LinkedList<String>();
        firstList.add("A");
        firstList.add("B");
        firstList.add("C");
        firstList.add("E");
        firstList.addFirst("ZZZ");
        Iterator<String> iterator = firstList.iterator();

        for (String temp: firstList)
        {
            System.out.println(temp);
        }
    }

}
