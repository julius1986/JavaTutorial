package coretutorial.Lesson8_IOStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Yuliy on 17.12.2016.
 * Тут рассмотрим примеры ввода с клавиатуры.
 * Есть два способа через bufferReader(более сложный)
 * и через Scanner(проще и быстрее) так же сканер разбивает
 * введенную строку на слова, каждый пробел отдельное слово.
 */
public class MainProgramm {
    public static void main(String[] args) throws IOException {
        //тут мы создаем поток ввода с клавиатуры через Buffer
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        System.out.println("Test Buffer--------------------------");
        do
        {
            line = bufferedReader.readLine();
            System.out.println(line);
        }while (!line.equals("exit"));

        System.out.println("Test Scanner-------------------------");
        //тут создаем поток через Scanner. Отличие от Buffer в том
        //что Scanner разбивает строку на массив в котором будут
        //содержаться слова разделенные пробелом
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String tempResult = scanner.next();
            System.out.println(tempResult);
            if (tempResult.equals("exit"))
                break;
        }
    }

}
