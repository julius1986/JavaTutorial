package coretutorial.Lesson10_Collections.Core.GenericsExample;

/**
 * Created by Yuliy on 10.12.2016.
 * Тут мы создаем контейнер бокс где задаем параметр
 * <T> который и будет нашим ограничителем.
 * Тоесть если мы задаем Generic к примеру тип Integet
 * то получать и возвращать будем обьекты типа Integer.
 */
public class MyBox<T> {
    private T name;

    public MyBox(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
