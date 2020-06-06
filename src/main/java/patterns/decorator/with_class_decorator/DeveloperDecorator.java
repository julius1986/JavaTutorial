package patterns.decorator.with_class_decorator;

/* 
 * Декоратор служит для:
 * - динамического добавления/удаления функционала обьекта.
 * - используется если нет возможности расширить класс.
 * 
 * */

public class DeveloperDecorator implements IDeveloperJava {
	private IDeveloperJava developer;
	
	public DeveloperDecorator(IDeveloperJava developer) {
		this.developer = developer;
	}

	@Override
	public String makeJob() {
		return developer.makeJob();
	}	
}
