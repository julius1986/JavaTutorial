package patterns.singleton;

/*
 Одиночка — это порождающий паттерн, который гарантирует существование только одного объекта 
 определённого класса, а также позволяет достучаться до этого объекта из любого места программы.
 
 Обычно в классе есть статистическое поле для сущности и статистический метод для получения 
 этой сущности, а так же приватный конструктор.
 
 Намного проще использовать глобальные переменные public final static someVar = ...;
 */
//final - значи что класс нельзя наследовать, необязательно использовать final.
public final class Singleton {
	// сущность которая должна создаваться 1 раз
	private static Singleton singleton;
	// поля нашей сущности
	private Integer someInt;
	private String someString;
	private Object someObject;

	// конструктор, который выполняется 1 раз, можно использовать пустой конструктор
	private Singleton(Integer someInt, String someString, Object someObject) {
		this.someInt = someInt;
		this.someString = someString;
		this.someObject = someObject;
	}

	// публичный метод для получения нашей сущности с заданными параметрами
	public static Object getInstance(Integer someInt, String someString, Object someObject) {
		if (singleton != null) {
			return singleton;
		} else {
			return new Singleton(someInt, someString, someObject);
		}
	}

	public Integer getSomeInt() {
		return someInt;
	}

	public void setSomeInt(Integer someInt) {
		this.someInt = someInt;
	}

	public String getSomeString() {
		return someString;
	}

	public void setSomeString(String someString) {
		this.someString = someString;
	}

	public Object getSomeObject() {
		return someObject;
	}

	public void setSomeObject(Object someObject) {
		this.someObject = someObject;
	}

}
