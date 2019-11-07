package coretutorial.Lesson11_Java8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
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
