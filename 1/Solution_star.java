//��� IDE (Eclipse) ��������, ����� � ������������ ���� �����.
public class Solution_star
{
	//��� ��� ��� ������� = 15, �� ��� ������ ������� ���� ������������.
	public static void main(String[] args)
	{
	    int n = 15;
	    for (int i = 1; i <= n; i++)
	    {
	    	for(int j = n; j >= i; j--)
	    	{
	    		System.out.print(" ");
	    	}
	        for (int k = i; k > 0; k--)
	        {
	        	System.out.print("#");
	        }  
	    System.out.println();
	    }
	}
}