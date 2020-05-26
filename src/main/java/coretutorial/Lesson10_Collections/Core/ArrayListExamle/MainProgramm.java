package coretutorial.Lesson10_Collections.Core.ArrayListExamle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Yuliy on 17.12.2016.
 * Коллекции по сути это вспомогательные классы которые помогают нам хранить обьекты.
 * ArrayList - это динамический массив внутри которого находится массив. 
 * Медленно вставляет и удаляет элементы в начале и середине массива.
 * Быстрый доступ по индексу.
 * Можно задать начальный размер в конструкторе. По умолчанию равен 10.
 * При достижении лимита новый размер будет равен lastSize * 3/2 +1.
 * Пример 10 * 3 / 2 + 1 = 16.
 * При удалении элементов размер массива не уменьшается, если же мы хотим
 * подогнать массив под реальный размер нашего массива то мы можем 
 * использовать функцию trimToSize().
 */
public class MainProgramm {
    public static void main(String[] args) {
    	new ArrayList();
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
        
        //System.arraycopy() нативный метод для копирования массивов
    }
}
