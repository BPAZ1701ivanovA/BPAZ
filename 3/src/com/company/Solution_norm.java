package com.company;

import java.util.*;

//����� ��� ��������, ��� �������� � ����� "src" ������� "package" � ��������� "com.company" � "Main" ���������� � "Solution_norm", �.�. IDE (Eclipse) ���������� �� �� ��� ����.
public class Solution_norm
{
    private static final Scanner scanner = new Scanner(System.in);
    /*static void func1(int arr[])
    {
    	
    }*/
    public static int get_cNcount(int arr[], int cN)
	{
    	//������� �������������.
    	for(int i = 0 ; i < 15 ; i++)
    	{
    		if(arr[i] < 0)
    		{
    			cN++;
    			System.out.println("������� arr[" + i + "] = " + arr[i] + " < 0, ������� ��� � ���� �������������!" );
    		}
    	}
    	return cN;
	}
    public static int get_cZcount(int arr[], int cZ)
	{
    	//������� �������.
    	for(int i = 0 ; i < 15 ; i++)
    	{
    		if(arr[i] == 0)
    		{
    			cZ++;
    			System.out.println("������� arr[" + i + "] = " + arr[i] + " = 0, ������� ��� � ���� �������!" );
    		}
    	}
    	return cZ;
	}
    public static int get_cPcount(int arr[], int cP)
	{
    	//������� �������������.
    	for(int i = 0 ; i < 15 ; i++)
    	{
    		if(arr[i] > 0)
    		{
    			cP++;
    			System.out.println("������� arr[" + i + "] = " + arr[i] + " > 0, ������� ��� � ���� �������������!" );
    		}
    	}
    	return cP;
	}
    //� ����� �������, ��� �������� ������ 0.0 � ���� ���� ���� �� � ����������. �� ������� (double) ����� �������� ����������.
    //� ���� Object Pascal ��� �������� ����� ��� ������ � ����� ������ (��� �������, ����� ��������� ��� ������ double), ��
    //Java ������ ����� ������������. ���� �������� � ������������ ���� � � Java Script (���� ����� ������, ����� 1 + 2 ��� 12)...
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
    //����� �� ����������, ����� ����� "main"...
    public static void main(String[] args)
    {
    	System.out.println("����� �������� = 15, ������ ������� �� ����� ��������� �������:");
    	//�� ����� ������ ������ ����� ������� ��� ������, ��� ��� ��� ���� ������� = 15.
        int n = 15;
        //������������� ���������� �������������, ������� � ������������� ���������.
        int cP = 0, cZ = 0, cN = 0;
        //������������� ���������������� ������������ 
        double NcP = 0.00, NcZ = 0.00, NcN = 0.00;
        int[] arr = new int[n];
        System.out.println("������� �������� ������� ����� ������. �������, ��� �� ������ ���� ����� 15!");
        String[] arrItems = scanner.nextLine().split(" ");
        System.out.println("������� [Enter]...");
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
        	//��� ����������� ���������� ���������� ���� �������� "�������" ������ ���, ����� ��� �������.
        	//� ��� ��� ���������� ������ ��� �� � ��� �� ������. ��������, ��� ����� 10-�� ������ ������� �� 15-��,
        	//���������� ������ �������� ���������� ����� ������. � �����-�� �������, ��� ������.
        	//System.out.println(e.getMessage());
        	System.out.println("��� ��� �� ����� �� 15 �����, �� ���������� ����� �������� ���������� � ������� ���������...");
        }
        finally
        {
	        //Deprecated...
	        //func1(arr);
	        //����������� ����������...
	        cN = get_cNcount(arr,cN);
	        cZ = get_cZcount(arr,cZ);
	        cP = get_cPcount(arr,cP);
	        System.out.println("���������� ������������� ������ ������� = " + cN + ";");   
	        System.out.println("���������� ������� ������ ������� = " + cZ + ";");
	        System.out.println("���������� ������������� ������ ������� = " + cP + ";");
	        System.out.println("||||||||||...��������...||||||||||");
	        NcN = get_normN(n,cN,NcN);
	        NcZ = get_normZ(n,cZ,NcZ);
	        NcP = get_normP(n,cP,NcP);
	        System.out.println("��������������� ����� ������������� ������ ������� = " + NcN + ";");
	        System.out.println("��������������� ����� ������� ������ ������� = " + NcZ + ";");
	        System.out.println("��������������� ����� ������������� ������ ������� = " + NcP + ";");
	        scanner.close();
        }
    }
    //������-������� ����:
    //"OperationableA operation_delenie;
	//operation_delenie = (a,b) -> a/b;"
    //����� ��� ������� � ��������� ������.
    interface OperationableA
	{
	    double calculate(double a,double b);
	}
}