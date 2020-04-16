package com.company;

import java.util.*;

//Чтобы это завелось, мне пришлось в папке "src" создать "package" с названием "com.company" и "Main" превратить в "Solution_norm", т.к. IDE (Eclipse) жаловалась на всё это дело.
public class Solution_norm
{
    private static final Scanner scanner = new Scanner(System.in);
    /*static void func1(int arr[])
    {
    	
    }*/
    public static int get_cNcount(int arr[], int cN)
	{
    	//Считаем отрицательные.
    	for(int i = 0 ; i < 15 ; i++)
    	{
    		if(arr[i] < 0)
    		{
    			cN++;
    			System.out.println("Элемент arr[" + i + "] = " + arr[i] + " < 0, поэтому идёт в счёт отрицательных!" );
    		}
    	}
    	return cN;
	}
    public static int get_cZcount(int arr[], int cZ)
	{
    	//Считаем нулевые.
    	for(int i = 0 ; i < 15 ; i++)
    	{
    		if(arr[i] == 0)
    		{
    			cZ++;
    			System.out.println("Элемент arr[" + i + "] = " + arr[i] + " = 0, поэтому идёт в счёт нулевых!" );
    		}
    	}
    	return cZ;
	}
    public static int get_cPcount(int arr[], int cP)
	{
    	//Считаем положительные.
    	for(int i = 0 ; i < 15 ; i++)
    	{
    		if(arr[i] > 0)
    		{
    			cP++;
    			System.out.println("Элемент arr[" + i + "] = " + arr[i] + " > 0, поэтому идёт в счёт положительных!" );
    		}
    	}
    	return cP;
	}
    //Я долго мучился, ибо выводило всегда 0.0 и дело было даже не в округлении. Не хватало (double) перед интовыми значениями.
    //И если Object Pascal без раздумий делал что угодно с двумя интами (ему главное, чтобы результат был именно double), то
    //Java начала молча капризничать. Хотя проблемы с вычислениями были и в Java Script (чего стоит пример, когда 1 + 2 даёт 12)...
    public static double get_normN(int n, int cN, double NcN)
    {
    	OperationableA operation_delenie;
    	operation_delenie = (a,b) -> a/b;
    	NcN = operation_delenie.calculate((double)cN,(double)n);
    	return Math.round(NcN * 1000000.0) / 1000000.0;
    }
    public static double get_normZ(int n, int cZ, double NcZ)
    {
    	OperationableA operation_delenie;
    	operation_delenie = (a,b) -> a/b;
    	NcZ = operation_delenie.calculate((double)cZ,(double)n);
    	return Math.round(NcZ * 1000000.0) / 1000000.0;
    }
    public static double get_normP(int n, int cP, double NcP)
    {
    	OperationableA operation_delenie;
    	operation_delenie = (a,b) -> a/b;
    	NcP = operation_delenie.calculate((double)cP,(double)n);
    	return Math.round(NcP * 1000000.0) / 1000000.0;
    }
    //Чтобы не потеряться, здесь лежит "main"...
    public static void main(String[] args)
    {
    	System.out.println("Номер варианта = 15, значит столько же будет элементов массива:");
    	//Не имеет смысла давать юзеру свободу над вводом, так как уже есть вариант = 15.
        int n = 15;
        //Инициализация количества положительных, нулевых и отрицательных элементов.
        int cP = 0, cZ = 0, cN = 0;
        //Инициализация нормализованного коэффициента 
        double NcP = 0.00, NcZ = 0.00, NcN = 0.00;
        int[] arr = new int[n];
        System.out.println("Введите элементы массива через пробел. Помните, что их должно быть ровно 15!");
        String[] arrItems = scanner.nextLine().split(" ");
        System.out.println("Нажмите [Enter]...");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        try
	    {
	        for (int i = 0; i < n; i++)
	        {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }
        }
        catch(NullPointerException e)
        {
        	//Без обработчика исключений приложение тупо ложиться "поспать" каждый раз, когда ему плохеет.
        	//А так она продолжает работу как ни в чём не бывало. Например, при вводе 10-ти членов массива из 15-ти,
        	//приложение просто забивает оставшиеся члены нулями. В какой-то степени, это удобно.
        	//System.out.println(e.getMessage());
        	System.out.println("Так как вы ввели не 15 чисел, то приложение может работать неисправно и сломать результат...");
        }
        finally
        {
	        //Deprecated...
	        //func1(arr);
	        //Логирование выполнения...
	        cN = get_cNcount(arr,cN);
	        cZ = get_cZcount(arr,cZ);
	        cP = get_cPcount(arr,cP);
	        System.out.println("Количество отрицательных членов массива = " + cN + ";");   
	        System.out.println("Количество нулевых членов массива = " + cZ + ";");
	        System.out.println("Количество положительных членов массива = " + cP + ";");
	        System.out.println("||||||||||...загрузка...||||||||||");
	        NcN = get_normN(n,cN,NcN);
	        NcZ = get_normZ(n,cZ,NcZ);
	        NcP = get_normP(n,cP,NcP);
	        System.out.println("Нормализованное число отрицательных членов массива = " + NcN + ";");
	        System.out.println("Нормализованное число нулевых членов массива = " + NcZ + ";");
	        System.out.println("Нормализованное число положительных членов массива = " + NcP + ";");
	        scanner.close();
        }
    }
    //Лямбда-функция вида:
    //"OperationableA operation_delenie;
	//operation_delenie = (a,b) -> a/b;"
    //Нужна для деления в отдельном потоке.
    interface OperationableA
	{
	    double calculate(double a,double b);
	}
}