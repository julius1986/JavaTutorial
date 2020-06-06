package patterns.decorator.with_class_decorator;

public class JavaTeamLeader extends DeveloperDecorator {
	
	public JavaTeamLeader(IDeveloperJava developer) {
		super(developer);
	}

	public String sendWeekReport() {
		return "Send week report.";
	}
	
	@Override
	public String makeJob() {
		return super.makeJob() + " " + sendWeekReport();
	}

}
