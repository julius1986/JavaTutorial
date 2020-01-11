package coretutorial.Lesson5_Switch;

public class Main {
	public static void main(String[] args) {
		
		//при совпадении кейса будет выполнен код, если не прописывать break, то 
		//будут выполнены все кейсы ниже совпавшего кейса
		
		int theCase = 22;
		switch(theCase) {
		case 22:
			System.out.println("22");
			break;//если не пропишем то выполнится кейс ниже
		case 33:
			System.out.println("33");
			break;
		}			
	}
}
