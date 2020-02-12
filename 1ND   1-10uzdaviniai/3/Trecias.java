import java.util.Scanner;

 class Trecias 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Pirmas skaicius: ");
		int a = input.nextInt();
		System.out.print("Antras skaicius: ");
		int b = input.nextInt();
		int d = (a/b);
		System.out.println();
		System.out.println("The division of a and b is:" +d);
	}
}