import java.io.*;
import java.util.*;
import java.math.*;

public class Solution_sum
{
	//Функция, которая делает подсчёт суммы...
    static long aSum(long[] b, int arCount, long result)
    {
		for(arCount = 0 ; arCount<5 ; arCount++)
		{
			result += b[arCount];
		}
		//Здесь вывод результата.
		return result;
    }
    //Сеттер...
    public static int setCount(int n)
    {
    	if (n > 0 && n < 11)
    	{
    		return n;
    	}
    	else
    	//Для более сложной задачи (если бы там был номер варианта = 1000 и т.д.) нужно было бы сделать какой-нибудь цикл, который постоянно отнимал бы 10 до тех пор, пока условие не было бы удовлетворено.
    	{
    	    System.out.println("Так как номер варианта = 15, то нам придётся отнять 10, чтобы получить количество цифр меньше 10-ти!");
    	    n = n - 10;
    	    return n ;
    	}
    }
    //Геттер...
    public static int getCount(int arCount)
    {
    	return arCount;
    }
    //Его придётся использовать, ибо к нему отсылается исходный код.
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));
      //Номер моего варианта.
    	int n = 15;
        //Присваивание количества цифр через сеттер.
        int arCount = setCount(n);
        //Инициализация результата для будущих вычислений.
        long result = 0;        
        long[] b = new long[arCount];
        System.out.println("Введите ваши числа через пробел. После ввода вашей последовательности нажмите [Enter] два раза для подтверждения.");
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //Ввод значений элементов массива.
        for(int i = 0; i < arCount ; i++)
        {
            long arItem = Long.parseLong(arItems[i]);
            b[i] = arItem;
        }
        //Вывод количества цифр через геттер.
        System.out.println("Количество чисел в массиве: " + getCount(arCount));
        System.out.print("Сами числа: ");
        System.out.println(b[0] + ", " + b[1] + ", " + b[2] + ", " + b[3] + ", " + b[4]);
        //Подсчёт суммы всех цифр через функцию.
        result = aSum(b, arCount, result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.close();
        System.out.println("Их сумма равна: " + result + ". Также она была записана в текстовый файл <out.txt>.");
    }
}