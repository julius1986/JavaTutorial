package coretutorial.Lesson10_Collections_Core.CollectionExample.ArrayListExamle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Yuliy on 17.12.2016.
 * Коллекции по сути это вспомогательные классы которые помогают
 * нам хранить обьекты.
 */
public class MainProgramm {
    public static void main(String[] args) {

        //Интерфейс List
        //для удаления по значению нужно использовать Iterator
        //Класс ArrayList
        List<Integer> listArray = new ArrayList();
        List<Integer> listArray2 = new ArrayList();
        listArray.add(1);
        listArray.add(2);
        listArray.add(3);
        listArray2.add(4);
        listArray2.add(5);
        listArray2.add(5);
        //так же в наш лист мы можем вставлять другой лист, так же
        //мы можем указывать с какого индекса осуществлять вставку
        listArray.addAll(listArray2);
        listArray.remove(1);//удаление по индексу
        //получаем итератор нашего листа
        Iterator iteratorArrayList = listArray.iterator();
        //после чего запускаем цикл while
        //если существует следующий элемент переходим к нему
        //затем проверяем равен ли он значению которое мы хотим
        //удалить из нашего листа, если да то вызываем метод remove()
        while (iteratorArrayList.hasNext())
        {
            if (iteratorArrayList.next().equals(3))
                iteratorArrayList.remove();
        }
        for (Integer tempElement : listArray)
        {
            System.out.println(tempElement);
        }

    }
}
