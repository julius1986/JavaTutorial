package coretutorial.Lesson20_Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

	/*
	 * Стримы это поток данных, который мы обрабатываем операторами.
	 * Данные для стрима могут быть полученны из методов или коллекций.
	 * Так же из массива.
	 * Операторы бывают двух типов:
	 * Промежуточные - которые обрабатывают данные полученные из стрима,
	 * таких операторов может быть много.
	 * Терминальные - которые заканчивают стрим, 
	 * такой оператор может быть только один
	 * 
	 * Стрим будет выполнен только тогда, когда будет вызван
	 * терминальный оператор. 
	 * Стрим выполняется от терминального оператора к предыдущим, как только
	 * какой либо оператор выше но может поставлять данные, стрим закончится.
	 * 
	 * Стримы бывают последовательными (sequential) и параллельными (parallel).
	 * Чтобы получить параллельный стрим, нужно либо вызвать метод parallelStream() 
	 * вместо stream(), либо превратить обычный стрим в параллельный, 
	 * вызвав промежуточный оператор parallel(). 
	 * */
	
	/*
	 * Получения стримов
	 * Arrays.steam(arr); //преобразование массива в стрим
	 * list.parallelStream(); //преобразует лист в параллельный стрим
	 * IntStream.range(0, 10000); //создает стрим от 0 до 10000
	 * IntStream, LongStream, DoubleStream // стримы для примитивов
	 * Stream.generate(() -> 6) //бесконечно возвращает 6, можно просто поставить лимит 
	 * Stream.iterate(2, x -> x + 6) // возвращает бесконечный стрим, начальный x = 2 
	 * Stream.concat(stream1, stream2).termOp();// позволяет обьединить 2 стрима 
	 * IntStream.rangeClosed(0, 5) // создает стрим от 0 до 5 - включительно
	 *  
	 *  ПРОМЕЖУТОЧНЫЕ
	 * .parallel() //преобразует стрим в параллельный
	 * .filter(el -> el.name.equal("zzz") ) //фильтрует данные
	 * .map(el -> "***" + el "***"); //добавляет звездочки элементу, но не изменяет оригинал
	 * .limit(4) - ограничивает количество элементов до 4
	 * .skip(40) - пропускает 40 элементов
	 * .ofNullable(el); // возвращает пустой стрим если el = null
	 * .distinct() // уберает повторяющиеся элементы
	 * .peek()//аналог forEach, только не терминальный
	 * .takeWhile(условие)//В Java9, выполняет стрим пока верно условие
	 * .boxed()// Преобразует примитивный стрим в объектный.
	 * ТЕРМИНАЛЬНЫЕ
	 * .forEach(System.out::println); // применяет к каждому элементу стрима
	 * .collect(Collectors.toList()); // заканчивает стрим и получает list данных
	 * .sum(); //только для примитивных типов
	 * .avarage(); //только для примитивных типов
	 * .count(); // возвращает число элементов в стриме
	 * .reduce(); // работает как аккумулятор 
	 * .min(Integer::compare).get();//минимальный элемент
	 * .max(Integer::compare).get();//максимальный элемент
	 * .findAny() // возвращает любой элемент
	 * .findFirst() // гарантировано возвращает первый элемент
	 * .allMatch(x -> x <= 7); // возвращает true если все элементы проходят условие
	 * .anyMatch(); //возвращает true если хотябы 1 элемент пройдет условие
	 * .noneMatch(); // вернет true если все элементы не соответствуют условию
	 * .sorted(); //сортирует стрим, можно подставить свой компаратор
	 * */
	
	/* методы Collectors позволяет вернуть данные из стрима ввиде коллекции и тд.*/
	//toList​() Самый распространённый метод. Собирает элементы в List.
	//toSet​() Собирает элементы в множество.
	/*toCollection​(Supplier collectionFactory)
	Собирает элементы в заданную коллекцию. 
	Если нужно конкретно указать, какой List, Set или другую коллекцию мы 
	хотим использовать, то этот метод поможет.*/
	
	
	public static void main(String[] args) {
		
		 
		/* 
		 *Stream.empty();  //Пустой стрим. Stream<String>
		 *list.stream(); //стрим из листа. Stream<String>
		 *map.entrySet().stream() //Stream<Map.Entry<String, String>>
		 *Arrays.stream(array) // Stream<String>
		 *Stream.of("a", "b", "c") // Stream<String>
		 * */
		
		/*создаем бесконечный поток с начальным x = 0, и каждую итерацию +1*/
		Stream.iterate(0, x -> x + 1)
		.limit(20)//лимит 20 раз, может вернуть только 20 значений
		.forEach(el -> System.out.println(el));
		
		/*второй вариант iterate, позволяющий реализовать аналог for*/
		//Доступен в Java 9 
//		Stream.iterate(2, x -> x < 25, x -> x + 6)
//	    .forEach(System.out::println);
	// 2, 8, 14, 20
		
		//Обьединяет 2 стрима. Stream.concat();
		Stream.concat(
				Stream.of(1,2,3,4), 
				Stream.of(9,7,6,5,4))
		.forEach(System.out::print);
		
		/*
		builder()
		Создаёт мутабельный объект для добавления элементов в стрим без использования 
		какого-либо контейнера для этого.
		*/
		Stream.Builder<Integer> streamBuider = Stream.<Integer>builder()
		        .add(0)
		        .add(1);
		for (int i = 2; i <= 8; i += 2) {
		    streamBuider.accept(i);
		}
		streamBuider
		    .add(9)
		    .add(10)
		    .build()
		    .forEach(System.out::println);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		/*map применяет функцию к каждому элементу и возвращает стрим*/
		//так же может быть использован для преобразования типов
		Stream.of("1","3", "33", "21", "53")
		.mapToInt(Integer::parseInt).forEach(System.out::print);
		Stream.of("1","3", "33", "21", "53")
		.map(el -> " --- " + el + " --- ")
		.forEach(System.out::print);
		
		
		/*
		flatMap​(Function<T, Stream<R>> mapper)
		Один из самых интересных операторов. 
		Работает как map, но с одним отличием — можно преобразовать один элемент 
		в ноль, один или множество других.
		 */
		IntStream.of(2, 3, 0, 1, 3)
		.flatMap(x -> IntStream.range(0, x))
		.forEach(System.out::print);
	// 0, 1, 0, 1, 2, 0, 0, 1, 2
		
//		boxed()
//		Преобразует примитивный стрим в объектный.
		DoubleStream.of(0.1, Math.PI)
	    .boxed()
	    .map(Object::getClass)
	    .forEach(System.out::println);
	// class java.lang.Double
	// class java.lang.Double
		
		
		/*
		 void forEachOrdered​(Consumer action)
		Тоже выполняет указанное действие для каждого элемента стрима, 
		но перед этим добивается правильного порядка вхождения элементов. 
		Используется для параллельных стримов, когда нужно получить правильную 
		последовательность элементов. 
		 */
		IntStream.range(0, 100000)
	    .parallel()
	    .filter(x -> x % 10000 == 0)
	    .map(x -> x / 10000)
	    .forEachOrdered(System.out::println);
	// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		
		
//		R collect​(Collector collector)
//		Один из самых мощных операторов Stream API. 
//		С его помощью можно собрать все элементы в список, 
//		множество или другую коллекцию, сгруппировать элементы по какому-нибудь 
//		критерию, объединить всё в строку и т.д.. 
//		В классе java.util.stream.Collectors очень много методов на все случаи жизни
//		При желании можно написать свой коллектор, реализовав интерфейс Collector.
		List<Integer> list2 = Stream.of(1, 2, 3)
			    .collect(Collectors.toList());
			// list: [1, 2, 3]
			 
			String s = Stream.of(1, 2, 3)
			    .map(String::valueOf)
			    .collect(Collectors.joining("-", "<", ">"));
			// s: "<1-2-3>"
		
		//работает как аккумулятор
		int sumReduce = Stream.of(1, 2, 3, 4, 5)
				    .reduce(10, (acc, x) -> acc + x);
				// sum: 25
		
		//мин макс элементы
		int z = Stream.of(11,2,5,3,4,5,6,3)
				.min(Integer::compare)
				.get();
		
		
		/*toCollection​(Supplier collectionFactory)
		Собирает элементы в заданную коллекцию. 
		Если нужно конкретно указать, какой List, Set или другую коллекцию мы 
		хотим использовать, то этот метод поможет.*/
		List<Integer> list3 = Stream.of(1, 2, 3, 4, 5)
			    .collect(Collectors.toCollection(ArrayList::new));
			 
		Set<Integer> set = Stream.of(1, 2, 3, 4, 5)
			    .collect(Collectors.toCollection(LinkedHashSet::new));
		
		/*toMap​(Function keyMapper, Function valueMapper)
		Собирает элементы в Map. 
		Каждый элемент преобразовывается в ключ и в значение, 
		основываясь на результате функций keyMapper и valueMapper соответственно. 
		Если нужно вернуть тот же элемент, что и пришел, 
		то можно передать Function.identity().*/
		Map<Integer, Integer> map1 = Stream.of(1, 2, 3, 4, 5)
			    .collect(Collectors.toMap(
			        Function.identity(),
			        Function.identity()
			    ));
			// {1=1, 2=2, 3=3, 4=4, 5=5}
			 
			Map<Integer, String> map2 = Stream.of(1, 2, 3)
			    .collect(Collectors.toMap(
			        Function.identity(),
			        i -> String.format("%d * 2 = %d", i, i * 2)
			    ));
			// {1="1 * 2 = 2", 2="2 * 2 = 4", 3="3 * 2 = 6"}
			 
			Map<Character, String> map3 = Stream.of(50, 54, 55)
			    .collect(Collectors.toMap(
			        i -> (char) i.intValue(),
			        i -> String.format("<%d>", i)
			    ));
			// {'2'="<50>", '6'="<54>", '7'="<55>"}
		
			//пример с сортировкой
			Stream.of(23,4,34,5,45,3,34,-33,434,-22)
			.sorted(Comparator.reverseOrder())
			.map(x -> x.toString() + " ")
			.forEach(System.out::print);
		
		int [] arr =  list.stream().mapToInt(el->el).filter(el->(el<3)).toArray();
		Arrays.stream(arr).forEach(System.out::println);
		
		
		Stream<Integer> strInt = Stream.of(12,23,4,3,4,5,6,34);
		int a = strInt.reduce(0,(sum,el)->(sum+el));
		System.out.println(a);
		Stream<Integer> intArr = Stream.generate(()->((int)(Math.random()*10))).limit(1000);
		
		Double zz = intArr.mapToInt(el->(int)el).average().getAsDouble();
		
		System.out.println(Integer.parseInt("a1".substring(1)));
//		long res = intArr.filter((el)->(el==0)).count();
//		System.out.println(res);
		String strS = "ddsf,ffdf,dfd,fd,fdf"; 
		String[] sss = Stream.of(strS).flatMap(el->Arrays.asList(el.split(",")).stream()).toArray(String[]::new);
		Stream.of(sss).peek(System.out::println).toArray();
		
	}
	
}
