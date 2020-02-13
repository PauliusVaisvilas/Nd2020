public class PirmoPirmas
{
	public static void main(String[] args)
	{
		char result = 'n';
		
		int[] sequention = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < sequention.length; i++) 
		
		if (sequention[0] > sequention[9])
		{
			result = '-';
		}
		else if (sequention[0] < sequention[9])
		{
			result = '+';
		}
			System.out.println("zenklas + reiskia dideja / zenklas - reiskia kad mazeja" );
			System.out.println(result);
	}
}