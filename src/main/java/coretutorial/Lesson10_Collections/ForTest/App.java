package coretutorial.Lesson10_Collections.ForTest;

public class App {

	public static void main(String[] args) {
		Utils.generateNewIntArray(2000000, 0, 20);

		
		
		MapExample me = new MapExample();
		me.startExample();
		
		ArrayListExample le = new ArrayListExample(Utils.getIntArray());
		le.startExample();
	}

}
