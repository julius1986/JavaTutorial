package coretutorial.Lesson12_Loops;

public class Main {
	public static void main(String[] args) {
		
		int[] intArray = new int[20]; //если не проинициализировали то значения равны 0
		//while(условие){действия} выполняется до тех пор пока условие выполняется 
		int a = 0;
		while(a < 10 ) {
			System.out.println(" while(){} loop, a = " + a);
			a++;
		}
		
		//do{действия}while(условие) аналогиен предыдущему, только сначала выполняется
		//блок с действиями, а затем блок с действиями
		a = 0;
		do {
			System.out.println("doP{}while() loop, a = " + a);
			a++;
		}while(a < 10);
		
		//более компактый способ записи while(){} использование for
		//for(инициализация; условие; инкремент){блок действий}
		for(int i = 0; i < 10; i++) {
			System.out.println("for loop, i = " + i);
		}
		
		//foreach в Java. Позволяет перебирать итерабельные коллекции и массивы.
		//forach не подходит для изменения обьектов и удаления
		//Должны имлементировать интерфейсы Itrable и Iterator
		for(int val : intArray) {
			System.out.println("foreach, i: " + val);
		}
		
		
	}
}
