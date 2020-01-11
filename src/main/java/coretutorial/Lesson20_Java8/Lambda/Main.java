package coretutorial.Lesson20_Java8.Lambda;

import java.util.Arrays;
import java.util.List;

public class Main {

	// лямбда выражения являются как бы сокращением анонимных классов
	// В Java 8 есть встроенные функциональные типы.
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 2, 4, 2, 3, 4);
		arr.forEach((Integer value) -> System.out.println(value));
		arr.forEach(System.out::print);

		// создаем экземпляр нашего лямбда выражения
		IExecution sum = (a, b) -> a + b;
		// после чего выполняем
		int result = sum.calculate(2, 2);
		System.out.println();
		// пример с анонимным классом
		IExecution anonimDiv = new IExecution() {
			@Override
			public int calculate(int a, int b) {
				return a - b;
			}
		};
		result = anonimDiv.calculate(10, 5);
		System.out.println(result);

		System.out.println("------------");

		ISecond<String> lambdaStringSum = (a, b) -> {
			System.out.println(a + b);
		};
		lambdaStringSum.calculate("33", "22");

		ISecond<Float> lambdaFloatSum = (a, b) -> {
			System.out.println(a + b);
		};
		lambdaFloatSum.calculate(33f, 22f);
	}

	// должен быть только 1 метод
	interface IExecution {
		int calculate(int a, int b);
	}

	interface ISecond<T> {
		void calculate(T a, T b);
	}

}
