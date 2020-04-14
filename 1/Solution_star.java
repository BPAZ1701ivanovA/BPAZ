//Моя IDE (Eclipse) пожелала, чтобы я переименовал этот класс.
public class Solution_star
{
	//Так как мой вариант = 15, то нет смысла парсить ввод пользователя.
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