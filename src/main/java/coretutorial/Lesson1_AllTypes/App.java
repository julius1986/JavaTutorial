package coretutorial.Lesson1_AllTypes;

public class App {

	public static void main(String[] args) {
		/* В Java есть по сути 2 типа данных это римитивы и ссылочные. 
		 * Примитивы делятся на числовые, так же есть типы обертки, они дублируют примитивы
		 * только уже как ссылочные*/
		
		/* ----примитивные типы -----*/
		//целочисленные типы
		byte byteValue;  //2^8   -128  --- 127 выделяется 1 бит
		short shortValue;//2^16
		int intValue;    //2^32  -2147483648 --- 2147483647 
		long longValue;  //2^64  -9223372036854775808 --- 9223372036854775807
		char charValue; //2^16 можно присвоить символ, используя одинарные кавычки. 
		//примитивы с плавающей точкой
		float floatValue; //2^32
		floatValue = 33.13f;
		double doubleValue; //2^64
		doubleValue = 33.22;
		//логические 
		boolean boolValue;
		
		longValue = 1_000_000L;//нововвединя можно использовать нижнее подчеркивание
		charValue = 65; //выведет символ A
		charValue = 'V'; // выведет символ V
		int a = (int)charValue; // 86 это номер символа V
		
		longValue = Long.MAX_VALUE;
		
		/*ссылочные типы*/
		//Ссылочные типы пишутся с большой буквы.
		Byte byteVla;
		Short shortVla;
		Integer integerVla;
		Long longVla;
		Character characterVla;
		Float floatVla;
		Double doubleVla;
		Boolean booleanVla;
		String stringVal;
	}

}
