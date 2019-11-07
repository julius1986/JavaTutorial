package coretutorial.Lesson10_Collections.ForTest;

public class Utils {
	private static int[] arrayOfInt;

	public static int[] generateNewIntArray(int numbersOfElements, int from, int to) {
		arrayOfInt = new int[numbersOfElements];
		for (int i = 0; i < numbersOfElements; i++) {
			arrayOfInt[i] = generateNumber(from, to);
		}
		return arrayOfInt;
	}

	public static int[] getIntArray() {
		return arrayOfInt;
	}
	
	private static int generateNumber(int from, int to) {
		return (int) (Math.round(Math.random() * (to - from) + from));
	}

}
