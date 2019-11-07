package coretutorial.Lesson10_Collections.Core.MapExample;

/**
 * Created by Yuliy on 12.01.2017.
 */
public class Figure {
    int a, b;
    public Figure(int i, int i1) {
         a = i;
         b = i1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        if (a != figure.a) return false;
        return b == figure.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
