package coretutorial.Lesson20_Java8.Lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

//Встроенные функциональные интерфейсы
public class EmbeddedFuncs {
	
	public static void main(String[] args) {
	
	/*
	Predicate<T>
	Функциональный интерфейс Predicate<T> проверяет соблюдение некоторого условия. 
	Если оно соблюдается, то возвращается значение true. 
	В качестве параметра лямбда-выражение принимает объект типа T:
	public interface Predicate<T> {
    	boolean test(T t);
	} 
	 */
	Predicate<Integer> isPositive = x -> x>0;

	/*
	Consumer<T>
	Consumer<T> выполняет некоторое действие над объектом типа T, при этом ничего не возвращая:
	public interface Consumer<T> {
    	void accept(T t);
	}
	*/
	Consumer<Integer> printer = x-> System.out.printf("%d долларов \n", x);

	/*
	Function<T,R>
	Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T
	к объекту типа R:
	public interface Function<T, R> {
    	R apply(T t);
	}
	*/
	Function<Integer, String> convert = x-> String.valueOf(x) + " долларов";

	/*
	Supplier<T>
	Supplier<T> не принимает никаких аргументов, но должен возвращать объект типа T:
	public interface Supplier<T> {
    	T get();
	}
	*/
	//пример с scanner

	/*
	UnaryOperator<T>
	UnaryOperator<T> принимает в качестве параметра объект типа T, 
	выполняет над ними операции и возвращает результат операций в виде объекта типа T:
	public interface UnaryOperator<T> {
    	T apply(T t);
	}
	*/
	UnaryOperator<Integer> square = x -> x*x;

	/* 
	BinaryOperator<T>
	BinaryOperator<T> принимает в качестве параметра два объекта типа T, 
	выполняет над ними бинарную операцию и возвращает ее результат также в виде объекта типа T: 
	public interface BinaryOperator<T> {
    	T apply(T t1, T t2);
	}	
	 */
	Function<Integer, String> intToString = x -> x.toString();
	BinaryOperator<Integer> mul = (x, y)-> x *y;
	String res = mul.andThen(intToString).apply(2, 30);
	System.out.println(res);
	
	}
	
}
