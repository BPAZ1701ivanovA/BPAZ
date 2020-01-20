import java.io.*;

public class Solution {
	/*
	* ����: y - ���; 1700 <= y <= 2700
	* ������� ���� ������������ � ���� ����. 256 ����.
	* ���������, ��� � ���� ������ ��������� ����� ��������� � 1918 ����, ����� 31 ������ ������� 14 
	* �������. � ����� ���������� ��������� ���������� ����, ����� ������ 29 �������.
	* � ��������� ��������� ���������� ���� ������ 4. � ������������� ��-�������� ���������� ��������� ���, 
	* ����� �������� ������ ������, �� ���������� �������� ��� ���, ������� ���� ������ 100. ����� ���� ���� ����������� 
	* ������ �����, ����� �������� ��� � �� 400.
	*/
  
    
	static String func1(int year) {
        String a = null;
        
        
        if ((year > 1918) && (year != 1918) ) {
            if (((year % 4 == 0)&&(year % 100 != 0)&&(year % 400!=0))||(year % 400==0)) {
                a = "12.09." + year;
            } else {
                a = "13.09."+ year;
            }
        }else if ((year < 1918)&&(year !=1918) ) {
            if (year % 4 == 0)  {
                a = "12.09."+ year;
            } else {
                a = "13.09."+ year;
            }
        }
        
        if (year==1918)
            a = "26.09."+ year;
        
        return  a;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt")); //System.getenv("OUTPUT_PATH"))

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = func1(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

        System.out.println(result);
    }
}