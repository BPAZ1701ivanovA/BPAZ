import java.io.*;
import java.util.*;
import java.math.*;

public class Solution_sum
{
	//�������, ������� ������ ������� �����...
    static long aSum(long[] b, int arCount, long result)
    {
		for(arCount = 0 ; arCount<5 ; arCount++)
		{
			result += b[arCount];
		}
		//����� ����� ����������.
		return result;
    }
    //������...
    public static int setCount(int n)
    {
    	if (n > 0 && n < 11)
    	{
    		return n;
    	}
    	else
    	//��� ����� ������� ������ (���� �� ��� ��� ����� �������� = 1000 � �.�.) ����� ���� �� ������� �����-������ ����, ������� ��������� ������� �� 10 �� ��� ���, ���� ������� �� ���� �� �������������.
    	{
    	    System.out.println("��� ��� ����� �������� = 15, �� ��� ������� ������ 10, ����� �������� ���������� ���� ������ 10-��!");
    	    n = n - 10;
    	    return n ;
    	}
    }
    //������...
    public static int getCount(int arCount)
    {
    	return arCount;
    }
    //��� ������� ������������, ��� � ���� ���������� �������� ���.
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));
      //����� ����� ��������.
    	int n = 15;
        //������������ ���������� ���� ����� ������.
        int arCount = setCount(n);
        //������������� ���������� ��� ������� ����������.
        long result = 0;        
        long[] b = new long[arCount];
        System.out.println("������� ���� ����� ����� ������. ����� ����� ����� ������������������ ������� [Enter] ��� ���� ��� �������������.");
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //���� �������� ��������� �������.
        for(int i = 0; i < arCount ; i++)
        {
            long arItem = Long.parseLong(arItems[i]);
            b[i] = arItem;
        }
        //����� ���������� ���� ����� ������.
        System.out.println("���������� ����� � �������: " + getCount(arCount));
        System.out.print("���� �����: ");
        System.out.println(b[0] + ", " + b[1] + ", " + b[2] + ", " + b[3] + ", " + b[4]);
        //������� ����� ���� ���� ����� �������.
        result = aSum(b, arCount, result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.close();
        System.out.println("�� ����� �����: " + result + ". ����� ��� ���� �������� � ��������� ���� <out.txt>.");
    }
}