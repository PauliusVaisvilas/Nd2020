import java.util.Scanner;

class Septintas 
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Parasykite skaiciu, o mes ji padauginsime 10kartu palaipsniui nuo 1 iki 10 ");
	int num1 = in.nextInt();
	
	for (int i=0; i<10; i++){
	System.out.println(num1 + " x " + (i+1) + " = " +
	(num1 * (i+1)));
	}
	}
}