package patterns.decorator.simple;

public class CppTeamLeader implements IDeveloperCpp {

	private IDeveloperCpp developer;
	
	public CppTeamLeader(IDeveloperCpp developer) {
		this.developer = developer;
	}

	private String sendWeekReview() {
		return "Send week review.";
	}
	
	@Override
	public String makeJob() {
		return developer.makeJob() + " " + this.sendWeekReview();
	}

}
