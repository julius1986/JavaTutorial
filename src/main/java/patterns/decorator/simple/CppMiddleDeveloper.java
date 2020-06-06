package patterns.decorator.simple;

public class CppMiddleDeveloper implements IDeveloperCpp {

	private IDeveloperCpp developer;

	public CppMiddleDeveloper(IDeveloperCpp developer) {
		this.developer = developer;
	}

	private String makeCodeReview() {
		return "Make code review.";
	}
	
	@Override
	public String makeJob() {
		return developer.makeJob() + " " + this.makeCodeReview();
	}

}
