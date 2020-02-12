import java.util.Scanner;
public class Trecias {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Parasykite pirma skaiciu: ");
	int num1 = in.nextInt();
	
	System.out.print("Parasykite antra skaiciu: ");
	int num2 = in.nextInt();
	
	System.out.print("Parasykite trecia skaiciu: ");
	int num3 = in.nextInt();
	
	
		if (num1 > num2)
		 if (num1 > num3)
		  System.out.println("Didziausias skaicius: " + num1);
		  
		if (num2 > num1)
		 if (num2 > num3)
		  System.out.println("Didziausias skaicius: " + num2);
   
		if (num3 > num1)
		 if (num3 > num2)
		  System.out.println("Didziausias skaicius: " + num3);
 }
}