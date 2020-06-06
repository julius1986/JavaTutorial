package patterns.decorator.with_class_decorator;


/*
 * Основной класс, возможности которого мы будем расширять.
 * */
public class JavaDeveloper implements IDeveloperJava {

	@Override
	public String makeJob() {
		return "Make Java code.";
	}
	
}
