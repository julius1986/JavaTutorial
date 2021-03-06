package coretutorial.Lesson6_Arrays;

/*
 * Массивы в Java бывают одномерные и многомерные. Для массивов всегда надо указывать 
 * длину массива. 
 * Одномерные массивы - имеют фиксированную длину
 * Многомерные массивы - это массив в массиве, так же должны иметь фиксированную длину.
 * */

public class Arrays {
	public static void main(String[] args) {
		//*** ОДНОМЕРНЫЕ МАССИВЫ ***
		//массивы можно обьявлять двумя способами.
		int [] arr1 = new int[20]; // длина массива 20
		// по умолчанию заполняется 0, для ссылочных заполняется null
		int arr2[] = new int[20]; 
		
		arr1[0] = 33;
		System.out.println(arr1.length); // 20
		
		//*** МНОГОМЕРНЫЕ МАССИВЫ ***
		//длина многомерного массива равно n*m
		int [][] arr3 = new int [3][2]; //длина будет равна 3*2 = 6
		//так же мы можем сами инициализировать массив
		//это аналог того что мы написали выше, только уже заполненый
		int [][] arr4 = new int [][] {{1,2},{3,4},{5,6}};
		System.out.println(arr4[1][1]); // 4
		System.out.println(arr4[0][1]); // 2
	
	}
}
