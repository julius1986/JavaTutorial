package patterns.decorator.with_class_decorator;

public class MiddleJavaDeveloper extends DeveloperDecorator {

	public MiddleJavaDeveloper(IDeveloperJava developer) {
		super(developer);
	}

	public String makeCodeReview() {
		return "Make code review.";
	}

	@Override
	public String makeJob() {
		return super.makeJob() + " " + this.makeCodeReview();
	}

}
