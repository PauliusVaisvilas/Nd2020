import java.util.Scanner;
class Pirmas {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Parasykite skaiciu ");
		int input = in.nextInt();
		
		if (input > 0)
		{
			System.out.println("Skaicius teigiamas");			
		}
		else if (input < 0)
		{
			System.out.println("Skaicius neigiamas");			
		}	
		else
		{
			System.out.println("Skaicius yra 0");
		}
	}
}
	
