import java.util.Scanner;

class Sestas
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Parasykite skaiciu: ");
	int num1 = in.nextInt();
	
	System.out.print("Parasykite kita skaiciu: ");
	int num2 = in.nextInt();
	
	System.out.println(num1 + " + " + num2 + " = " + 
	(num1 + num2));
   
	System.out.println(num1 + " - " + num2 + " = " + 
	(num1 - num2));
   
	System.out.println(num1 + " x " + num2 + " = " + 
	(num1 * num2));
   
	System.out.println(num1 + " / " + num2 + " = " + 
	(num1 / num2));
 
	System.out.println(num1 + " mod " + num2 + " = " + 
	(num1 % num2));
 }
 
}