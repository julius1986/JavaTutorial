package coretutorial.Lesson1_AllTypes;

public class App {

	public static void main(String[] args) {
		/* В Java есть по сути 2 типа данных это римитивы и ссылочные. 
		 * Примитивы делятся на числовые, так же есть типы обертки, они дублируют примитивы
		 * только уже как ссылочные*/
		
		/* ----примитивные типы -----*/
		//целочисленные типы
		byte byteValue;  // -128  --- 127
		int intValue;    // -2147483648 --- 2147483647
		long longValue;  // -9223372036854775808 --- 9223372036854775807
		//примитивы с плавающей точкой
		float floatValue;
		double doubleValue;
		//символьный тип
		char charValue;
		
		longValue = Long.MAX_VALUE;
		System.out.println(longValue);
	}

}
